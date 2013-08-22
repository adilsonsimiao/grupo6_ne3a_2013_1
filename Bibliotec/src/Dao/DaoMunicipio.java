/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static Dao.Operator.EQUAL;
import static Dao.Operator.IS_NULL;
import static Dao.Operator.LIKE;
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
    public Municipio retrieve(Class tipoObjeto,int id) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();                           
        st.execute("SELECT * FROM Municipio WHERE id = " + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Municipio municipio  = converteRsParaMunicipio(rs);
       
        return municipio;
    }

    public List<Municipio> list(String whereClause, String orderClause) throws SQLException{
        List<Municipio> enderecos = new ArrayList<Municipio>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Municipio" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
            Municipio p = converteRsParaMunicipio(rs);
            enderecos.add(p);
        }
        
        return enderecos;
    }
    
        public List<Municipio> list(Filter... filters) throws SQLException{
        
        List<Municipio> pessoas = new ArrayList<Municipio>();
        
        ResultSet rs = null;
        
        /* Verifica se algum friltro foi fornecido para o método */
        if(filters == null || filters.length == 0){
            Statement st =  ConnectionFactory.prepareConnection().createStatement();
            rs =  st.executeQuery("SELECT * FROM Municipio");
        }else{
            String sql = "SELECT * FROM Municipio WHERE ";
            
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
            Municipio p = converteRsParaMunicipio(rs);
            pessoas.add(p);
        }
        
        return pessoas;
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

    @Override
    public List<Municipio> list(Class tipoObjeto, String nome, String whereClause) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipio> list(Class classe, Filter... filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
