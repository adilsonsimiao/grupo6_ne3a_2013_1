/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import daos.DaoLivro;
import entity.Livro;
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
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        DaoLivro lDao = new DaoLivro();
        List<Livro> listaLivros = lDao.listarTodosLivros();
        request.getSession().setAttribute("listaLivros", listaLivros);
        request.getRequestDispatcher("consultaLivros.jsp").forward(request, response);
    } 
}
