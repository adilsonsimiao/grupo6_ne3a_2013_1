/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Editora;
import hibernate.HibernateDao;
import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoEditora extends HibernateDao<Editora>{
   public DaoEditora(){
       c = Editora.class;
   }
   public List<Editora> retrieveNome(){
        return createNamedQuery("retrieveNomeEditoras").getResultList();
        
    }
   
    public List<Editora> retrieveByNome(String nome){
        return createNamedQuery("retrieveIdEditoras").setParameter("nome", "%"+nome+"%").getResultList();
        
    }

    public List<Editora> retrieveListaDeNomes() {
        return createNamedQuery("retrieveListaTodasEditoras").getResultList();
    }
}
