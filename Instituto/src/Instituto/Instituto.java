package Instituto;

//CLASE
public class Instituto {

	// ATRIBUTOS
	String nombre;
	String direccion;
	int telefono;

	// CONSTRUCTORES
	public Instituto() {

	}

	public Instituto(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// METODOS
	public void AbrirInstituto() {

	}

	public void CerrarInstituto() {

	}
}
