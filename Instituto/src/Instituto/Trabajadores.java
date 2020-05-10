package Instituto;

import java.util.ArrayList;

public class Trabajadores implements Personas {
	ArrayList<Trabajadores> profesores = new ArrayList<Trabajadores>();
	String nombre;
	int edad;
	String Funcion;

	public Trabajadores(ArrayList<Trabajadores> profesores, String nombre, int edad, String funcion) {
		super();
		this.profesores = profesores;
		this.nombre = nombre;
		this.edad = edad;
		Funcion = funcion;
	}

	public ArrayList<Trabajadores> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Trabajadores> profesores) {
		this.profesores = profesores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFuncion() {
		return Funcion;
	}

	public void setFuncion(String funcion) {
		Funcion = funcion;
	}
	
	public void mostrarDatos(ArrayList<Trabajadores> profesores) {
		
	}
	
	public void Trabajar(String trabajo) {
		
	}
}
