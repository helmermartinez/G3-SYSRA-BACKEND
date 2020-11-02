package pe.sysra.pe.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import pe.sysra.pe.entity.Asociacion;
import pe.sysra.pe.service.AsociacionService;

@RestController
@RequestMapping("/asociaciones")
public class AsociacionController {
	@Autowired
	private AsociacionService asociacionService;

	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return asociacionService.readAll();
	}

//crear nuevo registro
	@PostMapping("/asociacion")
	public int create(@RequestBody Asociacion r) {
		return asociacionService.create(r);
	}
	@GetMapping("/{id}")
	public  Map<String, Object> read (@PathVariable int id) {
		return asociacionService.read(id);
		
	}
	@DeleteMapping("/delete/{id}")
	public int delete (@PathVariable int id) {
		return asociacionService.delete(id);
	}

}
