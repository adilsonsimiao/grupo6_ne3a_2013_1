package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Pagina Principal</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/menu.css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1><a href=\"index.jsp\"><img class=\"bibliotec\" src=\"imagens/bibliotec.png\" alt=\"bibliotec\" /></a></h1>\n");
      out.write("                    ");

                        String msg = (String) session.getAttribute("mensagem");
                        if (msg != null) {
                            out.println(msg);
                        }
                        String valor = request.getParameter("cancelar");
                        if (valor != null && valor.equalsIgnoreCase("sim")) {
                            request.getSession().removeAttribute("novoPalpite");
                        }
                    
      out.write("\n");
      out.write("            <ul class = \"navlist\">\n");
      out.write("                <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("                <li><a href=\"ConsultarLivroServelet\">Consultar Livros</a></li>\n");
      out.write("                <li><a href=\"paginas/contatos.jsp\">Contato</a></li>\n");
      out.write("                <li><a href=\"paginas/ajuda.jsp\">Ajuda</a></li>\n");
      out.write("                <li><a href=\"paginas/mapaDoSite.jsp\">Mapa do Site</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h1> Bem vindo ao sistema Bibliotec</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("            <h2>O sistema bibliotec é um sistema de gerenciamento</h2>\n");
      out.write("            <h2>de uma biblioteca ou de acervo pessoal.</h2>\n");
      out.write("            <h2>Controlando os livros e quantidades em banco de dados,</h2>\n");
      out.write("            <h2>gerenciando empréstimos e devoluções.</h2>\n");
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
