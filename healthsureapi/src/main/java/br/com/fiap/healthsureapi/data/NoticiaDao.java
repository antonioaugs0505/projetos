package br.com.fiap.healthsureapi.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.healthsureapi.model.Noticia;

public class NoticiaDao {

	private Connection conexao;

	public NoticiaDao() throws SQLException {
		conexao = ConnectionFactory.getConnection();
	}

	public List<Noticia> findAll() throws SQLException {
		var lista = new ArrayList<Noticia>();
		var comando = conexao.prepareStatement("SELECT * FROM tg_noticia");
		var resultado = comando.executeQuery();

		while (resultado.next()) {
			lista.add(new Noticia(resultado.getLong("id_noticia"), resultado.getString("nm_titulo"),
					resultado.getString("nm_subtitulo"), resultado.getString("dt_noticia"),
					resultado.getString("ds_imagem"), resultado.getString("ds_link")));
		}

		return lista;
	}
}
