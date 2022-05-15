package ar.edu.unju.edm.util;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import ar.edu.unju.edm.Model.ListaralReves;

@Component
public class ListaEnteros {
	private List<ListaralReves> numero = new ArrayList<>(); //List es una interfaz , implementacion de List es ArrayList
	
	public ListaEnteros() {
		// TODO Auto-generated constructor stub
	}

	public List<ListaralReves> getListado() {
		return numero;
	}

	public void setListado(List<ListaralReves> numero) {
		this.numero = numero;
	}	
}