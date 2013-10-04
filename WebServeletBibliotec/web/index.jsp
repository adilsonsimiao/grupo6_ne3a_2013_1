<%-- 
    Document   : index
    Created on : 30/09/2013, 20:55:34
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Pagina Principal</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/menu.css"/>

    </head>
    <body>
        <div>
            <h1><a href="index.jsp"><img class="bibliotec" src="imagens/bibliotec.png" alt="bibliotec" /></a></h1>
                    <%
                        String msg = (String) session.getAttribute("mensagem");
                        if (msg != null) {
                            out.println(msg);
                        }
                        String valor = request.getParameter("cancelar");
                        if (valor != null && valor.equalsIgnoreCase("sim")) {
                            request.getSession().removeAttribute("novoPalpite");
                        }
                    %>
            <ul class = "navlist">
                <li><a href="index.jsp">Inicio</a></li>
                <li><a href="ConsultarLivroServelet">Consultar Livros</a></li>
                <li><a href="paginas/contatos.jsp">Contato</a></li>
                <li><a href="paginas/ajuda.jsp">Ajuda</a></li>
                <li><a href="paginas/mapaDoSite.jsp">Mapa do Site</a></li>
            </ul>
        </div>
        <div>



            <h1> Bem vindo ao sistema Bibliotec</h1>


        </div>
        <div>

            <h2>O sistema bibliotec é um sistema de gerenciamento</h2>
            <h2>de uma biblioteca ou de acervo pessoal.</h2>
            <h2>Controlando os livros e quantidades em banco de dados,</h2>
            <h2>gerenciando empréstimos e devoluções.</h2>
        </div>
    </body>
</html>
