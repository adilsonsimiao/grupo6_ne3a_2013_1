/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import Dao.DaoLivro;
import entidade.Livro;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabio
 */
public class ConsultarLivroServelet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        DaoLivro lDao = new DaoLivro();
        String livro = request.getParameter("selecao");
        List<Livro> livros = null;
        if(livro == null)
            livros = lDao.retrieveNomeLivros(livro);
        request.getSession().setAttribute("nomeLivro", livros);
        request.getRequestDispatcher("listaPalpites.jsp").forward(request, response);
    } 
}
