package br.unigran.app.persistence;

import br.unigran.models.Produto;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("br.unigran_SystemaAula_jar_1.0-SNAPSHOTPU");
    EntityManager em=emf.createEntityManager();
    EntityTransaction etx=em.getTransaction();

    public Dao() {
//    emf= Persistence.createEntityManagerFactory("");
//    em=emf.createEntityManager();
//    etx=em.getTransaction();
    }
    public void salvar(Object o){
        etx.begin();
        em.persist(o);
        etx.commit();//opcional --por padrão ao commit  
    }
    public void salvarOuAtualiza(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();//opcional --por padrão ao commit  
    }
    public void remove(Object o){
        etx.begin();
        em.remove(o);
        etx.commit();//opcional --por padrão ao commit  
    }
    public <T>T findTemplate(T o){
        return (T) em.find(o.getClass(),o);
    }
    public Object findObject(Object o){
        return em.find(o.getClass(),o);
    }
    public List findAll(Object o){
        return em.createQuery("select o from "
                +o.getClass().getSimpleName()+" o ").getResultList();
    }
    public List findAllNativo(Object o){
        return em.createNamedQuery("select * from "
                +o.getClass().getSimpleName()+" o ",o.getClass()).getResultList();
    }
   
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
