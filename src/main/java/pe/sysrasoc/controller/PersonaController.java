package pe.sysrasoc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.sysrasoc.entity.Persona;
import pe.sysrasoc.service.PersonaService;


@RestController
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
	private PersonaService personaService;


	@DeleteMapping("/del/{id}")
	public int delete(@PathVariable int id) {
		return personaService.delete(id);
	}
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar() {
		return personaService.readAll();
	}

}
