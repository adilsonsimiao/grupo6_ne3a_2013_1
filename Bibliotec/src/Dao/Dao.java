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
    E retrieve(int id)  throws Exception;
    List<E> list(String whereClause, String orderClause)  throws Exception;
    List<E> list(Filter... filters)  throws Exception;
    
  }
