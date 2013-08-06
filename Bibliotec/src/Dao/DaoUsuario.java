/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static Dao.Operator.EQUAL;
import static Dao.Operator.IS_NULL;
import static Dao.Operator.LIKE;
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

    public List<Usuario> list(String whereClause, String orderClause) throws SQLException{
        List<Usuario> enderecos = new ArrayList<Usuario>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Usuario" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
            Usuario p = converteRsParaUsuario(rs);
            enderecos.add(p);
        }
        
        return enderecos;
    }
    
        public List<Usuario> list(Filter... filters) throws SQLException{
        
        List<Usuario> pessoas = new ArrayList<Usuario>();
        
        ResultSet rs = null;
        
        /* Verifica se algum friltro foi fornecido para o método */
        if(filters == null || filters.length == 0){
            Statement st =  ConnectionFactory.prepareConnection().createStatement();
            rs =  st.executeQuery("SELECT * FROM Usuario");
        }else{
            String sql = "SELECT * FROM Usuario WHERE ";
            
            for(Filter f : filters){
                System.out.println(f);
                switch(f.getOperator()){
                    case IS_NULL: sql += f.getAttribute() + " IS NULL"; break;
                    case LIKE: sql += f.getAttribute() + " LIKE '%" + f.getValue()+ "%'"; break;
                    case EQUAL: sql += f.getAttribute() + "='" + f.getValue()+ "'"; break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
            }
            PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement(sql);
            System.out.println("SQL:" + sql);
            rs =  pst.executeQuery();
        }
        
        /* Converte o ResultSet da query para uma lista de objetos */
        while(rs.next()){
            Usuario p = converteRsParaUsuario(rs);
            pessoas.add(p);
        }
        
        return pessoas;
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


    
    
    

