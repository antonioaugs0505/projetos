package br.com.fiap.healthsureapi.service;

import java.util.List;

import br.com.fiap.healthsureapi.data.UsuarioDao;
import br.com.fiap.healthsureapi.model.Usuario;

public class UsuarioService {

	private UsuarioDao usuarioDao;

	public List<Usuario> findAll() {
		try {
			usuarioDao = new UsuarioDao();
			return usuarioDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Dados não encontrados.");
			return null;
		}
	}

	public Usuario findById(Long idUsuario) {
		try {
			usuarioDao = new UsuarioDao();
			return usuarioDao.findById(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar usuário.");
			return null;
		}
	}

	public boolean cadastrar(Usuario usuario) {

		
		try {
			usuarioDao = new UsuarioDao();
			usuarioDao.cadastrar(usuario);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao cadastrar usuário.");
			return false;
		}
	}

	public Usuario login(String email, String senha) {
		try {
			usuarioDao = new UsuarioDao();
			return usuarioDao.findByEmailAndSenha(email, senha);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao realizar login.");
			return null;
		}
	}

	public boolean atualizar(Usuario usuario) {
		try {
			usuarioDao = new UsuarioDao();
			usuarioDao.update(usuario);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao atualizar informações.");
			return false;
		}
	}

	public void delete(Long idUsuario) {
		if ((findById(idUsuario)) != null) {
			try {
				usuarioDao = new UsuarioDao();
				usuarioDao.deleteById(idUsuario);
			} catch (Exception e) {
				System.out.println("Erro ao deletar informações.");
				e.printStackTrace();
			}
		}
	}
}
