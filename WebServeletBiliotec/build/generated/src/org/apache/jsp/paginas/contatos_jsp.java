package org.apache.jsp.paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contatos</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/contato.css\"/>\n");
      out.write("        <script language=\"JavaScript\" src=\"../jq/jquery-1.10.2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script language=\"JavaScript\" src=\"../jq/jquery.maskedinput.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script language=\"JavaScript\" src=\"../jq/dist/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#telefone\").mask(\"(99) ?99999-9999\");\n");
      out.write("                $(\"#formularioContato\").validate({\n");
      out.write("                    rules: {\n");
      out.write("                        campoNome: {\n");
      out.write("                            required: true, minlength: 2\n");
      out.write("                        },\n");
      out.write("                        campoEmail: {\n");
      out.write("                            required: true, email: true\n");
      out.write("                        },\n");
      out.write("                        campoTelefone: {\n");
      out.write("                            required: true, minlength: 2\n");
      out.write("                        },\n");
      out.write("                        campoMensagem: {\n");
      out.write("                            required: true, minlength: 2\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    messages: {\n");
      out.write("                        campoNome: {\n");
      out.write("                            required: \"Digite o seu nome\",\n");
      out.write("                            minLength: \"O seu nome deve conter, no mínimo, 2 caracteres\"\n");
      out.write("                        },\n");
      out.write("                        campoEmail: {\n");
      out.write("                            required: \"Digite o seu e-mail para contato\",\n");
      out.write("                            email: \"Digite um e-mail válido\"\n");
      out.write("                        },\n");
      out.write("                        campoTelefone: {\n");
      out.write("                            required: \"Digite o seu telefone para contato\",\n");
      out.write("                            telefone: \"Digite um telefone válido\"\n");
      out.write("                        },\n");
      out.write("                        campoMensagem: {\n");
      out.write("                            required: \"Digite a sua mensagem\",\n");
      out.write("                            minLength: \"A sua mensagem deve conter, no mínimo, 2 caracteres\"\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("        <div>\n");
      out.write("            <form id=\"formularioContato\" method=\"post\" action=\"\">\n");
      out.write("                <fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <legend> Fomulário para Contato</legend>\n");
      out.write("                    <p><label for=\"nome\">Nome*</label> \n");
      out.write("                        <input id=\"nome\" name=\"campoNome\" type=\"text\" size=\"30\"><br><br></p>\n");
      out.write("                    <p><label for=\"email\">E-mail*</label>\n");
      out.write("                        <input id=\"email\" type=\"text\" name=\"campoEmail\" size=\"30\"><br><br></p>\n");
      out.write("                    <p><label for=\"telefone\">Telefone* </label>\n");
      out.write("                        <input id=\"telefone\"type=\"text\" name=\"campoTelefone\" maxlength=\"10\"><br><br></p>\n");
      out.write("                    <p><label>Assunto: </label><input type=\"text\" size=\"30\"/></p>\n");
      out.write("                    <p><label for=\"mensagem\">Mensagem*</label></p>\n");
      out.write("                    <p><textarea id=\"mensagem\" name=\"campoMensagem\"rows=\"6\" cols=\"40\" ></textarea></p>\n");
      out.write("                </fieldset>\n");
      out.write("                <p>\n");
      out.write("                    <input type=\"submit\" class=\"submit\" value=\"Enviar\"/>\n");
      out.write("                    <input type=\"reset\" name=\"botão\" value=\"Limpar\"/>\n");
      out.write("                </p>\n");
      out.write("            </form>\n");
      out.write("\n");
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
