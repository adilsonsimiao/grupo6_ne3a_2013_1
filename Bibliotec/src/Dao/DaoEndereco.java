/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Endereco;
import entidade.Municipio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adilson
 */
public class DaoEndereco implements Dao<Endereco>{
Endereco end;
Municipio municipio = new Municipio();
 private static Endereco converteRsParaEndereco(ResultSet rs) throws SQLException {
        Endereco end = new Endereco();
        end.setId(rs.getInt("Id"));
        end.setLogradouro(rs.getString("Logradouro"));
        end.setComplemento(rs.getString("Complemento"));
        end.setBairro(rs.getString("Bairro"));
        end.setNumero(rs.getString("numero"));              
        end.setCep(rs.getString("CEP"));
        //end.setIdMunicipio(rs.getInt("IdMunicipio"));
        return end;
        
    }


    @Override
    public void persist(Endereco o) throws Exception {
            if(o.getId()==0)
            insert(o);
        else
            update(o);
    }

    @Override
    public void delete(Endereco o) throws Exception {
         Statement st = ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Usuario WHERE id = " + o.getId());
    }

    @Override
    public Endereco retrieve(int id) throws Exception {
       Statement st = ConnectionFactory.prepareConnection().createStatement();                           
        st.execute("SELECT * FROM Endereco WHERE id = " + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Endereco end = converteRsParaEndereco(rs);
       
        return end;
    }

    @Override
    public List<Endereco> list() throws Exception {
                List<Endereco> enderecos = new ArrayList<>();
        
         Statement st = ConnectionFactory.prepareConnection().createStatement();                             
        ResultSet rs =  st.executeQuery("SELECT * FROM Usuario");
        
        while(rs.next()){
            Endereco end = converteRsParaEndereco(rs);
            enderecos.add(end);
        }
        
        return enderecos;
    }
     private void insert(Endereco end) throws SQLException {
       
         PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Endereco ( logradouro, complemento,  bairro, numero, cep, idMunicipio) VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        
        pst.setString(1, end.getLogradouro());
        pst.setString(2, end.getComplemento());
        pst.setString(3, end.getBairro());
        pst.setString(4, end.getNumero());        
        pst.setString(5, end.getCep());
        pst.setInt(6, end.getIdMunicipio());
        
        
        
        
        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        while(rs.next()){
            System.out.println(rs.getInt(1));
        end.setId(rs.getInt(1));
        
        }
        
        
    }
      private void update(Endereco end) throws SQLException {
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("UPDATE INTO Endereco (id, logradouro, complemento,  bairro, numero, cep, idmunicipio) VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, end.getLogradouro());
        pst.setString(2, end.getComplemento());
        pst.setString(3, end.getNumero());
        pst.setString(4, end.getBairro());
        pst.setString(5, end.getCep());
        pst.setString(6, end.getUf());
        pst.setString(7, municipio.getNome());
       
        
        pst.executeUpdate();
    }
    
}
