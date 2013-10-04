/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Livro;
import hibernate.HibernateDao;
import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoLivro extends HibernateDao<Livro>{
    public DaoLivro(){
        c = Livro.class;
    }
    public List<Livro> retrieveNomeLivros(String nome){
        return createNamedQuery("retrieveByNomeLivros").setParameter("nome", "%"+nome+"%").getResultList();
        
    }
    public List<Livro> retrieveNomeAutores(String nome){
        return createNamedQuery("retrieveByNomeAutores").setParameter("nome", "%"+nome+"%").getResultList();
        
    }

    

    public List<Livro> retrieveTodosOsNomesDeLivros() {
        return createNamedQuery("retrieveListaTodosLivros").getResultList();
    }
}
