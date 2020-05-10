package Instituto;

public class Biblioteca {

	int numeroLibros;
	String TrabajadorNombre;
	int CodigoLibro;

	public Biblioteca(int numLibros, String trabajadorNombre, int codigoLibro) {
		super();
		this.numeroLibros = numLibros;
		TrabajadorNombre = trabajadorNombre;
		CodigoLibro = codigoLibro;
	}

	public int getNumLibros() {
		return numLibros;
	}

	public void setNumLibros(int numLibros) {
		this.numLibros = numLibros;
	}

	public String getTrabajadorNombre() {
		return TrabajadorNombre;
	}

	public void setTrabajadorNombre(String trabajadorNombre) {
		TrabajadorNombre = trabajadorNombre;
	}

	public int getCodigoLibro() {
		return CodigoLibro;
	}

	public void setCodigoLibro(int codigoLibro) {
		CodigoLibro = codigoLibro;
	}

	public void MostrarNumeroLibros(int numeroLibros) {
		
	}
	
	public void Prestamo() {
		
	}
	
	public void Devolucion() {
		
	}
}
