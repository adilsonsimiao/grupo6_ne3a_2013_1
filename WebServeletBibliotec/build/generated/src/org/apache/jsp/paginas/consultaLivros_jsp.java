package org.apache.jsp.paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import daos.DaoLivro;
import entity.Livro;
import java.util.List;
import java.util.List;

public final class consultaLivros_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Consultas de Livros</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/consultaAcervo.css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"paginas/contatos.jsp\"></a>\n");
      out.write("        <div>\n");
      out.write("            <h1><a href=\"../index.jsp\"><img class=\"bibliotec\" src=\"../imagens/bibliotec.png\" alt=\"bibliotec\" /></a></h1>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <ul class = \"navlist\">\n");
      out.write("                <li><a href=\"../index.jsp\">Inicio</a></li>\n");
      out.write("                <li><a href=\"consultaLivros.jsp\">Consultar Livros</a></li>\n");
      out.write("                <li><a href=\"contatos.jsp\">Contato</a></li>\n");
      out.write("                <li><a href=\"ajuda.jsp\">Ajuda</a></li>\n");
      out.write("                <li><a href=\"mapaDoSite.jsp\">Mapa do Site</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <h1>Lista de livros</h1>\n");
      out.write("            <hr>\n");
      out.write("            ");

                List<Livro> listaLivros = (List<Livro>) session.getAttribute("listaLivro");
                if (listaLivros == null || listaLivros.isEmpty()) {
            
      out.write("\n");
      out.write("            Não há Livros!\n");
      out.write("            ");
 } else {
            
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"esquerda\">Nome do Livro</th>\n");
      out.write("                    <th>Isbn</th>\n");
      out.write("                    <th>Quantidade Disponivel</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    for (Livro l : listaLivros) {
                        out.println("<tr>");
                        out.println("<td>" + l.getNomeLivro() + "</td>");
                        out.println("<td>" + l.getIsbn() + "</td>");
                        out.println("<td>" + l.getQuantidadeDisponivel() + "</td>");
                        out.println("</tr>");
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
