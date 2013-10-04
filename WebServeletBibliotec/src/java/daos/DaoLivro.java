/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entity.Livro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoLivro  {

  
    public List<Livro> listarTodosLivros() {
        List<Livro> livros = new ArrayList<Livro>();
        PreparedStatement ps = null;
        try {
            ps = BDConnection.prepareStatement("SELECT * FROM Livro");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Livro l = new Livro();
                String nomeLivros = rs.getString("nomeLivro");
                String isbn = rs.getString("Isbn");
                int quantidadeDisponivel = rs.getInt("quantidadeDisponivel");
                
                l.setNomeLivro(nomeLivros);
                l.setIsbn(isbn);
                l.setQuantidadeDisponivel(quantidadeDisponivel);
                livros.add(l);
            }
            rs.close();

        } catch (Exception e) {
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
        return livros;
    }

  
}
