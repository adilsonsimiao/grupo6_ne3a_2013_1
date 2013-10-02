package daos;

import static daos.BDConnection.conn;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class BDConnection {  
    public static Connection conn;

    public static Connection getMyDConnection() throws SQLException, ClassNotFoundException, IOException {
        Properties p = new Properties();
        File f = new File(".");
        String host = "localhost" ;
        String port = "3306";
        String login = "root";
        String password = "root";
        String database = "bibliotec";
        Class.forName("com.mysql.jdbc.Driver");
        String x = "jdbc:mysql://"+host+":"+port+"/"+database;
        return DriverManager.getConnection(x, login, password);
    }
    public static Connection getMyDConnection(String host, String port, String login, String password) throws SQLException, ClassNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/", login, password);
    }

    public static Connection connect(){
        try {
            return BDConnection.getMyDConnection();
        } catch (Exception ex) {
             ex.printStackTrace();
             return null;
        }
    }
    public static void close(){
        try {
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static PreparedStatement prepareStatement(String sql){
        conn = BDConnection.connect();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ps;
    }
}