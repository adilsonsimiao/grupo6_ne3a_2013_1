/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Editora;
import entidade.Emprestimo;
import hibernate.HibernateDao;
import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoEmprestimo extends HibernateDao<Emprestimo>{

    public DaoEmprestimo() {
        c = Emprestimo.class;
    }
    public List<Emprestimo> retrieveNome(String nome){
        return createNamedQuery("retrieveNomeLivroDeEmprestimo").setParameter("nome", "%"+nome+"%").getResultList();
        
    }
}
