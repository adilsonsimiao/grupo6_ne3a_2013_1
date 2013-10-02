<%-- 
    Document   : contatos
    Created on : 30/09/2013, 21:06:25
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contatos</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/contato.css"/>
        <script language="JavaScript" src="../jq/jquery-1.10.2.js" type="text/javascript"></script>
        <script language="JavaScript" src="../jq/jquery.maskedinput.js" type="text/javascript"></script>
        <script language="JavaScript" src="../jq/dist/jquery.validate.js" type="text/javascript"></script>


        <script type="text/javascript">
            $(document).ready(function() {
                $("#telefone").mask("(99) 9999-9999?9");
                $("#formularioContato").validate({
                    rules: {
                        campoNome: {
                            required: true, minlength: 2
                        },
                        campoEmail: {
                            required: true, email: true
                        },
                        campoTelefone: {
                            required: true, minlength: 2
                        },
                        campoMensagem: {
                            required: true, minlength: 2
                        }
                    },
                    messages: {
                        campoNome: {
                            required: "Digite o seu nome",
                            minLength: "O seu nome deve conter, no mínimo, 2 caracteres"
                        },
                        campoEmail: {
                            required: "Digite o seu e-mail para contato",
                            email: "Digite um e-mail válido"
                        },
                        campoTelefone: {
                            required: "Digite o seu telefone para contato",
                            telefone: "Digite um telefone válido"
                        },
                        campoMensagem: {
                            required: "Digite a sua mensagem",
                            minLength: "A sua mensagem deve conter, no mínimo, 2 caracteres"
                        }
                    }
                });
            });
        </script>

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
            <form id="formularioContato" method="post" action="">
                <fieldset>


                    <legend> Fomulário para Contato</legend>
                    <p><label for="nome">Nome*</label> 
                        <input id="nome" name="campoNome" type="text" size="30"><br><br></p>
                    <p><label for="email">E-mail*</label>
                        <input id="email" type="text" name="campoEmail" size="30"><br><br></p>
                    <p><label for="telefone">Telefone* </label>
                        <input id="telefone"type="text" name="campoTelefone" maxlength="10"><br><br></p>
                    <p><label>Assunto: </label><input type="text" size="30"/></p>
                    <p><label for="mensagem">Mensagem*</label></p>
                    <p><textarea id="mensagem" name="campoMensagem"rows="6" cols="40" ></textarea></p>
                </fieldset>
                <p>
                    <input type="submit" class="submit" value="Enviar"/>
                    <input type="reset" name="botão" value="Limpar"/>
                </p>
            </form>

        </div>
    </body>
</html>
