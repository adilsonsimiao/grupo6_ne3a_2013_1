/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Livro;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fabio
 */
public class DaoManager {

    private static final Map<Class, Dao> daos = new HashMap<>();

    static {
        daos.put(Livro.class, new DaoLivro());
    }

    private static Dao obtemDao(Class co) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return daos.get(co);
    }/*bolar uma forma dos daos se automaticamente implementar aqui, fazer com que os daos se registrem no manager*/

    public void persist(Object o) throws Exception {

        Dao daoObject = obtemDao(o.getClass());
        daoObject.persist(o);


    }

    public void delete(Object o) throws Exception {

        Dao daoObject = obtemDao(o.getClass());
        daoObject.delete(o);
    }

    public Object retrieve(Class tipoObjeto, int id) throws Exception {
        Dao daoObject = obtemDao(tipoObjeto);

        return daoObject.retrieve(id);
    }

    public List list(Class tipoObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
