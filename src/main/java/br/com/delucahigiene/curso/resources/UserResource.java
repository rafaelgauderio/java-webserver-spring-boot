package br.com.delucahigiene.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.delucahigiene.curso.entities.User;

//Recurso Web implementado por um controlador REST
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> FindAll() {
		User user = new User(1L, "Rafael", "maria@gmail.com", "99945678", "hygie123*");
		User user2 = new User(2L, "Juliana", "juliana@gmail.com", "99945673", "juju123*");
		return ResponseEntity.ok().body(user2);
	}

}
