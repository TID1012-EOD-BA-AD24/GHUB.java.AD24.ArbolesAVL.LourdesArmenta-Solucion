
package miPrincipal;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*******************************");
            System.out.println("       ARBOLES Y GRAFOS        ");
            System.out.println("********************************");
            System.out.println("1) Arboles Binarios             ");
            System.out.println("2) Arboles Binarios de Búsqueda ");
            System.out.println("3) Arboles AVL                  ");
            System.out.println("4) Grafos                       ");
            System.out.println("                                ");
            System.out.println("0) SALIR                        ");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppArbol.menu();
               break;
            case 2:
               AppArbolBinarioBusqueda.menu();
               break;
            case 3:
               AppArbolAVL.menu();
               break;
            case 4:
               AppGrafos.menu();
               break;
           
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
            default:
               System.out.println("Valor incorrecto, intente de nuevo!");
        }
       
    }while (opc != 0);
		
   }
}