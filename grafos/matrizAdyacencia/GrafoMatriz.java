package grafos.matrizAdyacencia;
import colas.Cola;
import pilas.Pila;


// Representa el grafo, tiene la matriz de adyacencia y un vector de vertices
public class GrafoMatriz {
	// Constantes
	public static int MAX_VERTICES = 20;
	public static int INFINITO = 1000000;
	// Numero total de vertices
	private int numVerts;
	// Vector de vertices
	private Vertice[] verts;
	// Matriz de adyacencia
	private int[][] matAd;

	// Constructor por defecto, invoca al constructor parametrizado
	public GrafoMatriz() {
		this(MAX_VERTICES);
	}

	/**
	 * Inicializa en cero la matriz de adyacencia
	 * 
	 * @param tot
	 *            total de vertices del grafo
	 */
	public GrafoMatriz(int tot) {
		this.matAd = new int[tot][tot];
		verts = new Vertice[tot];
		// Se recorre la matriz e inicializa en ceros
		for (int i = 0; i < tot; i++)
			for (int j = 0; j < tot; j++)
				this.matAd[i][j] = 0;
		this.numVerts = 0;
	}

	/**
	 * Inicializa con INFINITO la matriz de pesos (matriz valorada)
	 */
	public void inicializarMatrizPesos() {
		for (int i = 0; i < numVerts; i++)
			for (int j = 0; j < numVerts; j++)
				this.matAd[i][j] = INFINITO;
	}

	/**
	 * Devuelve la matriz de adyacencia o de pesos
	 * 
	 * @return
	 */
	public int[][] getMatriz() {
		return this.matAd;
	}

	/**
	 * Crea un nuevo vertice. Verifica que no este en el vector
	 * 
	 * @param nom
	 *            nombre del vertice
	 */
	public void nuevoVertice(String nom) {
		boolean esta = numVertice(nom) >= 0;
		if (!esta) {
			Vertice v = new Vertice(nom);
			verts[numVerts++] = v;
		}
	}

	/**
	 * Busca el numero de vertice en el vector a partir del nombre, devuelve -1
	 * si no lo encuentra
	 * 
	 * @param nom
	 *            nombre del vertice
	 */
	public int numVertice(String nom) {
		int i = 0;
		while (i < numVerts) {
			if (verts[i].getNombre().equals(nom))
				return i;
			i++;
		}
		return -1;
	}

	/**
	 * Devuelve el nombre del vertice dado el numero o posicion del vector
	 * 
	 * @param v
	 *            vertice
	 * @return nombre del vertice
	 */
	public String nombreVertice(int v) {
		return verts[v].getNombre();
	}

