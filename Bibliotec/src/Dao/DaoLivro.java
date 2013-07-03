    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

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
        l.setAutor(rs.getString("autor"));
        l.setId(rs.getInt("Id"));
        l.setNomeLivro(rs.getString("nomeLivro"));
        l.setQuantidade(rs.getInt("nomeLivro"));
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

    @Override
    public List<Livro> list() throws Exception {
        List<Livro> Enderecos = new ArrayList<Livro>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Endereco");
        
        while(rs.next()){
            Livro l = converteRsParaLivro(rs);
            Enderecos.add(l);
        }
        
        return Enderecos;
    }
    
    private void insert(Livro l) throws SQLException{
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Livro (id, nomeLivro, autor,quantidade) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, l.getId());
        pst.setString(2, l.getNomeLivro());
        pst.setString(3, l.getAutor());
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
        pst.setString(3, l.getAutor());
        pst.setInt(4, l.getQuantidade());
        pst.execute();
    }
}
