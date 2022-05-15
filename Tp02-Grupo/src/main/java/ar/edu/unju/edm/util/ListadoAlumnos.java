package ar.edu.unju.edm.util;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import ar.edu.unju.edm.Model.Alumno;
@Component
public class ListadoAlumnos {
	private List <Alumno> listado = new ArrayList<>();
	
	public ListadoAlumnos() {
		// TODO Auto-generated constructor stub
	}
		public List<Alumno> getListado() {
		return listado;
		}
		public void setListado(List<Alumno> listado) {
		this.listado = listado;
		}
	
}
