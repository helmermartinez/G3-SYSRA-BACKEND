package pe.edu.upeu.G4_SISRASOC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping
	public String mensaje() {
		return "Bienvenidos a Mi Tabla departamento Con Oracle";
	}

}
