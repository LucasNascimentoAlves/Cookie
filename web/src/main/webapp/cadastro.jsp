<!DOCTYPE html>
<html>
<head>
	<title>Formul�rio de Cadastro</title>
</head>
<body>
	<h1>Formul�rio de Cadastro</h1>

	<form action="cadastro" method="POST">
		<!-- Informa��es pessoais -->
		<h2>Informa��es Pessoais</h2>
		<label for="nome">Nome:</label>
		<input type="text" id="nome" name="nome"><br>
		<label for="sobrenome">Sobrenome:</label>
		<input type="text" id="sobrenome" name="sobrenome"><br>
		<label for="email">E-mail:</label>
		<input type="email" id="email" name="email"><br>
		<label for="dataNascimento">Data de Nascimento:</label>
		<input type="date" id="dataNascimento" name="dataNascimento"><br>

		<!-- Informa��es acad�micas -->
		<h2>Informa��es Acad�micas</h2>
		<label for="curso">Curso:</label>
		<input type="text" id="curso" name="curso"><br>
		<label for="instituicao">Institui��o:</label>
		<input type="text" id="instituicao" name="instituicao"><br>
		<label for="anoConclusao">Ano de Conclus�o:</label>
		<input type="number" id="anoConclusao" name="anoConclusao"><br>

		<!-- Informa��es profissionais -->
		<h2>Informa��es Profissionais</h2>
		<label for="empresa">Empresa:</label>
		<input type="text" id="empresa" name="empresa"><br>
		<label for="cargo">Cargo:</label>
		<input type="text" id="cargo" name="cargo"><br>
		<label for="anoInicio">Ano de In�cio:</label>
		<input type="number" id="anoInicio" name="anoInicio"><br>
		<label for="anoFim">Ano de Fim:</label>
		<input type="number" id="anoFim" name="anoFim"><br>

		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>
