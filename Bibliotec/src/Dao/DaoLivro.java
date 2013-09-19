/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Autor;
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
    public List<Autor> retrieveNomeLivro(String nome){
        return createNamedQuery("retrieveByNomeAutor").setParameter("nome", "%"+nome+"%").getResultList();
        
    }
}
