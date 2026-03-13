package br.unigran.app;

import br.unigran.app.persistence.FornecedorDao;
import br.unigran.models.Fornecedor;
import br.unigran.models.Produto;
import br.unigran.telascadastro.CadastroProduto;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ProdutoController {

Produto produto;
CadastroProduto cp;

    public ProdutoController() {
         produto=new Produto();
    }

    public ProdutoController(CadastroProduto cadastroProduto, Produto produto) {
        this.produto=produto;
        cp=cadastroProduto;
        
        FornecedorDao fd = new FornecedorDao();
        cp.txtFornecedor.setModel(new DefaultComboBoxModel(fd.buscaNome().toArray()));
        
        
        cp.salvar(e->salvar());
    }

    public void salvar(){    
       produto.setCodigo(Integer.valueOf(cp.txtCodigo.getText()));
       produto.setDescricao(cp.txtNome.getText());
       produto.setFornecedor((Fornecedor) cp.txtFornecedor.getSelectedItem());
       produto.salvar();
       
       cp.dispose();
    }
    public List<Produto> listarTodos(){    
     return produto.findAll(produto);
    }
    public DefaultTableModel atualizaTabela(){
    List<Produto> l = listarTodos();
        String[] titulo = new String[]{"Codigo","Nome","Fornecedor"};
        Object[][] data = new Object[l.size()][titulo.length];
        for (int i = 0; i < l.size(); i++) {
            data[i][0]=l.get(i).getCodigo();
            data[i][1]=l.get(i).getDescricao();
            data[i][2]=l.get(i).getFornecedor().getNome();

        }     
       return new DefaultTableModel(data,
                       titulo);
     }
}
