package br.unigran.app;

import br.unigran.models.Cliente;

public class ClienteController {
    public void salvar(Integer codigo,String nome,String cpf,String telefone,String email,String endereco){
        Cliente cliente = new Cliente(codigo, nome, cpf, telefone, email, endereco);
        cliente.salvar();
       
    }
}
