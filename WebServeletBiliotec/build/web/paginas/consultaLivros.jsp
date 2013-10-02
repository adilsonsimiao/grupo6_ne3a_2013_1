<%@page import="daos.DaoLivro"%>
<%@page import="entity.Livro"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Consultas de Livros</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/consultaAcervo.css"/>

    </head>
    <body>
        <div>
            <h1><a href="../index.jsp"><img class="bibliotec" src="../imagens/bibliotec.png" alt="bibliotec" /></a></h1>
        </div>
        <div>
            <ul class = "navlist">
                <li><a href="../index.jsp">Inicio</a></li>
                <li><a href="consultaLivros.jsp">Consultar Livros</a></li>
                <li><a href="contatos.jsp">Contato</a></li>
                <li><a href="ajuda.jsp">Ajuda</a></li>
                <li><a href="mapaDoSite.jsp">Mapa do Site</a></li>
            </ul>
        </div>
        <div>

            <hr>
            
            <p>Pesquisa Livro*: <input id="campoPesquisa" type="text" name="nome" size="30">
                    <input id="pesquisar" type="button" name="botão" value="Pesquisar"/><br><br>   
            </p>
            
            <%       
                
                List<Livro> listaLivros = new DaoLivro().retrieveNomeLivros("livroo");
                if (listaLivros == null || listaLivros.isEmpty()) {
            %>
            <% } else {
            %>
            <table>
                <tr>
                    <th class="esquerda">Usuário</th>
                    <th>Nome do Livro</th>
                    <th>Isbn</th>
                    <th>Quantidade Disponivel</th>
                </tr>
                <%
                    for (Livro l : listaLivros) {
                        out.println("<tr>");
                        out.println("<td class=\"esquerda\">" + DaoLivro.find(l.getNomeLivro()) + "</td>");
                        out.println("<td>" + l.getNomeLivro() + "</td>");
                        out.println("<td>" + l.getIsbn() + "</td>");
                        out.println("<td>" + l.getQuantidadeDisponivel() + "</td>");
                        out.println("</tr>");
                    }
                %>
            </table>
            <%
                }
            %>
        </div>
    </body>
</html>
