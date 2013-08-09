    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static Dao.Operator.EQUAL;
import static Dao.Operator.IS_NULL;
import static Dao.Operator.LIKE;
import entidade.Livro;
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
public class DaoLivro implements Dao<Livro>{
    
    private static Livro converteRsParaLivro(ResultSet rs) throws SQLException {
        Livro l = new Livro();
        l.setId(rs.getInt("Id"));
        l.setNomeLivro(rs.getString("nomeLivro"));
        l.setQuantidade(rs.getInt("quantidade"));
        return l;
    }

    @Override
    public void persist(Livro l) throws Exception {
        if(l.getId()==0)
            insert(l);
        else
            update(l);
    }
    

    @Override
    public void delete(Livro l) throws Exception {
         Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Livro WHERE id = " + l.getId());
    }

    @Override
    public Livro retrieve(int id) throws Exception {
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Livro WHERE id = " + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Livro l = converteRsParaLivro(rs);
       
        return l;
    }

   public List<Livro> list(String whereClause, String orderClause) throws SQLException{
        List<Livro> enderecos = new ArrayList<Livro>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Livro" + 
                (whereClause==null || whereClause.trim().isEmpty()?"":" WHERE " + whereClause) + 
                (orderClause==null || orderClause.trim().isEmpty()?"":" ORDER BY " + orderClause));
        
        while(rs.next()){
            Livro p = converteRsParaLivro(rs);
            enderecos.add(p);
        }
        
        return enderecos;
    }
    
        public List<Livro> list(Filter... filters) throws SQLException{
        
        List<Livro> pessoas = new ArrayList<Livro>();
        
        ResultSet rs = null;
        
        /* Verifica se algum friltro foi fornecido para o método */
        if(filters == null || filters.length == 0){
            Statement st =  ConnectionFactory.prepareConnection().createStatement();
            rs =  st.executeQuery("SELECT * FROM Livro");
        }else{
            String sql = "SELECT * FROM Livro WHERE ";
            
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
            Livro p = converteRsParaLivro(rs);
            pessoas.add(p);
        }
        
        return pessoas;
    }
    
    private void insert(Livro l) throws SQLException{
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Livro (id, nomeLivro, autor,quantidade) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, l.getId());
        pst.setString(2, l.getNomeLivro());
        pst.setInt(4, l.getQuantidade());
        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        l.setId(rs.getInt(1));
    }
    public void update(Livro l) throws SQLException{
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("UPDATE Livro SET nomeLivro = ?, autor = ?, quantidade = ? WHERE id = ?");
        pst.setInt(1, l.getId());
        pst.setString(2, l.getNomeLivro());
        pst.setInt(4, l.getQuantidade());
        pst.execute();
    }
}
