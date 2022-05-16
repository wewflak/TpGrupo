package ar.edu.unju.edm.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.Model.Persona;

@Controller
public class personaController {
	@Autowired Persona persona;
	@GetMapping("/calculopersona")
	public ModelAndView getEdad (@RequestParam (name= "fecha") String fecha) {
		//formato por defecto de local date (aÃ±o-mes-dia)
		persona.setFecha(LocalDate.parse(fecha));
		
		//calcular la edad
		String resultadoEdad=persona.getEdad();
		String resultadoSigno=persona.getSigno();
		String resultadoEstacion= persona.getEstacion();
		
		
		//mandar el resultado a la vista
		ModelAndView modelView = new ModelAndView("punto1");
		
		modelView.addObject("resultado1",resultadoEdad);
		modelView.addObject("resultado2",resultadoSigno);
		modelView.addObject("resultado3",resultadoEstacion);
		return modelView;
	}


		
		

}