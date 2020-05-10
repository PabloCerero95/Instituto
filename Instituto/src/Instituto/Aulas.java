package Instituto;

import java.util.ArrayList;

public class Aulas {

	int curso;
	String letra;
	int numAlumnos;
	ArrayList<Aulas> aulas = new ArrayList<Aulas>();
	public Aulas(int curso, String letra, int numAlumnos, ArrayList<Aulas> aulas) {
		super();
		this.curso = curso;
		this.letra = letra;
		this.numAlumnos = numAlumnos;
		this.aulas = aulas;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public int getNumAlumnos() {
		return numAlumnos;
	}
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	public ArrayList<Aulas> getAulas() {
		return aulas;
	}
	public void setAulas(ArrayList<Aulas> aulas) {
		this.aulas = aulas;
	}
	
	public void MostrarDatos(ArrayList<Aulas> aulas) {
		
	}
	public void ModificarNumeroDeAlumnos(int numAlumnos) {
		
	}
}


