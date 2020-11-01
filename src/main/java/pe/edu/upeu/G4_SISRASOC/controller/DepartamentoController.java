package pe.edu.upeu.G4_SISRASOC.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.G4_SISRASOC.service.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	@Autowired
	private DepartamentoService departamentoService;
	@GetMapping("/all")
	public List<Map<String, Object>> listar() {
		return departamentoService.readAll();
	}
}