	/**
	 * Crea un nuevo arco. Recibe el nombre de cada vertice del arco, busca el
	 * numero de vertice asignado a cada uno de ellos y marca la matriz de
	 * adyacencia.
	 * 
	 * @param a
	 *            nombre del primer vertice
	 * @param b
	 *            nombre del segundo vertice
	 * @throws Exception
	 */
	public void nuevoArco(String a, String b) throws Exception {
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0)
			throw new Exception("Vertice no existe");
		matAd[va][vb] = 1;
	}

	/**
	 * Crea un nuevo arco valorado. Recibe el nombre de cada vertice del arco,
	 * busca el numero de vertice asignado a cada uno de ellos y marca la matriz
	 * de adyacencia con el peso.
	 * 
	 * @param a
	 *            nombre del primer vertice
	 * @param b
	 *            nombre del segundo vertice
	 * @throws Exception
	 */
	public void nuevoArco(String a, String b, int peso) throws Exception {
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0)
			throw new Exception("Vertice no existe");
		matAd[va][vb] = peso;
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
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0)
			throw new Exception("Vertice no existe");
		return matAd[va][vb] == 1;
	}

	/**
	 * Determinan si dos vertices 1 y 2, forman un arco
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws Exception
	 */
	public boolean adyacente(int a, int b) throws Exception {

		if (a < 0 || b < 0)
			throw new Exception("Vertice no existe");
		return matAd[a][b] == 1;
	}

	/**
	 * Imprime la matriz de adyacencia
	 * 
	 * @return cadena con la matriz de unos y ceros
	 */
	public String imprimirMatriz() {
		String res = "";
		for (int i = 0; i < numVerts; i++) {
			for (int j = 0; j < numVerts; j++) {
				res = res + matAd[i][j] + " ";
			}
			res = res + "\n";
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
		for (int i = 0; i < numVerts; i++)
			res = res + verts[i].getNombre() + " ";
		return res;
	}

	/**
	 * Devuelve el total de vertices del grafo
	 * 
	 * @return total de vertices
	 */
	public int numeroDeVertices() {
		return numVerts;
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
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0)
			throw new Exception("Vertice no existe");
		// Borrar el arco equivale a poner 0
		matAd[va][vb] = 0;
	}

	/**
	 * Borra un vertice
	 * 
	 * @param nom
	 *            nombre del vertice a borrar
	 * @throws Exception
	 */
	public void borrarVertice(String nom) throws Exception {
		int va;
		va = numVertice(nom);
		if (va < 0)
			throw new Exception("Vertice no existe");

		// Borrarlo del vector de vertices
		Vertice vertsAux[] = new Vertice[numVerts - 1];
		int iAux = 0;
		// Copiar todos los elementos menos el que se va a borrar
		for (int i = 0; i < numVerts; i++) {
			if (i != va) {
				vertsAux[iAux] = verts[i];
				iAux++;
			}
		}
		// borrarlo de la matriz de adyacencia
		int matAdAux[][] = new int[numVerts - 1][numVerts - 1];
		int jAux = 0;
		iAux = 0;
		// Copiar todos los elementos menos el que se va a borrar
		for (int i = 0; i < numVerts; i++) {
			if (i != va) {

				jAux = 0;
				for (int j = 0; j < numVerts; j++) {
					if (j != va) {
						matAdAux[iAux][jAux] = matAd[i][j];
						jAux++;

					}
				}
				iAux++;
			}
		}
		// Renombrar
		this.verts = vertsAux;
		this.matAd = matAdAux;
		numVerts--;
	}

	/**
	 * Recorrido en anchura
	 * 
	 * @param g
	 * @param origen
	 * @return
	 * @throws Exception
	 */
	public static int[] recorrerAnchura(GrafoMatriz g, String origen)
			throws Exception {
		int w, v;
		int[] m;
		v = g.numVertice(origen);
		int CLAVE = -1;
		if (v < 0)
			throw new Exception("Vertice de origen no existe");

		Cola<Integer> cola = new Cola<Integer>();
		m = new int[g.numeroDeVertices()];
		// Finaliza los vertices como no marcados
		for (int i = 0; i < g.numeroDeVertices(); i++)
			m[i] = CLAVE;// No marcado
		m[v] = 0; // Marcado
		//cola.encolar(new Integer(v));
		cola.encolar(Integer.valueOf(v));
		while (!cola.esVacia()) {
			Integer cw;
			cw = cola.frente();
			cola.desencolar();
			w = cw.intValue();
			System.out.println("Vertice " + g.verts[w] + " visitado");
			// Inserta en la cola los adyacentes de w no marcados
			for (int u = 0; u < g.numeroDeVertices(); u++)
				if ((g.matAd[w][u] == 1) && (m[u] == CLAVE)) {
					// Se marca vertice u con numero de arcos hasta el
					m[u] = m[w] + 1;

					//cola.encolar(new Integer(u));
					cola.encolar(Integer.valueOf(u));
				}
		}
		return m;
	}

	/**
	 * Recorrido en profundidad
	 * 
	 * @param g
	 * @param origen
	 * @return
	 * @throws Exception
	 */

	public static int[] recorrerProfundidad(GrafoMatriz g, String origen)
			throws Exception {
		int w, v;
		int[] m;
		v = g.numVertice(origen);
		int CLAVE = -1;
		if (v < 0)
			throw new Exception("Vertice de origen no existe");

		Pila<Integer> pila = new Pila<Integer>();
		m = new int[g.numeroDeVertices()];
		// Finaliza los vertices como no marcados
		for (int i = 0; i < g.numeroDeVertices(); i++)
			m[i] = CLAVE;// No marcado
		m[v] = 0; // Marcado
		//pila.apilar(new Integer(v));
		pila.apilar(Integer.valueOf(v));
		while (!pila.esVacia()) {
			Integer cw;
			cw = pila.cima();
			pila.retirar();
			w = cw.intValue();
			System.out.println("Vertice " + g.verts[w] + " visitado");
			// Inserta en la pila los adyacentes de w no marcados
			for (int u = 0; u < g.numeroDeVertices(); u++)
				if ((g.matAd[w][u] == 1) && (m[u] == CLAVE)) {
					// Se marca vertice u con numero de arcos hasta el
					m[u] = m[w] + 1;
					//pila.apilar(new Integer(u));
					pila.apilar(Integer.valueOf(u));
				}
		}
		return m;
	}

	/**
	 * Algoritmo de Warshall. Obtiene la matriz de caminos P. Es de orden O(n^3)
	 * 
	 * @param g
	 *            grafo
	 * @return matriz ce caminos
	 * @throws Exception
	 */
	public static int[][] matrizCaminos(GrafoMatriz g) throws Exception {
		int n = g.numeroDeVertices();
		// Matriz de caminos
		int[][] P = new int[n][n];
		// Se obtiene la matriz inicial: matriz de adyacencia
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				P[i][j] = g.adyacente(i, j) ? 1 : 0;
		// Se obtienen a partir de P0, las sucesivas matrices P1, P2, ... Pn que
		// es la de caminos
		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					P[i][j] = Math.min(P[i][j] + P[i][k] * P[k][j], 1);

		return P;
	}
}