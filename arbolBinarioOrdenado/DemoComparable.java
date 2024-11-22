package arbolBinarioOrdenado;
public class DemoComparable {
    public static void main(String[] args) {
        Persona p1 = new Persona(20,"ana");
        Persona p2 = new Persona(10, "bana");
        if (p1.esMenor(p2)) {
            System.out.println(p1.getNombre() + " es menor rque " + p2.getNombre());
        } else {
            System.out.println(p1.getNombre() + " no es menor que " + p2.getNombre());
        }
    }
}