

package interfases;
/*
 * La interfaz Comparable en Java se utiliza para ordenar colecciones y matrices de objetos. 
 * Esta interfaz tiene un único método llamado compareTo(T obj),
 *  que se utiliza para comparar el objeto actual con el objeto especificado.

El método compareTo(T obj) devuelve:

Un número negativo si el objeto actual es menor que el objeto especificado.
Cero si el objeto actual es igual al objeto especificado.
Un número positivo si el objeto actual es mayor que el objeto especificado.

 */

public class Util {
    public static <T extends Comparable<T>> void ordenar(T[] arr){
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j].compareTo(arr[j+1])<0) {
                    T aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
    public static <T> void ordenar(T[] arr, Criterio<T> cr){
        boolean ordenado = false;
        while(!ordenado){
            ordenado = true;
            for (int i = 0; i < arr.length-1; i++) {
                //Ahora la decición sobre quién ordena a quién
                //lo toma la clase criterio
                if (cr.comparar(arr[i], arr[i+1])<0) {
                    T aux = (T)arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }
        
    }

    public static <T> void imprimir(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    
}


