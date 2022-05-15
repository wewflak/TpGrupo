package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuController {
	@GetMapping({"/menu","/index","/principal","/"})
	public String mostrarMenu() {
	
	return "menu";
	}
	
}
