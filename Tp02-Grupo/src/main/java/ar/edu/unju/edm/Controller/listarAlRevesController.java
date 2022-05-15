package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.Model.ListaralReves;
import ar.edu.unju.edm.util.ListaEnteros;
@Controller
public class listarAlRevesController {



	@GetMapping ("/mostrarArregloInv")
	public String getListado(Model model) {
		//int resultadoNums[] = {1, 35, 46, 81, 2, 3, 4, 5, 9, 7};
		ListaralReves numero1 = new ListaralReves(1);
		ListaralReves numero2 = new ListaralReves(35);
		ListaralReves numero3 = new ListaralReves(46);
		ListaralReves numero4 = new ListaralReves(81);
		ListaralReves numero5 = new ListaralReves(2);
		ListaralReves numero6 = new ListaralReves(3);
		ListaralReves numero7 = new ListaralReves(4);
		ListaralReves numero8 = new ListaralReves(5);
		ListaralReves numero9 = new ListaralReves(9);
		ListaralReves numero10 = new ListaralReves(7);
		
		ListaEnteros numeros = new ListaEnteros(); 

		numeros.getListado().add(numero10);
		numeros.getListado().add(numero9);
		numeros.getListado().add(numero8);
		numeros.getListado().add(numero7);
		numeros.getListado().add(numero6);
		numeros.getListado().add(numero5);
		numeros.getListado().add(numero4);
		numeros.getListado().add(numero3);
		numeros.getListado().add(numero2);
		numeros.getListado().add(numero1);
		
		model.addAttribute("listaEnteros", numeros.getListado());
		return "resultadoNums";
	}
}
