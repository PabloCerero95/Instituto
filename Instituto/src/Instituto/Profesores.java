package Instituto;

import java.util.ArrayList;

public class Profesores implements Personas {

	ArrayList<Profesores> profesores = new ArrayList<Profesores>();
	String nombre;
	int curso;
	int edad;
	String asignatura;
	
	public Profesores(ArrayList<Profesores> profesores, String nombre, int curso, int edad, String asignatura) {
		super();
		this.profesores = profesores;
		this.nombre = nombre;
		this.curso = curso;
		this.edad = edad;
		this.asignatura = asignatura;
	}

	public ArrayList<Profesores> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesores> profesores) {
		this.profesores = profesores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public void MostrarDatos(ArrayList<Profesores> profesores) {
		
	}
	
	public void HacerExamen(String asignatura) {
		
	}
}
