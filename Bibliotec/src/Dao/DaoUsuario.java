/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Usuario;
import hibernate.HibernateDao;
import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoUsuario extends HibernateDao<Usuario>{
    
    public DaoUsuario(){
        c = Usuario.class;
    }
    public List<Usuario> retrieveByNome(String nome){
        return createNamedQuery("retrieveByNome").setParameter("nome", "%"+nome+"%").getResultList();
        
    }
    public List<Usuario> retrieveByCpf(String cpf){
        return createNamedQuery("retrieveByCpf").setParameter("cpf", "%"+cpf+"%").getResultList();
        
    }

    public List<Usuario> retrieveByNomeTodosUsuarios() {
        return createNamedQuery("retrieveListaTodosOsUsuarios").getResultList();
    }

    public List<Usuario> retrieveNomesTodosUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
