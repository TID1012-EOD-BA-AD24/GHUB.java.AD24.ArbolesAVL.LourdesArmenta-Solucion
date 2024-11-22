package grafos.listaadyacencia.modelo;

/**
 * Representa un arco. Guarda el nombre del vertice destino y en los grafos 
 * valorados se guarda, el peso asociado al arco.
 * 
 */
public class Arco {
	// Nombre del vertice destino
	private String destino;
	// Peso del arco
	private int peso;

	// Constructor 
	public Arco(String destino) {
		this.destino = destino;
		this.peso=0;
	}
	
	// Constructor 
	public Arco(String destino, int peso) {
		this.destino = destino;
		this.peso = peso;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean equals(Object n) {
		Arco a = (Arco) n;
		return destino == a.destino;
	}
}
