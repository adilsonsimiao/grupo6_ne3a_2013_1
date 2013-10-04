/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Autor;
import hibernate.HibernateDao;
import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoAutor extends HibernateDao<Autor>{
    public DaoAutor(){
        c = Autor.class;
    }
    public List<Autor> retrieveNome(){
        return createNamedQuery("retrieveNomeAutores").getResultList();
        
    }
    public List<Autor> retrieveNomeAutor(String nome){
        return createNamedQuery("retrieveByNomeAutor").setParameter("nome", "%"+nome+"%").getResultList();
        
    }
    public List<Autor> retrieveAutorByNomeLivro(String nome){
        return createNamedQuery("retrieveAutorByNomeLivro").setParameter("nome", "%"+nome+"%").getResultList();
        
    }

    public List<Autor> retrieveTodosAutores() {
        return createNamedQuery("retrieveListaTodosAutores").getResultList();
    }
    
}
