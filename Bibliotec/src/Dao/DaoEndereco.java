/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoEndereco implements Dao<Endereco>{
    
    private static Endereco converteRsParaEndereco(ResultSet rs) throws SQLException {
        Endereco e = new Endereco();
        e.setLogradouro(rs.getString("logradouro"));
        e.setComplemento(rs.getString("complemento"));
        e.setNumero(rs.getString("numero"));
        e.setBairro(rs.getString("bairro"));
        e.setCidade(rs.getInt("cidade"));
        e.setUf(rs.getNString("uf"));
        e.setCep(rs.getString("cep"));
        e.setId(rs.getInt("id"));
        
        return e;
    }

    @Override
    public void persist(Endereco e) throws SQLException{
        if(e.getId()==0)
            insert(e);
        else
            update(e);
    }
    
    private void insert(Endereco e) throws SQLException{
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Endereco (logradouro,  complemento, numero, bairro, cidade, uf, cep) VALUES(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        //logradouro,  complemento, numero, bairro, cidade, uf, cep
        pst.setString(1, e.getLogradouro());
        pst.setString(2, e.getComplemento());
        pst.setString(3, e.getNumero());
        pst.setString(4, e.getBairro());
        pst.setInt(5, e.getCidade());
        pst.setString(6, e.getUf());
        pst.setString(7, e.getCep());
        
        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        e.setId(rs.getInt(1));
    }
    
    @Override
    public Endereco retrieve(int id) throws SQLException{
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Endereco WHERE id = " + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Endereco p = converteRsParaEndereco(rs);
       
        return p;
    }

    public void update(Endereco e) throws SQLException{
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("UPDATE Endereco SET logradouro = ?, complemento = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, cep = ? WHERE id = ?");
        pst.setString(1, e.getLogradouro());
        pst.setString(2, e.getComplemento());
        pst.setString(3, e.getNumero());
        pst.setString(4, e.getBairro());
        pst.setInt(5, e.getCidade());
        pst.setString(6, e.getUf());
        pst.setString(7, e.getCep());
        pst.setInt(8, e.getId());
        pst.execute();
    }
    
    @Override
    public void delete(Endereco e) throws SQLException{
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Endereco WHERE id = " + e.getId());
    }
    
    @Override
    public List<Endereco> list() throws SQLException{
        List<Endereco> Enderecos = new ArrayList<>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Endereco");
        
        while(rs.next()){
            Endereco p = converteRsParaEndereco(rs);
            Enderecos.add(p);
        }
        
        return Enderecos;
    }
    
}
