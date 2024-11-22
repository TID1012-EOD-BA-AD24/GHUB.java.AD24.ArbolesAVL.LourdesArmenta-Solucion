package interfases;

public class CriterioPersonaNombre extends Criterio<Persona>{
    public int comparar(Persona a, Persona b) {
        return a.getNombre().compareTo(b.getNombre());
    }
    
}
