package pe.sysrasoc.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.sysrasoc.Service.Casa_vecinalService;

@RestController
@RequestMapping("/casa_vecinal")
public class Casa_vecinalController {
	@Autowired
	private Casa_vecinalService casa_vecinalService;
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
		return casa_vecinalService.readAll();
	}
}