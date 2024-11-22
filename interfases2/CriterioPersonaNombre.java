package interfases2;

import java.util.Comparator;

public class CriterioPersonaNombre implements Comparator<Persona>{
    public int compare(Persona a, Persona b) {
        return a.getNombre().compareTo(b.getNombre());
    }
    
}
