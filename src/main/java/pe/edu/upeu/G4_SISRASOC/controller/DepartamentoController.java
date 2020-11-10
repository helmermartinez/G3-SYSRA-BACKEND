package pe.edu.upeu.G4_SISRASOC.controller;



import java.util.Map;

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

import pe.edu.upeu.G4_SISRASOC.entity.Departamento;
import pe.edu.upeu.G4_SISRASOC.service.DepartamentoService;


@RestController
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
@RequestMapping("/departamento")
public class DepartamentoController {
	@Autowired
	private DepartamentoService departamentoService;
	@GetMapping("/all")
	public Map<String, Object> listar() {
		return departamentoService.readAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return departamentoService.delete(id);
		
	}
	@PostMapping("/create")
	public int create(@RequestBody Departamento d) {
		return departamentoService.create(d);	
		
	}		
	@PutMapping("/update/{id}")
	public int update(@RequestBody Departamento d, @PathVariable int id) {
		
		d.setId_departamento(id);
		
		return departamentoService.update(d);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return departamentoService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}

	}
}
