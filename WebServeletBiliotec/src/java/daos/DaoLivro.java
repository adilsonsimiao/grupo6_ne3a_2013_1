/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entity.Livro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author fabio
 */
public class DaoLivro extends HibernateDao<Livro> {

    public DaoLivro() {
        c = Livro.class;
    }

    public List<Livro> retrieveNomeLivros(String nome) {
        return createNamedQuery("SELECT * FROM Livro WHERE nomeLivro LIKE %" + nome + "%").getResultList();

    }   

    public static Livro find(String nome) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        ps = BDConnection.prepareStatement("SELECT * FROM Livro WHERE nomeLivro LIKE %" + nome + "%");
        rs = ps.executeQuery();
        try {
            Livro livro = null;
            if (rs.next()) {
                livro = new Livro();
                livro.setNomeLivro(rs.getString("nome"));
                livro.setIsbn(rs.getString("Isbn"));
                livro.setQuantidade(Integer.parseInt(rs.getString("quantidade")));
                livro.setQuantidadeDisponivel(Integer.parseInt(rs.getString("quantidade")));
            }
            return livro;





        } finally {
            rs.close();
            ps.close();
        }

    }
}
