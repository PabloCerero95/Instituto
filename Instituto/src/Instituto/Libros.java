package Instituto;

import java.util.ArrayList;

public class Libros {

	String nombreLibro;
	String asignatura;
	int codigoLibro;
	ArrayList<Libros> libro = new ArrayList<Libros>();

	public Libros(String nombreLibro, String asignatura, int codigoLibro, ArrayList<Libros> libro) {
		super();
		this.nombreLibro = nombreLibro;
		this.asignatura = asignatura;
		this.codigoLibro = codigoLibro;
		this.libro = libro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(int codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public ArrayList<Libros> getLibro() {
		return libro;
	}

	public void setLibro(ArrayList<Libros> libro) {
		this.libro = libro;
	}
	public void MostrarLibros(ArrayList<Libros> libro) {
		
	}
	public void AñadirLibro(String asignatura, String nombre, int codigoLibro) {
		
	}
}
