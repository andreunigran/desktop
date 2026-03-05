package br.unigran.models;

import br.unigran.app.persistence.Dao;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cliente")
//Table(schema = "public",name = "cliente")
public class Cliente extends Dao implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
@Column(name = "nome")
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Cliente() {
    }

    public Cliente(Integer codigo, String nome, String cpf, String telefone, String email, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void salvar() {
       salvar(this);
    }
}
