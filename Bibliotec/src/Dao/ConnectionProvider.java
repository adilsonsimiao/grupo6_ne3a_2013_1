/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adilson
 */
public class ConnectionProvider {
    private static Connection currentConnection= null; 
  
    public static Connection getConection(){ 
        if(currentConnection == null){ 
            try { 
                currentConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotec", "root", "capoeir0"); 
               // currentConnection.setAutoCommit(false); 
            } catch (SQLException ex) { 
                Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex); 
                throw new RuntimeException("Nao consegui criar uma conexao para o DAO", ex); 
            } 
        } 
        return currentConnection; 
    } 
  
    @Override
    protected void finalize() throws Throwable { 
        currentConnection.close(); 
    } 
    
}
