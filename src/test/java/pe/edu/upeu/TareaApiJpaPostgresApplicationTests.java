package pe.edu.upeu;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.entity.Usuario;
import pe.edu.upeu.service.UsuarioService;

@SpringBootTest
class TareaApiJpaPostgresApplicationTests {
	@Autowired
	UsuarioService userService;
	@Test
	void contextLoads() {
		List<Usuario> lista = new ArrayList<>();
		lista = userService.readAll();
		System.out.println(lista.get(0).getUsername());
	}

}
