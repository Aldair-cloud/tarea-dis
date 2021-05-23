package pe.edu.upeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.entity.Usuario;
import pe.edu.upeu.service.UsuarioService;

@CrossOrigin(origins = "http://localhost:5432\", maxAge = 3600")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/")
	public List<Usuario> traerTodo(){
		return usuarioService.readAll();
	}
	
	@PostMapping("/add")
	public String crear(@RequestBody Usuario usuario) {
		usuarioService.create(usuario);
		return "Usuario creado !";
	}
	
	@DeleteMapping("/{id}")
	public String eliminar(@PathVariable Long id) {
		usuarioService.delete(id);
		return "Usuario eliminado !";
	}
	
	@PutMapping("/update/{id}")
	public String modificar(@RequestBody Usuario usuario,@PathVariable Long id) {
		//El @RequestBody, recibe el objeto enviado.
		Usuario user = usuarioService.read(id);
		user.setUsername(usuario.getUsername());
		user.setEmail(usuario.getEmail());
		user.setPhone(usuario.getPhone());
		
		usuarioService.create(user);
		return "Usuario actualizado !";
	}
}
