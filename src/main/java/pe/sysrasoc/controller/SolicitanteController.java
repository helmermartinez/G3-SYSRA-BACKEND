package pe.sysrasoc.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.sysrasoc.service.SolicitanteService;

@RestController
@RequestMapping("/solicitante")
public class SolicitanteController {
	@Autowired
	private SolicitanteService solicitanteService;
	
	@GetMapping("/all")
	public List<Map<String, Object >> listar(){
		return solicitanteService.readAll();
	}

}
