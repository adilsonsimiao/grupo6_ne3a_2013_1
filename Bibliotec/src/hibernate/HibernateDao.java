/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import Dao.Dao;
import Dao.Filter;
import Dao.Operator;
import static Dao.Operator.EQUAL;
import static Dao.Operator.IS_NULL;
import static Dao.Operator.LIKE;
import entidade.Autor;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fabio
 */
public class HibernateDao implements Dao<Object> {

    @Override
    public void persist(Object o) throws Exception {

        SessionFactory sessionFactory = HibernateConnection.HibernateConnection().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction().begin();
        session.persist(o);
        session.beginTransaction().commit();

        session.flush();
        session.close();
        sessionFactory.close();



    }

    @Override
    public void delete(Object o) throws Exception {


        SessionFactory sessionFactory = HibernateConnection.HibernateConnection().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction().begin();
        session.delete(o);
        session.beginTransaction().commit();

        session.flush();
        session.close();
        sessionFactory.close();

    }

    @Override
    public Object retrieve(Class tipoObjeto, int id) throws Exception {
        SessionFactory sessionFactory = HibernateConnection.HibernateConnection().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Object aux = session.createCriteria(tipoObjeto).add(Restrictions.idEq(id)).uniqueResult();
        session.close();
        sessionFactory.close();


        return aux;

    }

    @Override
    public List<Object> list(Class tipoObjeto, String nome, String whereClause) throws Exception {
        SessionFactory sessionFactory = HibernateConnection.HibernateConnection().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction().begin();
        List list = session.createCriteria(tipoObjeto).add(Restrictions.like(whereClause, nome, MatchMode.EXACT)).list();
        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();
        return list;
    }

    @Override
    public List<Object> list(Class classe, Filter... filters) throws Exception {
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

    public static void main(String[] args) throws Exception {
        Autor p = new Autor();
//        p.setId(10);
        p.setNome("Hiber1");
//        p.setISBN("0000000000");
        System.out.println(":+ " + new HibernateDao().list(p.getClass(), new Filter("Nome", Operator.IS_NULL, p.getNome())));
//        System.out.println("++ "+new HibernateDao().list(p.getClass(), p.getNome(), "Nome"));

//        System.out.println(": "+new HibernateDao().retrieve(p.getClass(),27));



//        Autor a = new Autor();
//        Livro l = new Livro();
//
//
//        a.getLivros().add(l);
//        l.getAutores().add(null);
//
//        new HibernateDao().delete(a);

    }
}
