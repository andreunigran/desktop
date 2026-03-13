/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.app.persistence;

import br.unigran.models.Produto;
import java.util.List;

/**
 *
 * @author andre
 */
public interface InterfaceProdutoDao {
    /**
     * busca todos os produtos
     * @param o
     * @return 
     */
         public List findAllNativo(Produto o);

}
