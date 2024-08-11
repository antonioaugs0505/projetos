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

	<h2>Visão Geral</h2>
	<p>O HealthSure, uma inovação na área da saúde, surge para
		enfrentar o desafio contemporâneo de lidar com o crescente volume de
		informações dispersas. Diante das dificuldades encontradas por muitos
		ao buscar notícias específicas sobre saúde, nosso projeto oferece uma
		solução clara e eficiente.</p>
	<p>A proposta do HealthSure é direta: centralizar as principais
		notícias de fontes confiáveis em uma única plataforma. Essa abordagem
		simplifica a busca por informações específicas, enriquecendo o
		repertório dos usuários em diversos tópicos de saúde.</p>
	<p>Além de notícias, o HealthSure apresenta um bot inteligente
		capaz de analisar o contexto do usuário e fornecer respostas
		específicas. Na área da saúde, o bot pode oferecer sugestões de
		métodos preventivos personalizados, elevando a relevância e utilidade
		da plataforma..</p>
	<p>Destacamos que a API do HealthSure é projetada para ser
		utilizada no backend do projeto, garantindo uma integração perfeita e
		eficiente para potencializar a experiência do usuário.</p>

	<h2>Descrição do Projeto</h2>
	<p>O HealthSure tem como objetivo proporcionar informações claras e
		centralizadas sobre saúde. Nossa plataforma integra artigos de
		notícias de diversas fontes, complementados por um bot capaz de
		fornecer respostas sensíveis ao contexto, oferecendo assim uma
		experiência abrangente e personalizada para os usuários.</p>

	<h2>Como Usar</h2>
	<p>Para interagir com a API HealthSure, utilize os endpoints
		fornecidos para usuários e artigos de notícias. Siga os métodos de
		solicitação especificados para cada operação.</p>

	<h2>Endpoints</h2>

	<h3>Usuários</h3>
	<ul>
		<li><strong>GET /usuarios/cadastro</strong>: Obter uma lista de
			todos os usuários.</li>
		<li><strong>GET /usuarios/{id_usuario}</strong>: Obter
			informações sobre um usuário específico por ID.</li>
		<li><strong>POST /usuarios/cadastro</strong>: Criar um novo
			usuário.</li>
		<li><strong>POST /usuarios/login</strong>: Fazer login com
			credenciais de usuário.</li>
		<li><strong>PUT /usuarios/{id_usuario}</strong>: Atualizar
			informações sobre um usuário específico por ID.</li>
		<li><strong>DELETE /usuarios/{id_usuario}</strong>: Excluir um
			usuário por ID.</li>
	</ul>

	<h3>Notícias</h3>
	<ul>
		<li><strong>GET /noticias</strong>: Obter uma lista de todos os
			artigos de notícias.</li>
	</ul>

	<h2>Contato</h2>
	<p>
		Para perguntas ou suporte, entre em contato conosco pelo e-mail <a
			href="mailto:info@healthsure.com">info@healthsure.com</a>.
	</p>

	<p>
		Para obter mais informações sobre o uso desta API, consulte a <a
			href="http://jersey.java.net">documentação do Projeto Jersey</a>.
	</p>

</body>
</html>
