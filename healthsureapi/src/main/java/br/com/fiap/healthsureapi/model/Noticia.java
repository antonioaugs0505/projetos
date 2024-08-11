package br.com.fiap.healthsureapi.model;

public class Noticia {

	private Long id;
	private String nomeTitulo;
	private String nomeSubtitulo;
	private String dataNoticia;
	private String dsImagem;
	private String dsLink;

	public Noticia(Long id, String nomeTitulo, String nomeSubtitulo, String dataNoticia, String dsImagem,
			String dsLink) {
		this.id = id;
		this.nomeTitulo = nomeTitulo;
		this.nomeSubtitulo = nomeSubtitulo;
		this.dataNoticia = dataNoticia;
		this.dsImagem = dsImagem;
		this.dsLink = dsLink;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeTitulo() {
		return nomeTitulo;
	}

	public void setNomeTitulo(String nomeTitulo) {
		this.nomeTitulo = nomeTitulo;
	}

	public String getNomeSubtitulo() {
		return nomeSubtitulo;
	}

	public void setNomeSubtitulo(String nomeSubtitulo) {
		this.nomeSubtitulo = nomeSubtitulo;
	}

	public String getDataNoticia() {
		return dataNoticia;
	}

	public void setDataNoticia(String dataNoticia) {
		this.dataNoticia = dataNoticia;
	}

	public String getDsImagem() {
		return dsImagem;
	}

	public void setDsImagem(String dsImagem) {
		this.dsImagem = dsImagem;
	}

	public String getDsLink() {
		return dsLink;
	}

	public void setDsLink(String dsLink) {
		this.dsLink = dsLink;
	}

}
