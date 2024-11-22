
package demoClaseTree;
import java.util.TreeSet;
public class DemoClaseTree {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        //inserto elementos en el arbol
        t.add(5);
        t.add(3);
        t.add(9);
        t.add(2);

        //mostrar los elementos del arbol
        System.out.println(t.contains(5));
        System.out.println(t.contains(12));
        System.out.println();

        
    }
    
}
