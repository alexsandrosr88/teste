<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastro de livros</h1>
        <form action="${request.contextPath}catalogoController"method="POST">
            
            <label for="tituloId">Título</label><br/>
            <input type="text" id="tituloId" name="titulo"><br/>
            
            <label for="editoraId">Valor da música</label><br/>
            <input type="text" id="valor" name="valor"><br/>
            
            <label for="autorId">Qte.vendidas</label><br/>
            <input type="number" id="vendasId" name="vendas"><br/>
            
            <input type="submit" id="botaoId" value="Enviar">
        </form>
    </body>
</html>
