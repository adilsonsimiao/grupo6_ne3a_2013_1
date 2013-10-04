/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import daos.DaoLivro;
import entity.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabio
 */
public class ConsultaLivrosServelet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getParameter("nomeLivro");
        DaoLivro lDao = new DaoLivro();
        List<Livro> listaLivros = lDao.listarLivros("livroo"/*request.getParameter("nomeLivro")*/);
        request.setAttribute("listaLivros", listaLivros);
        RequestDispatcher dispatcher = request.getRequestDispatcher("consultaLivros.jsp");
        dispatcher.forward(request, response);
    }


   
}
