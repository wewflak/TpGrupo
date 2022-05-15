package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.Model.Punto4;
@Controller

public class Punto4Controller {
	@Autowired
	Punto4 punto04;
	
	@GetMapping("/calculopar")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public ModelAndView getcalculoMultiplos(@RequestParam (name = "num1") String numero){
	   punto04.setNum1(Integer.valueOf(numero));
	   String resultadoM = punto04.generarMultiplos();
	   ModelAndView modelView = new ModelAndView("resultadopar") ;
	   modelView.addObject("resultadoM", resultadoM);
	   modelView.addObject("numero", numero);
	   return modelView;
}
}

