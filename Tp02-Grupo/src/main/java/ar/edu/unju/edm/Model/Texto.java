package ar.edu.unju.edm.Model;

import org.springframework.stereotype.Component;

@Component
public class Texto {
	
	String mens;

	public char[] inverso(String text)
	{
//		convierte un String a un arreglo de caracteres
		char[] cadCar = text.toCharArray();
		
//		procedimiento para invertir un arreglo de caracteres
		char aux;
	    for (int i = 0; i < cadCar.length / 2; i++) {
	        aux = cadCar[i];
	        cadCar[i] = cadCar[cadCar.length - 1 - i];
	        cadCar[cadCar.length - 1 - i] = aux;
	    }
		return cadCar;
	}
	
	public String getMens() {
		return mens;
	}

	public void setMens(String mens) {
		this.mens = mens;
	}
}
