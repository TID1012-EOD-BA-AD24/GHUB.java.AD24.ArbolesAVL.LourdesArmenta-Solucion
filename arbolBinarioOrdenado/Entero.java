package arbolBinarioOrdenado;
public class Entero implements Comparable{
    private int dato;
    public Entero(int dato){
        this.dato = dato;
    }
    public Entero(){
        this(0);
    }
    public int getDato(){
        return dato;
    }
    public void setDato(int dato){
        this.dato = dato;
    }
    public boolean esIgual(Object q){
        Entero obj = (Entero)q;
        return (dato==obj.dato);

    }
    public boolean esMayor(Object q){
        Entero obj = (Entero)q;
        return (dato>obj.dato);
        
    }
    public boolean esMenor(Object q){
        Entero obj = (Entero)q;
        return (dato<obj.dato);
        
    }
    public String toString(){
        return ""+dato;
    }

}