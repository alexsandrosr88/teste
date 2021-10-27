<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastro de livros</h1>
        <form action="BibController"method="POST">
            <label for="tituloId">Título</label><br/>
            <input type="text" id="tituloId" name="titulo"><br/>
            <label for="autorId">Autor</label><br/>
            <input type="text" id="autorId" name="autor"><br/>
            <label for="editoraId">Editora</label><br/>
            <input type="text" id="editoraId" name="editora"><br/>
            <label for="anoId">Ano</label><br/>
            <input type="text" id="AnoId" name="ano"><br/><br/>
            <input type="submit" id="botaoId" value="Enviar">
        </form>
    </body>
</html>
