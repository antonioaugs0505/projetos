package br.com.fiap.healthsureapi.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.healthsureapi.model.Usuario;

public class UsuarioDao {

	private Connection conexao;

	public UsuarioDao() throws SQLException {
		conexao = ConnectionFactory.getConnection();
	}

	public List<Usuario> findAll() throws SQLException {
		var lista = new ArrayList<Usuario>();
		var comando = conexao.prepareStatement("SELECT * FROM tg_usuario");
		var resultado = comando.executeQuery();

		while (resultado.next()) {
			lista.add(new Usuario(resultado.getLong("id_usuario"), resultado.getString("nm_usuario"),
					resultado.getString("nr_cpf"), resultado.getString("nm_rg"), resultado.getString("dt_nascimento"),
					resultado.getString("fl_genero"), resultado.getString("dt_cadastro"),
					resultado.getString("nm_email"), resultado.getString("nm_senha")));
		}
		return lista;
	}

	public Usuario findById(Long idUsuario) throws SQLException {

		var comando = conexao.prepareStatement("SELECT * FROM tg_usuario WHERE id_usuario=?");
		comando.setLong(1, idUsuario);
		var resultado = comando.executeQuery();

		if (resultado != null && resultado.next()) {
			return new Usuario(resultado.getLong("id_usuario"), resultado.getString("nm_usuario"),
					resultado.getString("nr_cpf"), resultado.getString("nm_rg"), resultado.getString("dt_nascimento"),
					resultado.getString("fl_genero"), resultado.getString("dt_cadastro"),
					resultado.getString("nm_email"), resultado.getString("nm_senha"));
		} else {
			return null;
		}
	}

	public void cadastrar(Usuario usuario) throws SQLException {
		var novoId = getNextId();
		usuario.setIdUsuario(novoId);

		var comando = conexao.prepareStatement(
				"INSERT INTO tg_usuario (id_usuario, nm_usuario, nm_email, nm_senha, nr_cpf) VALUES (?, ?, ?, ?, ?)");

		comando.setLong(1, usuario.getIdUsuario());
		comando.setString(2, usuario.getNmUsuario());
		comando.setString(3, usuario.getNmEmail());
		comando.setString(4, usuario.getNmSenha());
		comando.setString(5, usuario.getNrCpf());

		comando.executeUpdate();
	}

	public void deleteById(Long idUsuario) throws SQLException {
		var comando = conexao.prepareStatement("DELETE FROM tg_usuario WHERE id_usuario=?");
		comando.setLong(1, idUsuario);
		comando.executeUpdate();
	}

	public void update(Usuario usuario) throws SQLException {
		var comando = conexao.prepareStatement(
				"UPDATE tg_usuario SET nr_cpf=?, nm_usuario=?, dt_nascimento=?, nm_rg=?, fl_genero=?, nm_email=?, nm_senha=?, dt_cadastro=? WHERE id_usuario=?");
		comando.setString(1, usuario.getNrCpf());
		comando.setString(2, usuario.getNmUsuario());
		comando.setString(3, usuario.getDtNascimento());
		comando.setString(4, usuario.getNm_Rg());
		comando.setString(5, usuario.getFlGenero());
		comando.setString(6, usuario.getNmEmail());
		comando.setString(7, usuario.getNmSenha());
		comando.setString(8, usuario.getDtCadastro());
		comando.setLong(9, usuario.getIdUsuario());

		comando.executeUpdate();
	}

	public Usuario findByEmailAndSenha(String email, String senha) throws SQLException {
		var comando = conexao.prepareStatement("SELECT * FROM tg_usuario WHERE nm_email=? AND nm_senha=?");
		comando.setString(1, email);
		comando.setString(2, senha);
		var resultado = comando.executeQuery();

		if (resultado != null && resultado.next()) {
			return new Usuario(resultado.getLong("id_usuario"), resultado.getString("nm_usuario"),
					resultado.getString("nr_cpf"), resultado.getString("nm_rg"), resultado.getString("dt_nascimento"),
					resultado.getString("fl_genero"), resultado.getString("dt_cadastro"),
					resultado.getString("nm_email"), resultado.getString("nm_senha"));
		} else {
			return null;
		}
	}

	public Long getNextId() throws SQLException {
		var comando = conexao
				.prepareStatement("SELECT id_usuario FROM TG_Usuario ORDER BY id_usuario DESC FETCH NEXT 1 ROWS ONLY");
		var resultado = comando.executeQuery();

		if (resultado.next()) {
			var id = resultado.getLong("id_usuario") + 1;
			System.out.println(id);
			return id;
		} else {
			return null;
		}
	}
}
