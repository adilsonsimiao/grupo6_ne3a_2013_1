/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1294016
 */
public class DaoUsuario implements Dao<Usuario>{
    
    private static Usuario converteRsParaUsuario(ResultSet rs) throws SQLException {
        Usuario u = new Usuario();
        u.setId(rs.getInt("id"));
        u.setNome(rs.getString("nome"));
        u.setCpf(rs.getString("cpf"));
        u.setTelefone(rs.getString("telefone"));
        u.setIdEndereco(rs.getInt("idEndereco"));
        return u;
        
    }

    @Override
    public void persist(Usuario u) throws Exception {
        if(u.getId()==0)
            insert(u);
        else
            update(u);
    }

    @Override
    public void delete(Usuario u) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Usuario WHERE id = " + u.getId());
    }

    @Override
    public Usuario retrieve(int id) throws Exception {
           Statement st = ConnectionFactory.prepareConnection().createStatement();                           
        st.execute("SELECT * FROM Usuario WHERE id = " + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Usuario p = converteRsParaUsuario(rs);
       
        return p;
        
    }

    @Override
    public List<Usuario> list() throws Exception {
        List<Usuario> Usuarios = new ArrayList<Usuario>();
        
         Statement st = ConnectionFactory.prepareConnection().createStatement();                             
        ResultSet rs =  st.executeQuery("SELECT * FROM Usuario");
        
        while(rs.next()){
            Usuario p = converteRsParaUsuario(rs);
            Usuarios.add(p);
        }
        
        return Usuarios;
    }
    public List<Usuario> listNome(String nome) throws Exception {
        List<Usuario> Usuarios = new ArrayList<>();
        
         Statement st = ConnectionFactory.prepareConnection().createStatement();                             
        ResultSet rs =  st.executeQuery("SELECT * FROM Usuario WHERE nome = '"+nome+"'");
        
        while(rs.next()){
            Usuario p = converteRsParaUsuario(rs);
            Usuarios.add(p);
        }
        
        return Usuarios;
    }
    public List<Usuario> listCpf(String cpf) throws Exception {
        List<Usuario> Usuarios = new ArrayList<>();
        
         Statement st = ConnectionFactory.prepareConnection().createStatement();                             
        ResultSet rs =  st.executeQuery("SELECT * FROM Usuario WHERE cpf = '"+cpf+"'");
        
        while(rs.next()){
            Usuario p = converteRsParaUsuario(rs);
            Usuarios.add(p);
        }
        
        return Usuarios;
    }

    private void update(Usuario u) throws SQLException {
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("UPDATE INTO Usuario (id, nome, cpf, telefone, idEndereco) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, u.getId());
        pst.setString(2, u.getNome());
        pst.setString(3, u.getCpf());
        pst.setString(4, u.getTelefone());
        pst.setInt(5, u.getIdEndereco());
        
        
        pst.execute();
    }

    private void insert(Usuario u) throws SQLException {
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Usuario (id, nome, cpf, telefone, idEndereco) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, u.getId());
        pst.setString(2, u.getNome());
        pst.setString(3, u.getCpf());
        pst.setString(4, u.getTelefone());
        pst.setInt(5, u.getIdEndereco());
        
        
        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        u.setId(rs.getInt(1));
    }
    
    
}
