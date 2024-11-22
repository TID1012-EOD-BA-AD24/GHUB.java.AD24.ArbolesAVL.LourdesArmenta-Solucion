package miPrincipal;

import java.util.Scanner;
import arbolAVL.*;


public class AppArbolAVL{
    public static void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("********************************");
            System.out.println("       ARBOLES AVL              ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.out.println("4) Mostrar árbol               ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.print("Selecciona opción:");
            System.out.print("Selecciona opción:");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    insertarNodos();
                    break;
                case 2:
                    buscarNodo();
                    break;
                 case 3:
                    eliminarNodos();
                     break;
                 case 4:
                    System.out.println("Opcion inválida");

                 default:

            }
        } while (opc != 0);
    }
    public static void insertarNodos(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolAVL abo = new ArbolAVL();

        try{
            //insertar algunos elemento
            /* 
            abo.insertar(new Entero(2));
            abo.insertar(new Entero(4));
            abo.insertar(new Entero(6));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            abo.insertar(new Entero(10));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            abo.insertar(new Entero(20));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            */
            //vamos a comparar con el árbol solamente ordenado
            
            abo.insertar(new Entero(10));
            abo.insertar(new Entero(15));
            abo.insertar(new Entero(30));
            abo.insertar(new Entero(40));
            abo.insertar(new Entero(50));
            abo.insertar(new Entero(60));
            abo.insertar(new Entero(70));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            

           

        }
        catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
        System.out.println("Recorrido inorden");
        abo.inorden();
        System.out.println();

    


    }
    public static void eliminarNodos() {
        System.out.println("**** ELIMINAR NODOS ****");

        ArbolAVL abo = new ArbolAVL();
        try{
            abo.insertar(new Entero(10));
            abo.insertar(new Entero(15));
            abo.insertar(new Entero(30));
            abo.insertar(new Entero(40));
            abo.insertar(new Entero(50));
            abo.insertar(new Entero(60));
            abo.insertar(new Entero(70));
           
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());

            //Elimino un nodo hoja
            System.out.println("Elimino 70 que es un noso Hoja");
            abo.eliminar(new Entero(70));
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            //Elimino un nodo que solo tenga un hijo
            System.out.println("Elimo 60 que solo tiene un hijo izquierdo");
            abo.eliminar(new Entero(60));
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            //Elimo un nodo que tenga hijo izquierdo e hijo derecho
            System.out.println("Elimino 40 que tiene ambos hijos");
            abo.eliminar(new Entero(40));
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());



           
            
        }
        catch(Exception e){
            System.out.println("error "+e.getMessage());
        }

    }
    public static void buscarNodo(){
        System.out.println("**** BUSCAR NODOS ****");
        ArbolAVL abo = new ArbolAVL();

        try{
            abo.insertar(new Entero(10));
            abo.insertar(new Entero(15));
            abo.insertar(new Entero(30));
            abo.insertar(new Entero(40));
            abo.insertar(new Entero(50));
            abo.insertar(new Entero(60));
            abo.insertar(new Entero(70));
            Nodo buscado = abo.buscar(new Entero(50));
            System.out.println("Elemento buscado = "+buscado.getValor());
            buscado = abo.buscar(new Entero(100));
            if (buscado != null)
                    System.out.println("Elemento buscado = "+buscado.getValor());
            else
            System.out.println("No encontrado");

        }
        catch(Exception e){
            System.out.println("error "+e.getMessage());

        }
    }


}
