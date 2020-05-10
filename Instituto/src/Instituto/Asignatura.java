package Instituto;

import java.util.ArrayList;

public class Asignatura {

	int codigo;
	String nombre;
	String profesor;
	ArrayList<Asignatura> asignatura = new ArrayList<Asignatura>();

	public Asignatura(int codigo, String nombre, String profesor, ArrayList<Asignatura> asignatura) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.profesor = profesor;
		this.asignatura = asignatura;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Asignatura> getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(ArrayList<Asignatura> asignatura) {
		this.asignatura = asignatura;
	}

	public void MostrarDatos(ArrayList<Asignatura> asignaturas) {

	}

	public void AñadirProfesor(String profesor) {

	}

	public void ModificarCodigo(int codigo) {

	}

	public void ModificarNombre(String nombre) {

	}
}
