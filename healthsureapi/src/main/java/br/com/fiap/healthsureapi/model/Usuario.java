package br.com.fiap.healthsureapi.model;

public class Usuario {

	private Long idUsuario;
	private String nmUsuario;
	private String nrCpf;
	private String nm_Rg;
	private String dtNascimento;
	private String flGenero;
	private String dtCadastro;
	private String nmEmail;
	private String nmSenha;

	public Usuario() {
	}

	public Usuario(Long idUsuario, String nmUsuario, String nrCpf, String nm_Rg, String dtNascimento, String flGenero,
			String dtCadastro, String nmEmail, String nmSenha) {
		this.idUsuario = idUsuario;
		this.nmUsuario = nmUsuario;
		this.nrCpf = nrCpf;
		this.nm_Rg = nm_Rg;
		this.dtNascimento = dtNascimento;
		this.flGenero = flGenero;
		this.dtCadastro = dtCadastro;
		this.nmEmail = nmEmail;
		this.nmSenha = nmSenha;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public String getNrCpf() {
		return nrCpf;
	}

	public void setNrCpf(String nrCpf) {
		this.nrCpf = nrCpf;
	}

	public String getNm_Rg() {
		return nm_Rg;
	}

	public void setNm_Rg(String nm_Rg) {
		this.nm_Rg = nm_Rg;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getFlGenero() {
		return flGenero;
	}

	public void setFlGenero(String flGenero) {
		this.flGenero = flGenero;
	}

	public String getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(String dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

	public String getNmSenha() {
		return nmSenha;
	}

	public void setNmSenha(String nmSenha) {
		this.nmSenha = nmSenha;
	}

	
}
