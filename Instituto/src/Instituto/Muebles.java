package Instituto;

import java.util.ArrayList;

public class Muebles {

	int numeroSillas;
	int numeroMesas;
	int numeroPizarras;
	ArrayList<Muebles> muebles = new ArrayList<Muebles>();

	public Muebles(int numeroSillas, int numeroMesas, int numeroPizarras, ArrayList<Muebles> muebles) {
		super();
		this.numeroSillas = numeroSillas;
		this.numeroMesas = numeroMesas;
		this.numeroPizarras = numeroPizarras;
		this.muebles = muebles;
	}

	public int getNumeroSillas() {
		return numeroSillas;
	}

	public void setNumeroSillas(int numeroSillas) {
		this.numeroSillas = numeroSillas;
	}

	public int getNumeroMesas() {
		return numeroMesas;
	}

	public void setNumeroMesas(int numeroMesas) {
		this.numeroMesas = numeroMesas;
	}

	public int getNumeroPizarras() {
		return numeroPizarras;
	}

	public void setNumeroPizarras(int numeroPizarras) {
		this.numeroPizarras = numeroPizarras;
	}

	public ArrayList<Muebles> getMuebles() {
		return muebles;
	}

	public void setMuebles(ArrayList<Muebles> muebles) {
		this.muebles = muebles;
	}
	public void NumeroTotal(ArrayList<Muebles> muebles) {
		
	}
}
