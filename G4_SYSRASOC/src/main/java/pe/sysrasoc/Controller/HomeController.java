package pe.sysrasoc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.event.AuthenticationCredentialsNotFoundEvent;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import pe.sysrasoc.Entity.Casa_vecinal;
import pe.sysrasoc.security.JwtUtil;


@RestController
public class HomeController {
	@Autowired
	private ActionManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenidos a Microservicios Síncronos";
	}
	@GetMapping("/hola")
	public String mensaje2() {
		return "Bienvenidos a Microservicios Síncronos";
	}
	@GetMapping("/hola2")
	public String mensaje3() {
		return "Bienvenidos a Microservicios Síncronos";
	}
	@GetMapping("/hola1")
	public String mensaje4() {
		return "Bienvenidos a Microservicios Síncronos";
	}
	 @PostMapping("/authenticate")
	    public String generateToken(@RequestBody Casa_vecinal authRequest) throws Exception {
	        try {
	        	System.out.println(authRequest.getNombre_cv());
	            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNombre_cv(), authRequest.getRepresentante_cv()));
	        } catch (Exception ex) {
	            throw new Exception("Error: "+ex);
	        }
return jwtUtil.generateToken(authRequest.getNombre_cv());
	    }

}
