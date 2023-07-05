package pe.edu.galaxy.apipedidosc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Demo {

	@GetMapping
	public String demo() {
		return "Hola mundo";
	}
	
	@GetMapping("/nombre")
	public String demo(@RequestParam String n) {
		return "Hola mundo: " + n;
	}
	
}
