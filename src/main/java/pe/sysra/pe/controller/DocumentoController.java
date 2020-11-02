package pe.sysra.pe.controller;

/*Creado por: Helmer Martinez*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.sysra.pe.entity.Documento;
import pe.sysra.pe.service.DocumentoService;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {
	
	@Autowired
	private DocumentoService docService;
	
	@DeleteMapping("/del/{id}")
	public int delete(@PathVariable int id ) {
		return docService.delete(id);
	}
	
	@PostMapping("/add")
	public int create(@RequestBody Documento d) {
		return docService.create(d);
	}

}
