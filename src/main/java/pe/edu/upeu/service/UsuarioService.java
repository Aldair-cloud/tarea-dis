package pe.edu.upeu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.entity.Usuario;
import pe.edu.upeu.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> readAll(){
		List<Usuario> users = new ArrayList<>();
		usuarioRepository.findAll().forEach(users::add);
		return users;
	}
	public Usuario create(Usuario user) {
		return usuarioRepository.save(user);
	}
	public void delete(Long id) {
		usuarioRepository.deleteById(id);
	}
	public Usuario read(Long id) {
		return usuarioRepository.findById(id).get();
	}
	public Usuario update(Usuario usuarios) {
		return usuarioRepository.save(usuarios);
	}
}
