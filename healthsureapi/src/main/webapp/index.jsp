<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>API HealthSure</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 20px;
	padding: 20px;
	background-color: #f5f5f5;
}

h1, h2, h3 {
	color: #333;
}

p, ul {
	color: #555;
}

ul {
	list-style-type: none;
	padding: 0;
}

li {
	margin-bottom: 10px;
}

h2 {
	border-bottom: 2px solid #ddd;
	padding-bottom: 5px;
	margin-top: 20px;
}

h3 {
	margin-top: 10px;
}
</style>
</head>
<body>

	<h1>HealthSure Database API</h1>

	<h2>Vis�o Geral</h2>
	<p>O HealthSure, uma inova��o na �rea da sa�de, surge para
		enfrentar o desafio contempor�neo de lidar com o crescente volume de
		informa��es dispersas. Diante das dificuldades encontradas por muitos
		ao buscar not�cias espec�ficas sobre sa�de, nosso projeto oferece uma
		solu��o clara e eficiente.</p>
	<p>A proposta do HealthSure � direta: centralizar as principais
		not�cias de fontes confi�veis em uma �nica plataforma. Essa abordagem
		simplifica a busca por informa��es espec�ficas, enriquecendo o
		repert�rio dos usu�rios em diversos t�picos de sa�de.</p>
	<p>Al�m de not�cias, o HealthSure apresenta um bot inteligente
		capaz de analisar o contexto do usu�rio e fornecer respostas
		espec�ficas. Na �rea da sa�de, o bot pode oferecer sugest�es de
		m�todos preventivos personalizados, elevando a relev�ncia e utilidade
		da plataforma..</p>
	<p>Destacamos que a API do HealthSure � projetada para ser
		utilizada no backend do projeto, garantindo uma integra��o perfeita e
		eficiente para potencializar a experi�ncia do usu�rio.</p>

	<h2>Descri��o do Projeto</h2>
	<p>O HealthSure tem como objetivo proporcionar informa��es claras e
		centralizadas sobre sa�de. Nossa plataforma integra artigos de
		not�cias de diversas fontes, complementados por um bot capaz de
		fornecer respostas sens�veis ao contexto, oferecendo assim uma
		experi�ncia abrangente e personalizada para os usu�rios.</p>

	<h2>Como Usar</h2>
	<p>Para interagir com a API HealthSure, utilize os endpoints
		fornecidos para usu�rios e artigos de not�cias. Siga os m�todos de
		solicita��o especificados para cada opera��o.</p>

	<h2>Endpoints</h2>

	<h3>Usu�rios</h3>
	<ul>
		<li><strong>GET /usuarios/cadastro</strong>: Obter uma lista de
			todos os usu�rios.</li>
		<li><strong>GET /usuarios/{id_usuario}</strong>: Obter
			informa��es sobre um usu�rio espec�fico por ID.</li>
		<li><strong>POST /usuarios/cadastro</strong>: Criar um novo
			usu�rio.</li>
		<li><strong>POST /usuarios/login</strong>: Fazer login com
			credenciais de usu�rio.</li>
		<li><strong>PUT /usuarios/{id_usuario}</strong>: Atualizar
			informa��es sobre um usu�rio espec�fico por ID.</li>
		<li><strong>DELETE /usuarios/{id_usuario}</strong>: Excluir um
			usu�rio por ID.</li>
	</ul>

	<h3>Not�cias</h3>
	<ul>
		<li><strong>GET /noticias</strong>: Obter uma lista de todos os
			artigos de not�cias.</li>
	</ul>

	<h2>Contato</h2>
	<p>
		Para perguntas ou suporte, entre em contato conosco pelo e-mail <a
			href="mailto:info@healthsure.com">info@healthsure.com</a>.
	</p>

	<p>
		Para obter mais informa��es sobre o uso desta API, consulte a <a
			href="http://jersey.java.net">documenta��o do Projeto Jersey</a>.
	</p>

</body>
</html>
