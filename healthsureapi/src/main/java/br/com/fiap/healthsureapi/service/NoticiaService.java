package br.com.fiap.healthsureapi.service;

import java.util.List;

import br.com.fiap.healthsureapi.data.NoticiaDao;
import br.com.fiap.healthsureapi.model.Noticia;

public class NoticiaService {

	private NoticiaDao noticiaDao;

	public List<Noticia> findAll() {
		try {
			noticiaDao = new NoticiaDao();
			return noticiaDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Dados não encontrados.");
			return null;
		}
	}
}
