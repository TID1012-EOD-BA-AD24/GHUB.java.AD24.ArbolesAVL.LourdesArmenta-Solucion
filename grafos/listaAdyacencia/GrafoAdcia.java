package grafos.listaadyacencia.modelo;

import java.util.ArrayList;

/**
 * 
 * Clase que define el grafo como una Lista de Adyacencia. Implementa las
 * operaciones basicas para los grafos: añadir vertice, insertar arco, dar de
 * baja un vertice y su arcos...
 * 
 */
public class GrafoAdcia {
	// Vector de vertices
	private ArrayList<VerticeAdy> vectorVertices;

	/**
	 * Constructor parametrizado Crea la lista de adyacencia para un numero de
	 * vertices preestablecido.
	 * 
	 * @param maxVerts
	 *            total de vertices a crear
	 */
	public GrafoAdcia() {
		vectorVertices = new ArrayList<VerticeAdy>();
	}

	// Operaciones basicas: nuevoVertice(), nuevoArco(),
	// borrarArco(),adyacente(), borrarVertice()

	/**
	 * Recibe la etiqueta (string) de un vertice del grafo, comprueba si ya esta
	 * en la lista de vertices, en caso negativo incrementa el numero de
	 * vertices y lo asigna a la lista
	 * 
	 * @param nom
	 *            nombre del vertice
	 */
	public void nuevoVertice(String nom) throws Exception {
		if (existeVertice(nom))
			throw new Exception("Vertice ya existe");
		VerticeAdy vert = new VerticeAdy(nom);
		vectorVertices.add(vert);
	}

	/**
	 * Determina si existe un vertice
	 * 
	 * @param nom
	 *            nombre del vertice a buscar en la estructura general
	 * @return true si existe
	 */
	public boolean existeVertice(String nom) {
		for (VerticeAdy va : vectorVertices) {
			if (va.getNombre().equals(nom))
				return true;
		}
		return false;
	}

	/**
	 * Recibe el nombre de cada vertice del arco, busca el numero de vertice
	 * asignado a cada uno de ellos y crea el arco en el vertice respectivo
	 * 
	 * @param a
	 *            nombre del primer vertice
	 * @param b
	 *            nombre del segundo vertice
	 * @throws Exception
	 */
	public void nuevoArco(String a, String b) throws Exception {
		if (!(existeVertice(a) && existeVertice(b)))
			throw new Exception("Vertice no existe");

		VerticeAdy vertice = buscarVertice(a);
		vertice.nuevoArco(b);
	}

	/**
	 * Recibe el nombre de cada vertice del arco, busca el numero de vertice
	 * asignado a cada uno de ellos y crea el arco en el vertice respectivo
	 * 
	 * @param a
	 *            nombre del primer vertice
	 * @param b
	 *            nombre del segundo vertice
	 * @param peso
	 *            peso del arco
	 * @throws Exception
	 */

	public void nuevoArco(String a, String b, int peso) throws Exception {
		if (!(existeVertice(a) && existeVertice(b)))
			throw new Exception("Vertice no existe");

		VerticeAdy vertice = buscarVertice(a);
		vertice.nuevoArco(b, peso);
	}

	/**
	 * Borra un vertice
	 * 
	 * @param nom
	 *            nombre del vertice a borrar
	 * @throws Exception
	 */
	public void borrarVertice(String nom) throws Exception {
		if (!(existeVertice(nom)))
			throw new Exception("Vertice no existe");
		// Recorre el vector de vertices para eliminar el solicitado
		int i = 0;
		while (i < vectorVertices.size()) {
			VerticeAdy va = vectorVertices.get(i);
			if (va.getNombre().equals(nom)) {
				vectorVertices.remove(i);
			} else {
				va.borrarArco(nom);
				i++;
			}
		}
	}

	/**
	 * Borra el arco a, b
	 * 
	 * @param a
	 *            nombre del primer vertice
	 * @param b
	 *            nombre del segundo vertice
	 * @throws Exception
	 */
	public void borrarArco(String a, String b) throws Exception {
		if (!(existeVertice(a) && existeVertice(b)))
			throw new Exception("Vertice no existe");
		VerticeAdy va = buscarVertice(a);
		va.borrarArco(b);
	}

	/**
	 * Busca un vertice a partir del nombre
	 * 
	 * @param nom
	 *            nombre del vertice
	 * @return El objeto VerticeAdy, null si no no lo encuentra
	 */
	private VerticeAdy buscarVertice(String nom) {
		for (VerticeAdy va : vectorVertices) {
			if (va.getNombre().equals(nom))
				return va;
		}
		return null;
	}

	/**
	 * Determinan si dos vertices v1 y v2, forman un arco; es decir, si el
	 * elemento de la matriz de adyacenciad es 1.
	 * 
	 * @param a
	 *            nombre del primer vertice
	 * @param b
	 *            nombre del segundo vertice
	 * @return true si forman un arco, false en caso contrario
	 * @throws Exception
	 */
	public boolean adyacente(String a, String b) throws Exception {

		if (!(existeVertice(a) && existeVertice(b)))
			throw new Exception("Vertice no existe");
		VerticeAdy vertice = buscarVertice(a);
		return vertice.existeArco(b);
	}

	/**
	 * Imprime la lista de adyacencia, en forma horizontal los arcos de cada
	 * vertice
	 * 
	 * @return lista de adyacencia
	 */
	public String imprimirListaAdyacencia() {
		String res = "";
		for (VerticeAdy va : vectorVertices) {
			res = res + va.getNombre() + " arcos: " + va.getListaAdyacencia()
					+ "\n";
		}
		return res;
	}

	/**
	 * Imprime los nombres de los vertices
	 * 
	 * @return Cadena con los nombres de los vertices
	 */
	public String imprimirVertices() {
		String res = "";
		for (VerticeAdy va : vectorVertices)
			res = res + va.getNombre() + " ";
		return res;
	}

}
