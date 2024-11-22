package grafos.listaadyacencia.modelo;

import java.util.ArrayList;
// Representa un vertice, que contiene una lista adyacente de arcos
public class VerticeAdy {
	// Nombre del vertice
	private String nombre;

	// Lista de adyacencia
	private ArrayList<Arco> lad;

	// Constructor
	public VerticeAdy(String nombre) {
		this.nombre = nombre;
		lad = new ArrayList<Arco>();
	}

	/**
	 * Crea un nuevo arco
	 * 
	 * @param destino
	 *            vertice destino
	 * @throws Exception
	 */
	public void nuevoArco(String destino) throws Exception {
		if (existeArco(destino))
			throw new Exception("Vertice destino ya existe");
		Arco arco = new Arco(destino);
		lad.add(arco);
	}

	/**
	 * Crea un nuevo arco
	 * 
	 * @param destino
	 *            vertice destino
	 * @param peso
	 *            peso en los grafos valorados
	 * @throws Exception
	 */
	public void nuevoArco(String destino, int peso) throws Exception {
		if (existeArco(destino))
			throw new Exception("Vertice destino ya existe");
		Arco arco = new Arco(destino, peso);
		lad.add(arco);
	}

	/**
	 * Examina si un arco existe o no
	 * 
	 * @param destino
	 *            destino del vertice
	 * @return
	 */
	public boolean existeArco(String destino) {
		for (Arco arco : lad) {
			if (arco.getDestino().equals(destino))
				return true;
		}
		return false;
	}

	/**
	 * Borra un arco de la lista de adyacencia
	 * 
	 * @param nom
	 *            nombre del vertice destino a borrar
	 */
	public void borrarArco(String nom) {
		for (int i = 0; i < lad.size(); i++) {
			Arco arco = lad.get(i);
			if (arco.getDestino().equals(nom))
				lad.remove(i);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getListaAdyacencia() {
		String res = "";
		for (Arco arco : lad) {
			res = res + " " + arco.getDestino();
		}
		return res;
	}

	public boolean equals(VerticeAdy n) {
		return nombre.equals(n.nombre);
	}

	public String toString() {
		return nombre;
	}
}
