package ar.edu.unju.edm.Model;

import org.springframework.stereotype.Component;

@Component
public class ListaralReves {
public ListaralReves() {
	// TODO Auto-generated constructor stub
}
public int numero;
public ListaralReves(int numero) {
	super();
	this.numero = numero;
}
public int getNum() {
	return numero;
}
public void setNum(int numero) {
	this.numero = numero;
}

}
