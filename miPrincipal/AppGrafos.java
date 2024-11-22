package miPrincipal;
import java.util.Scanner;   
import grafos.matrizAdyacencia.Vertice;
import grafos.matrizAdyacencia.GrafoMatriz;
public class AppGrafos{
    public static void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("**********************************");
            System.out.println("             GRAFOS               ");
            System.out.println("**********************************");
            System.out.println("1) Matriz de Adyacencia           ");
            System.out.println("2) Lista de Adyacencia            ");
            System.out.println("3) Recorrido Anchura y Profundidad");          
            System.out.println();
            System.out.println("0) SALIR                          ");
            System.out.println("**********************************");
            System.out.print("Selecciona opción:");
            opc=entrada.nextInt();
            switch (opc) {
                case 1:
                    matrizAdyacencia();
                    break;
                case 2:
                    listaAdyacencia();
                    break;
                case 3:
                    recorridos();
                    break;
                
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("opción inválida");
            }   
                    


        }while (opc != 0);
    }
    public static void matrizAdyacencia(){
        System.out.println("********************************");
        System.out.println("       MATRIZ DE ADYACENCIA     ");
        System.out.println("********************************");
        //crear un grafo
        GrafoMatriz grafo = new GrafoMatriz();
        grafo.nuevoVertice("D");
        grafo.nuevoVertice("F");
        grafo.nuevoVertice("K");
        grafo.nuevoVertice("L");
        grafo.nuevoVertice("R");
        try{
            grafo.nuevoArco("D","F");
            grafo.nuevoArco("D","K");
            grafo.nuevoArco("F", "D");
            grafo.nuevoArco("L", "K");
            grafo.nuevoArco("L", "F");
            grafo.nuevoArco("R", "D");
            System.out.println("Adyacente D y F?"+grafo.adyacente("D","F"));
            System.out.println("Adyacente F y D?"+grafo.adyacente("F","D"));
            System.out.println("Adyacente R y F?"+grafo.adyacente("R","F"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(("Vertices:"));
        System.out.println(grafo.imprimirVertices());
        System.out.println("Matriz de Adyacencia:");
        System.out.println(grafo.imprimirMatriz());

        
       
    }
    public static void listaAdyacencia(){
        System.out.println("********************************");
        System.out.println("       LISTA ADYACENCIA         ");
        System.out.println("********************************");
    }
    public static void recorridos(){
        System.out.println("***********************************");
        System.out.println(" RECORRIDO ANCHURA  y PROFUNDIDAD  ");   
        System.out.println("***********************************");
         //crear un grafo
         GrafoMatriz grafo = new GrafoMatriz();
         grafo.nuevoVertice("A");
         grafo.nuevoVertice("B");
         grafo.nuevoVertice("C");
         grafo.nuevoVertice("D");
         grafo.nuevoVertice("H");
         grafo.nuevoVertice("R");
         grafo.nuevoVertice("T");
         try{
             grafo.nuevoArco("B","H");
             grafo.nuevoArco("C","R");
             grafo.nuevoArco("D", "C");
             grafo.nuevoArco("D", "B");
             grafo.nuevoArco("H", "A");
             grafo.nuevoArco("H", "T");
             grafo.nuevoArco("R", "H");
             System.out.println("Recorrido Anchura");
             GrafoMatriz.recorrerAnchura(grafo, "D");
             System.out.println("Recorrido Profundidad");
             GrafoMatriz.recorrerProfundidad(grafo,"D");
         }
         catch(Exception e){
             e.printStackTrace();
         }
         
        

    }
    
}