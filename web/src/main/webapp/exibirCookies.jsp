<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>Dados cadastrados</title>
  </head>
  <body>
    <h2>Dados cadastrados</h2>
    <p>Nome: <%= request.getAttribute("nome") %></p>
    <p>Sobrenome: <%= request.getAttribute("sobrenome") %></p>
    <p>E-mail: <%= request.getAttribute("email") %></p>
    <p>Data de nascimento: <%= request.getAttribute("dataNascimento") %></p>
    <p>Curso: <%= request.getAttribute("curso") %></p>
    <p>Instituição: <%= request.getAttribute("instituicao") %></p>
    <p>Ano de conclusão: <%= request.getAttribute("anoConclusao") %></p>
    <p>Empresa: <%= request.getAttribute("empresa") %></p>
    <p>Cargo: <%= request.getAttribute("cargo") %></p>
    <p>Ano de início: <%= request.getAttribute("anoInicio") %></p>
    <p>Ano de fim: <%= request.getAttribute("anoFim") %></p>
  </body>
</html>
