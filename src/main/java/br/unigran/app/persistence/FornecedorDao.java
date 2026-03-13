/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.app.persistence;

import br.unigran.models.Fornecedor;
import java.util.List;

/**
 *
 * @author andre
 */
public class FornecedorDao extends Dao implements InterfaceFornecedorDao{

    @Override
    public List<Fornecedor> buscaNome() {
        return em.createQuery("select o.nome from Fornecedor o ").getResultList();
    }
    
}
