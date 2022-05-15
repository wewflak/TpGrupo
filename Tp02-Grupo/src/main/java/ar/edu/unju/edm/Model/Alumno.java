package ar.edu.unju.edm.Model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
	private String apellido;
	private String nombre;
	private LocalDate fechadeN;
	private long dni;
	private long telefono;
	private String genero;
	private int  libretauni;
	private int edad;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String apellido, String nombre, LocalDate fechadeN,long dni, long telefono, String genero, int libretauni, int edad) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechadeN = fechadeN;
		this.dni = dni;
		this.telefono = telefono;
		this.genero = genero;
		this.libretauni = libretauni;
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechadeN() {
		return fechadeN;
	}

	public void setFechadeN(LocalDate fechadeN) {
		this.fechadeN = fechadeN;
	}
	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getLibretauni() {
		return libretauni;
	}

	public void setLibretauni(int libretauni) {
		this.libretauni = libretauni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int calcularEdad(LocalDate fecha) {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fecha, ahora);
			
			
		return  periodo.getYears();
	}
}
