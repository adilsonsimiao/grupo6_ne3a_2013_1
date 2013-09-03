/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;

/**
 *
 * @author fabio
 */
public interface Dao<E> {
    void persist(E o)  throws Exception;
    void delete(E o)  throws Exception;
    E retrieve(Class tipoObjeto,int id)  throws Exception;
    List<E> list(String campoUnico, Class tipoObjeto, String nome, String whereClause, String orderClause)  throws Exception;
    List<E> list(Class classe, Filter... filters)  throws Exception;
    
  }
