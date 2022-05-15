package ar.edu.unju.edm.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;
@Component 
public class ProcesoFecha {
	private LocalDate fecha1;
	private LocalDate fecha2;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDateTime dateTime1;
	private LocalDateTime dateTime2;
	public ProcesoFecha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}
	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
	}
	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}
	public LocalDate getFecha1() {
		return fecha1;
	}
	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}
	public LocalDate getFecha2() {
		return fecha2;
	}
	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}
	public LocalTime getTime1() {
		return time1;
	}
	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}
	public LocalTime getTime2() {
		return time2;
	}
	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}
	public LocalDateTime getDateTime1() {
		return dateTime1;
	}
	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}
	public LocalDateTime getDateTime2() {
		return dateTime2;
	}
	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	//Parte 1
	public Period contarTiempoTranscurrido() {
		Period p=Period.between(fecha2, fecha1);
		return p;
		
	}
	//Parte 2
	public String formatearFecha(LocalDate fecha) {
		
		DateTimeFormatter nuevoFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String fechaFormateada = fecha.format(nuevoFormato);
		
		return fechaFormateada;
	}
	//Parte 3
	public String compararFechas() {
		
		String comparacion="";
		
		if(fecha1.compareTo(fecha2) > 0) {
		    comparacion=("La fecha "+fecha1+ " Es Posterior a la fecha " +fecha2);
		}else if(fecha1.compareTo(fecha2) < 0) {
			comparacion=("La fecha "+fecha1+" Es Anterior a la fecha "+fecha2);
		}else if(fecha1.compareTo(fecha2) == 0) {
			comparacion="Las fechas son iguales";
		}
		return comparacion;
	}
}
