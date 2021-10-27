<%@page import="java.util.ArrayList"%>
<%@page import="model.Musica"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <title>Catálogo de livros</title>
    </head>
    <body>
        <h1>Listagem de músicas mais vendidas do Racionais MC's</h1>
        <%
            if(request.getAttribute("lista") != null){
                ArrayList<Musica> listaMusicas = (ArrayList<Musica>) request.getAttribute("lista");
            
        %>
        <table>
            <tr>
                <th>Nome</th><th>Valor</th><th>Qte.vendida</th>
            </tr>
                <%
                    NumberFormat formatter = new DecimalFormat("#0.00");
                    for (int i = 0; i < listaMusicas.size(); i++) {
                            Musica musica = listaMusicas.get(i);
                %>
            <tr>
                <td><%=musica.getTitulo()%></td>
                <td>R$ <%=formatter.format(musica.getValor())%></td>
                <td><%=musica.getVendas()%></td>
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
