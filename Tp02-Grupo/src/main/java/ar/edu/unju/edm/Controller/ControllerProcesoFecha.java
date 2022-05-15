package ar.edu.unju.edm.Controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.Model.ProcesoFecha;

@Controller

public class ControllerProcesoFecha {
	@Autowired
	ProcesoFecha procesoFecha;

	@GetMapping("/calcularTiempoTranscurrido")

	public ModelAndView getTiempoTranscurrido(@RequestParam(name = "fecha1") String fecha1,
			@RequestParam(name = "fecha2") String fecha2) {

		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));

		Period tiempoTranscurrido = procesoFecha.contarTiempoTranscurrido();

		ModelAndView modelView = new ModelAndView("paginaWebProcesoFecha1");
		modelView.addObject("tiempoYears", tiempoTranscurrido.getYears());
		modelView.addObject("tiempoMonths", tiempoTranscurrido.getMonths());
		modelView.addObject("tiempoDays", tiempoTranscurrido.getDays());

		return modelView;
	}
	@GetMapping("/formatearFechas")

	public ModelAndView getFormatearPage(@RequestParam(name = "fecha1") String fecha1,
			@RequestParam(name = "fecha2") String fecha2) {

		ModelAndView modelView = new ModelAndView("/paginaWebProcesoFecha2");

		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));

		modelView.addObject("resultadoFecha1", procesoFecha.formatearFecha(procesoFecha.getFecha1()));
		modelView.addObject("resultadoFecha2", procesoFecha.formatearFecha(procesoFecha.getFecha2()));

		return modelView;
	}
	
	@GetMapping("/compararFechas")

	public ModelAndView getCompararPage(@RequestParam(name = "fecha1") String fecha1,
			@RequestParam(name = "fecha2") String fecha2) {

		ModelAndView modelView = new ModelAndView("/paginaWebProcesoFecha3");

		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));

		String formateo1 = procesoFecha.formatearFecha(procesoFecha.getFecha1());
		String formateo2 = procesoFecha.formatearFecha(procesoFecha.getFecha2());

		procesoFecha.setFecha1(LocalDate.parse(formateo1, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		procesoFecha.setFecha2(LocalDate.parse(formateo2, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		String resultadoComparacion = procesoFecha.compararFechas();

		modelView.addObject("resultadoCompararFechas", resultadoComparacion);

		return modelView;
	}
}
