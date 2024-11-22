package miPrincipal;
import arbolBinarioOrdenado.ArbolBinario;
import arbolBinarioOrdenado.Entero;
import arbolBinarioOrdenado.BTreePrinter;
import java.util.Scanner;
public class AppArbolBinarioBusqueda{
    public static void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("********************************");
            System.out.println("       ARBOLES BINARIOS         ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.print("Selecciona opción:");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                   insertarNodos();
                   break;
                case 2:
                   buscarNodos();
                   break;
                case 3:
                   eliminarNodos();
                   break;
                case 0:
                   System.out.println("Hasta luego");
                   break;
    
                default:
                    System.out.println("Opción inválida");
            }
            } while (opc != 0);
    }
      
    public static void insertarNodos(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try {
            arbol.insertar(new  Entero(10));
            arbol.insertar(new  Entero(20));
            arbol.insertar(new  Entero(30));
            arbol.insertar(new Entero(40));
            arbol.insertar(new Entero(50));
            arbol.insertar(new Entero(60));
            arbol.insertar(new Entero(70));
            //trato de insertar un repetido
            //arbol.insertar(new Entero(40));
            System.out.println();
            System.out.println("Recorrido Inorden");
            arbol.inorden();
            System.out.println();
            System.out.println("Recorrido PreOrden");
            arbol.preorden();
            System.out.println();
            System.out.println("Recorrido PostOrden");
            arbol.postorden();
            System.out.println();
            System.out.println("Impresion del árbol");
            BTreePrinter.printNode(arbol.getRaiz());

        } catch (Exception e) {
            
            e.printStackTrace();
        }  
        
    }
    public static void eliminarNodos(){
        System.out.println("**** ELIMINAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try {
            arbol.insertar(new  Entero(10));
            arbol.insertar(new  Entero(20));
            arbol.insertar(new  Entero(5));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(40));
            arbol.insertar(new Entero(4));
            System.out.println();
            System.out.println("Recorrido Inorden");
            arbol.inorden();
            System.out.println();
            System.out.println("Recorrido PreOrden");
            arbol.preorden();
            System.out.println();
            System.out.println("Recorrido PostOrden");
            arbol.postorden();
            System.out.println();
            System.out.println("Impresion del árbol");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Elimino Nodo 10");
            arbol.eliminar(new Entero(10));
            System.out.println("Elimino Nodo 40");
            arbol.eliminar(new Entero(40));
            System.out.println("Impresion del arbol despues de la eliminacion");
            BTreePrinter.printNode(arbol.getRaiz());
           
            System.out.println("Impresion del arbol despues de la eliminacion");
            BTreePrinter.printNode(arbol.getRaiz());



        } catch (Exception e) {
            
            e.printStackTrace();
        }  
        

    }
    public static void buscarNodos(){
        System.out.println("**** BUSCAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try {
            arbol.insertar(new  Entero(10));
            arbol.insertar(new  Entero(20));
            arbol.insertar(new  Entero(5));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(40));
            arbol.insertar(new Entero(4));
            System.out.println();
            System.out.println("Recorrido Inorden");
            arbol.inorden();
            System.out.println();
            System.out.println("Recorrido PreOrden");
            arbol.preorden();
            System.out.println();
            System.out.println("Recorrido PostOrden");
            arbol.postorden();
            System.out.println();
            System.out.println("Impresion del árbol");
            BTreePrinter.printNode(arbol.getRaiz());
            System.err.println("Busco el Dato 20 que existe:");
            System.out.println(arbol.buscar(new Entero(20)).getValor());
            System.out.println("Buscon un dato 11 que no existe:");
            System.out.println(arbol.buscar(new Entero(11)));
            //la linea de abajo marca error porque es nulo
            //System.out.println(arbol.buscar(new Entero(11)).getValor());


        } catch (Exception e) {
            
            e.printStackTrace();
        }  


    }
}