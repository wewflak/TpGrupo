package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.Model.Texto;

@Controller
public class TextoController {
	
	Texto pal = new Texto();

//	GetMapping mismo nombre de lo que esta en el index
	@GetMapping("/inverso")
	public String getInversoPage(@RequestParam (name = "texto") String texto, Model model, Model model2)
	{
		pal.setMens(texto);
		char[] resultadoI = pal.inverso(pal.getMens());
		model.addAttribute("resultadoI", resultadoI);		
		model2.addAttribute("texto", texto);
		return "textoInvertido";
	}
}
