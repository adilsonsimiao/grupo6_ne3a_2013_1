/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import entidade.Municipio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author adilson
 */
public class DaoMunicipio implements Dao<Municipio>{
     private static Municipio converteRsParaMunicipio(ResultSet rs) throws SQLException {
        Municipio municipio = new Municipio();
        municipio.setId(rs.getInt("Id"));
        municipio.setNome(rs.getString("Cidade"));
        municipio.setUf(rs.getString("UF"));
        return municipio;
        
    }

    @Override
    public void persist(Municipio o) throws Exception {
          if(o.getId()==0)
            insert(o);
        else
            update(o);
    }

    @Override
    public void delete(Municipio o) throws Exception {
         Statement st = ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Municipio WHERE id = " + o.getId());
    }

    @Override
    public Municipio retrieve(int id) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();                           
        st.execute("SELECT * FROM Municipio WHERE id = " + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Municipio municipio  = converteRsParaMunicipio(rs);
       
        return municipio;
    }

    @Override
    public List<Municipio> list() throws Exception {
               List<Municipio> municipios = new ArrayList<>();
        
         Statement st = ConnectionFactory.prepareConnection().createStatement();                             
        ResultSet rs =  st.executeQuery("SELECT * FROM Municipio");
        
        while(rs.next()){
            Municipio municipio = converteRsParaMunicipio(rs);
            municipios.add(municipio);
        }
        
        return municipios;
    }
     private void insert(Municipio municipio) throws SQLException {
       
         PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Municipio ( nome, uf) VALUES(?,?)", Statement.RETURN_GENERATED_KEYS);
        
        pst.setString(1, municipio.getNome());
        pst.setString(2, municipio.getUf());
              
        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        while(rs.next()){
            System.out.println(rs.getInt(1));
        municipio.setId(rs.getInt(1));
        
        }
        
        
    }
     
      private void update(Municipio municipio) throws SQLException {
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("UPDATE INTO Municipio (id, nome, uf) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, municipio.getId());
        pst.setString(2, municipio.getNome());
        pst.setString(3, municipio.getUf());
        
       
        
        pst.executeUpdate();
    }
     
    
}
