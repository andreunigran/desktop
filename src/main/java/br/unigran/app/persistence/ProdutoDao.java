package br.unigran.app.persistence;

import br.unigran.models.Produto;
import java.util.LinkedList;
import java.util.List;


public class ProdutoDao extends Dao implements InterfaceProdutoDao{
     public List findAllNativo(Produto o){
        List<Object[]> resultList = em.createNamedQuery("select  from "
                +o.getClass().getSimpleName()+" o ").getResultList();
        List retorno = new LinkedList();
       
        for (Object[] object : resultList) {
             Produto p = new Produto();
             p.setCodigo((Integer)object[0]);
             p.setDescricao(object[1].toString());
            
            retorno.add(p);
          }
        return retorno;
    }
}
