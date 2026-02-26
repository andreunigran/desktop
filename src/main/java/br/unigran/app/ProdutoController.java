package br.unigran.app;

import br.unigran.models.Produto;
import br.unigran.telascadastro.CadastroProduto;

public class ProdutoController {
Produto produto;
CadastroProduto cp;

    public void ProdutoController(CadastroProduto cadastro, Produto produto) {
        this.produto=produto;
        cp=cadastro;
        cp.salvar(e->salvar());
    }
    
    public void salvar(){
        
       produto.setCodigo(Integer.parseInt(cp.txtCodigo.getText()));
       produto.salvar();
    }
}
