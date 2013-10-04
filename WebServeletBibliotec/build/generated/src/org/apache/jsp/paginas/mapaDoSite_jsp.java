package org.apache.jsp.paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mapaDoSite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Mapa do Site</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/mapaDoSite.css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1><a href=\"../index.jsp\"><img class=\"bibliotec\" src=\"../imagens/bibliotec.png\" alt=\"bibliotec\" /></a></h1>\n");
      out.write("\n");
      out.write("            <ul class = \"navlist\">\n");
      out.write("                <li><a href=\"../index.jsp\">Inicio</a></li>\n");
      out.write("                <li><a href=\"consultaLivros.jsp\">Consultar Livros</a></li>\n");
      out.write("                <li><a href=\"contatos.jsp\">Contato</a></li>\n");
      out.write("                <li><a href=\"ajuda.jsp\">Ajuda</a></li>\n");
      out.write("                <li><a href=\"mapaDoSite.jsp\">Mapa do Site</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <table class=\"tabela\">\n");
      out.write("\t\n");
      out.write("                <tr><td rowspan=\"22\"><a href=\"../index.jsp\">Inicio</a>\n");
      out.write("                    <td rowspan=\"22\"><a href=\"contatos.jsp\">Contatos</a></td>\n");
      out.write("                    <td rowspan=\"22\"><a href=\"mapaDoSite.jsp\">Mapa do Site</a></td></tr>\t\n");
      out.write("                <tr><td colspan=\"1\"><a href=\"consultaLivros.jsp\">Consultar Livros</a></td>\n");
      out.write("                    <td colspan=\"1\"><a href=\"ajuda.jsp\">Ajuda com o Sistema</a></td></tr>\t\t\t\n");
      out.write("\n");
      out.write("\t</table>\n");
      out.write("        </div>\n");
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
