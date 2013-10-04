/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Funcionario;
import hibernate.HibernateDao;
import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoFucnionario extends HibernateDao<Funcionario> {

    public DaoFucnionario() {
        c = Funcionario.class;
    }

    public List<Funcionario> retrieveByNome(String nome) {
        return createNamedQuery("retrieveByNomeFuncionario").setParameter("nome", "%" + nome + "%").getResultList();

    }

    public List<Funcionario> retrieveByCpf(String cpf) {
        return createNamedQuery("retrieveByCpfFuncionario").setParameter("cpf", "%" + cpf + "%").getResultList();
    }

    public List<Funcionario> retrieveByNomeTodosFuncionarios() {
        return createNamedQuery("retrieveListaTodosFuncionarios").getResultList();
    }
}
