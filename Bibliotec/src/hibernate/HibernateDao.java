/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import Dao.Dao;
import Dao.Filter;
import static Dao.Operator.EQUAL;
import static Dao.Operator.IS_NULL;
import static Dao.Operator.LIKE;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fabio
 */
public class HibernateDao<E> implements Dao<E> {

    @Override
    public void persist(E o) throws Exception {

        EntityManager em = HibernateFactory.getEntityManager();
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();



    }

    @Override
    public void delete(E o) throws Exception {


        EntityManager em = HibernateFactory.getEntityManager();
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();

    }

    @Override
    public E retrieve(Class tipoObjeto, int id) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        em.getTransaction().begin();
        E e = (E) em.find(tipoObjeto, id);
        em.getTransaction().commit();

        return e;

    }

    @Override
    public List<E> list(String campoUnico, Class tipoObjeto, String nome, String whereClause, String orderClause) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        if (campoUnico.length() > 0) {

            em.getTransaction().begin();
            Query q = em.createNativeQuery("SELECT " + campoUnico + " FROM " + tipoObjeto.getSimpleName());
            em.getTransaction().commit();
            return q.getResultList();
        } else if (nome.length() > 0 || whereClause.length() > 0) {
            em.getTransaction().begin();
            Query q = em.createNativeQuery("SELECT * FROM " + tipoObjeto.getSimpleName()
                    + (whereClause == null || whereClause.trim().isEmpty() ? "" : " WHERE " + whereClause + " = '" + nome + "'")
                    + (orderClause == null || orderClause.trim().isEmpty() ? "" : " ORDER BY " + orderClause),tipoObjeto);
            em.getTransaction().commit();
            return q.getResultList();
        } else {
            em.getTransaction().begin();
            Query q = em.createQuery("FROM " + tipoObjeto.getSimpleName());
            em.getTransaction().commit();
            return q.getResultList();
        }

    }

    @Override
    public List<E> list(Class classe, Filter... filters) throws Exception {
        SessionFactory sessionFactory = HibernateConnection.HibernateConnection().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction().commit();
        List list = null;

        if (filters == null || filters.length == 0) {
            list = session.createCriteria(classe).add(Restrictions.like(null, classe)).list();
            return list;


        } else {
            String sql = "SELECT * FROM " + classe.getSimpleName() + " WHERE ";
            for (Filter f : filters) {
                System.out.println(f);
                switch (f.getOperator()) {
                    case IS_NULL:
                        list = session.createCriteria(classe).add(Restrictions.like(f.getAttribute(), f.getValue().toString(), MatchMode.EXACT)).list();

                        sql += f.getAttribute() + " IS NULL";
                        break;
                    case LIKE:
                        list = session.createCriteria(classe).add(Restrictions.like(f.getAttribute(), f.getValue().toString(), MatchMode.EXACT)).list();
                        sql += f.getAttribute() + " LIKE '%" + f.getValue() + "%'";
                        break;
                    case EQUAL:
                        list = session.createCriteria(classe).add(Restrictions.like(f.getAttribute(), f.getValue().toString(), MatchMode.EXACT)).list();

                        sql += f.getAttribute() + "='" + f.getValue() + "'";
                        break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
            }

        }
        session.close();

        return list;



    }

}
