package ar.edu.unju.edm.Model;

import org.springframework.stereotype.Component;

@Component
public class Alumno1 {

	private String nombre, apellido;
	int libretaU, i;
	double[] notas;
	
	public Alumno1() {
		// TODO Auto-generated constructor stub
	}
	
	public double calcularPromedio(double[] notas)
	{	
		double acu= 0, pro;
		for(i=0; i<5;i++)
		{
			acu = acu + notas[i];
		}
		pro = acu/i;
		return pro;
	}
	
	public double obtenerNotaMaxima(double[] notas)
	{
		double max = 0;
		for(i=0; i<5; i++)
		{
			if(notas[i] > max)
				max = notas[i];			
		}
		
		return max;
	}
	
	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLibretaU() {
		return libretaU;
	}

	public void setLibretaU(int libretaU) {
		this.libretaU = libretaU;
	}
}