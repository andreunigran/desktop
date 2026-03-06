package br.unigran.app;

import br.unigran.models.Cliente;

public class ClienteController {
    public void salvar(Integer codigo,String nome[]){
        Cliente cliente = new Cliente(codigo, "", "", "", "", "");
        cliente.salvar();
       
    }
}
