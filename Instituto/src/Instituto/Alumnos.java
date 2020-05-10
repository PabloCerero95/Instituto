package Instituto;

import java.util.ArrayList;

//CLASE
public class Alumnos implements Personas{
//ATRIBUTOS
	ArrayList<Alumnos> Alumnos = new ArrayList<Alumnos>();
	String nombre;
	int edad;
	int curso;
//CONSTRUCTORES
	public Alumnos(String nombre, int edad, int curso, ArrayList<Alumnos> Alumnos) {
		super();
		this.Alumnos = Alumnos;
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
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
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}

	public void MostrarDatos(ArrayList<Alumnos> Alumnos) {
		
	}
	
//METODOS
	public void ModificarAlumno(String nombre, int edad) {
		
	}
}


