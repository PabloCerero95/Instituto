package Instituto;

import java.util.ArrayList;

public class Directiva {

	String nombre;
	int Edad;
	String cargo;
	ArrayList<Directiva> directiva = new ArrayList<Directiva>();

	public Directiva(String nombre, int edad, String cargo, ArrayList<Directiva> directiva) {
		super();
		this.nombre = nombre;
		Edad = edad;
		this.cargo = cargo;
		this.directiva = directiva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public ArrayList<Directiva> getDirectiva() {
		return directiva;
	}

	public void setDirectiva(ArrayList<Directiva> directiva) {
		this.directiva = directiva;
	}

	public void MostrarDatos(ArrayList<Directiva> directiva) {

	}

	public void HacerReunion(String reunion) {

	}

}

