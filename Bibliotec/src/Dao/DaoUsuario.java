/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Endereco;
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
    Endereco endereco = new Endereco();
    private static Usuario converteRsParaUsuario(ResultSet rs) throws SQLException {
        Usuario u = new Usuario();
        u.setId(rs.getInt("id"));
        u.setNome(rs.getString("nome"));
        u.setCpf(rs.getString("cpf"));       
        
         u.setTelefone(rs.getString("telefone"));
         //  u.setIdEndereco(rs.getInt("idEndereco"));       
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
     public Usuario retri(String nome) throws Exception {
           Statement st = ConnectionFactory.prepareConnection().createStatement();                           
        st.execute("SELECT * FROM Usuario WHERE id = " + nome);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Usuario p = converteRsParaUsuario(rs);
       
        return p;
        
    }
    
    
//    public Usuario consultarNome(String nome)throws  Exception{ 
//        Statement st = ConnectionFactory.prepareConnection().createStatement();  
//     
//         ResultSet rs =  st.executeQuery("SELECT nome from usuario  where nome like '%"+nome+"%'"); 
//        rs.next();
//           
//        System.out.println(rs.getString(1));     
//            
//      
//        
//     return p;
//            
//                                               
//} 

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

    private void update(Usuario u) throws SQLException {
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("UPDATE INTO Usuario (id, nome, cpf, telefone ) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, u.getId());
        pst.setString(2, u.getNome());
        pst.setString(3, u.getCpf());
        pst.setString(4, u.getTelefone());
       
        
        
        pst.execute();
    }

    private void insert(Usuario u) throws SQLException {
        
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Usuario ( nome, cpf, telefone, idEndereco) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = pst.getGeneratedKeys();    
        pst.setString(1, u.getNome());
        pst.setString(2, u.getCpf());     
        pst.setString(3, u.getTelefone());  
        pst.setInt(4, u.getIdEndereco());  
         
        pst.execute();
        
        
       
        while(rs.next()){
            System.out.println(rs.getInt(1));
        u.setId(rs.getInt(1));
        
        }
        
        
        
    } 
    public Usuario buscarNome(String nome){
    
       Usuario usuario = new Usuario();
       
           
           ResultSet rs;
        try {
          
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("SELECT id, nome, cpf, telefone  FROM Usuario WHERE nome= ?");
           pst.setString(1, nome);
           rs = pst.executeQuery();
      
           
           while(rs.next()){
               
              usuario.setId(rs.getInt("id"));
              usuario.setNome(rs.getString("nome"));
              usuario.setCpf(rs.getString("cpf"));
              usuario.setTelefone(rs.getString("telefone"));
           
           
                               
           } 
           
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Usuario", ex);
        }
         return usuario;
        }
    
    
    public Usuario buscarCPF(String cpf){
    
       Usuario usuario = new Usuario();
       
           
           ResultSet rs;
        try {
          
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("SELECT id, nome, cpf, telefone, idEndereco  FROM Usuario WHERE cpf= ?");
           pst.setString(1, cpf);
           rs = pst.executeQuery();
      
           
           while(rs.next()){
               
              usuario.setId(rs.getInt("id"));
              usuario.setNome(rs.getString("nome"));
              usuario.setCpf(rs.getString("cpf"));
              usuario.setTelefone(rs.getString("telefone"));
              usuario.setIdEndereco(rs.getInt("idEndereco"));
           
                               
           } 
           
        } catch (SQLException ex) {
                   ex.printStackTrace();
            throw new RuntimeException("Erro ao preparar a instrução de INSERT do Usuario", ex);
        }
         return usuario;
        }
        
    
    
         
}


    
    
    

