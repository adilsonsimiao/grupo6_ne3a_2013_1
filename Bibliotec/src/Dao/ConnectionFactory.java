/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fabio
 */
public class ConnectionFactory {
     public static final String JDBC_URL = "jdbc:mysql://localhost:3306/bibliotec?user=root&password=capoeir0";
                                           //jdbc:mysql://localhost:3306/bibliotec", "root", "capoeir0  
    public static  Connection prepareConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection(JDBC_URL);
        con.setAutoCommit(true);
        return con;
    }
}
