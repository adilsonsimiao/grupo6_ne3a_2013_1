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
        <h1>Listar livros</h1>
        <hr>
        <form method="GET" action="imc.do">  
            Nome do Livro:<input type="text" name="nomeLivro" size="100"/>  
            <input type="submit" value="Pesquisar"/>  <br>
        </form>

        <table>
            <tr>
                <th class="esquerda">Nome do Livro</th>
                <th>Isbn</th>
                <th>Quantidade Disponivel</th>
            </tr>
            <tr>
            <%
                List<Livro> listaLivros = (List<Livro>) session.getAttribute("nomeLivro");
                for (Livro l : listaLivros) {
            %>
            <td><%=l.getNomeLivro()%> </td>  
            <td><%=l.getIsbn()%> </td>  
            <td><%=l.getQuantidadeDisponivel()%> </td> 
            
        </tr> 
        <%
                }
        %>
    </table>

</body>
</html>
