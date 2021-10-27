<%@page import="java.util.ArrayList"%>
<%@page import="model.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <title>Catálogo de livros</title>
    </head>
    <body>
        <h1>Livros cadastrados</h1>
        <%
            if(request.getAttribute("lista") != null){
                ArrayList<Livro> listaDeLivros = (ArrayList<Livro>) request.getAttribute("lista");
            
        %>
        <table>
            <tr>
                <th>Título</th><th>Autor</th><th>Editora</th><th>Ano</th>
            </tr>
                <%
                    for (int i = 0; i < listaDeLivros.size(); i++) {
                            Livro livro = listaDeLivros.get(i);
                %>
            <tr>
                <td><%=livro.getTitulo()%></td>
                <td><%=livro.getAutor()%></td>
                <td><%=livro.getEditora()%></td>
                <td><%=livro.getAno()%></td>
            </tr>
            <%
                }
            %>
        </table>
        <%
            } else{
                
        %>
        <h3>A lista é nula.</h3>
        <%
            }
        %>
    </body>
</html>
