/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author fabio
 */
public class HibernateDao<E> implements Dao<E> {

    protected static Class c;

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
    public E retrieve(int id) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        em.getTransaction().begin();
        E e = (E) em.find(c, id);
        em.getTransaction().commit();
        return e;
    }

    @Override
    public List<E> list() throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("FROM "+c.getSimpleName());
        List<E> result = q.getResultList();
        em.getTransaction().commit();
        return result;
    }
    
    public Query createQuery(String query){
        EntityManager em = HibernateFactory.getEntityManager();
        return em.createQuery(query);
    }
    public Query createNamedQuery(String queryName){
        EntityManager em = HibernateFactory.getEntityManager();
        return em.createNamedQuery(queryName);
    }
    public Query createNativeQuery(String query){
        EntityManager em = HibernateFactory.getEntityManager();
        return em.createNativeQuery(query);
    }   
}
