package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.Model.Alumno1;

@Controller
public class AlumnoController1 
{
	
	double[] notas = {9,6,10,4,2};
	Alumno1 dato = new Alumno1();
	
	@GetMapping("/calcularPromedio")
	public String getPromedioPage(Model model)
	{
		double resultadoP = 0;
		resultadoP = dato.calcularPromedio(notas);
		model.addAttribute("resultadoP", resultadoP);
		return "resultadoPromedio";
	}
	
	@GetMapping("/obtenerNotaMaxima")
	public String getNotaMaxPage(Model model)
	{
		double resultadoM = 0;
		resultadoM = dato.obtenerNotaMaxima(notas);
		model.addAttribute("resultadoM", resultadoM);
		return "resultadoMax";
	}
	
	@GetMapping("/getNombre")
	public String getNombreApellidoPage(@RequestParam (name = "nombre") String nombre, @RequestParam (name = "apellido") String apellido, Model model, Model model2)
	{
		String nombreA = "";
		dato.setNombre(nombre);
		nombreA = dato.getNombre();
		model.addAttribute("nombreA", nombreA);
		
		String apellidoA = "";
		dato.setApellido(apellido);
		apellidoA = dato.getApellido();
		model2.addAttribute("apellidoA", apellidoA);
		
		return "nombreAlumno";
	}
	
	@GetMapping("/getLibretaU")
	public String getLibretaPage(@RequestParam (name = "libretaU") int libretaU, Model model)
	{
		int libretaA = 0;
		dato.setLibretaU(libretaU);
		libretaA = dato.getLibretaU();
		model.addAttribute("libretaA", libretaA);
		return "libretaAlumno";
	}
	
}
