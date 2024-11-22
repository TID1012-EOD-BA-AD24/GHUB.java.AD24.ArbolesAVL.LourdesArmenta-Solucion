package interfases2;

import java.util.Comparator;

public class CriterioPersonaId implements Comparator<Persona>{
    public int compare(Persona a, Persona b) {
        return a.getId() - b.getId();
    }
    
}
