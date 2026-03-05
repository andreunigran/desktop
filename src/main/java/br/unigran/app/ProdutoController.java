package br.unigran.app;

import br.unigran.models.Produto;
import br.unigran.telascadastro.CadastroProduto;

public class ProdutoController {

Produto produto;
CadastroProduto cp;
    public ProdutoController(CadastroProduto cadastroProduto, Produto produto) {
        this.produto=produto;
        cp=cadastroProduto;
        cp.salvar(e->salvar());
    }

    public void salvar(){    
       produto.setCodigo(Integer.valueOf(cp.txtCodigo.getText()));
       produto.setDescricao(cp.txtNome.getText());
       produto.salvar();
       cp.dispose();
    }
}
