<%-- 
    Document   : mapaDoSite
    Created on : 30/09/2013, 21:06:35
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Mapa do Site</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/mapaDoSite.css"/>

    </head>
    <body>
        <div>
            <h1><a href="../index.jsp"><img class="bibliotec" src="../imagens/bibliotec.png" alt="bibliotec" /></a></h1>

            <ul class = "navlist">
                <li><a href="../index.jsp">Inicio</a></li>
                <li><a href="consultaLivros.jsp">Consultar Livros</a></li>
                <li><a href="contatos.jsp">Contato</a></li>
                <li><a href="ajuda.jsp">Ajuda</a></li>
                <li><a href="mapaDoSite.jsp">Mapa do Site</a></li>
            </ul>
        </div>
        <div>
            <table class="tabela">
	
                <tr><td rowspan="22"><a href="../index.jsp">Inicio</a>
                    <td rowspan="22"><a href="contatos.jsp">Contatos</a></td>
                    <td rowspan="22"><a href="mapaDoSite.jsp">Mapa do Site</a></td></tr>	
                <tr><td colspan="1"><a href="consultaLivros.jsp">Consultar Livros</a></td>
                    <td colspan="1"><a href="ajuda.jsp">Ajuda com o Sistema</a></td></tr>			

	</table>
        </div>
    </body>
</html>
