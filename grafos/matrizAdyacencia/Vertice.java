package grafos.matrizAdyacencia;
// Representa un nodo del grafo, con su nombre
public class Vertice {
	// Nombre del vertice o nodo
	private String nombre;

	// Constructor
	public Vertice(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return nombre;
	}
}