package ar.edu.unju.edm.Controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.edm.Model.Alumno;
import ar.edu.unju.edm.util.ListadoAlumnos;

@Controller
public class alumnoController {

	@GetMapping("/mostrarAlumnos")
	public String getListado(Model model) {
	//Creacion de alumno
	Alumno alumnito = new Alumno();
		System.out.println("ingresando al metodo");
	Alumno alumno1 = new Alumno("Lisandro", "Alejo", LocalDate.of(2003,6,18), 44812842, 38848769, "aaaaaa", 11111, alumnito.calcularEdad(LocalDate.of(2003,6,18)));
	Alumno alumno2 = new Alumno("Brisa", "Ontiveros", LocalDate.of(2001,7,14), 44812843, 38848768, "aaaaab", 11112, alumnito.calcularEdad(LocalDate.now()));
	Alumno alumno3 = new Alumno("Leonardo", "Soto", LocalDate.parse("2003-06-20"), 44812844, 38848767, "aaaabb", 11113, alumnito.calcularEdad( LocalDate.parse("2003-06-20")));

	ListadoAlumnos nombre = new ListadoAlumnos();
	//ingreso datos correspondientes
	nombre.getListado().add(alumno1);
	nombre.getListado().add(alumno2);
	nombre.getListado().add(alumno3);
	//Enviar listado a la vista
	model.addAttribute("listadoAlumnos", nombre.getListado());
	System.out.println("saliendo al metodo");
	return "mostrarA";
 	}

}
