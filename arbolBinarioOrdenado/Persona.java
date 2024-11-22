package arbolBinarioOrdenado;
public class Persona implements Comparable{
    private int id;
    private String nombre;
    public Persona(int id, String nombre){
        this.id =id;
        this.nombre = nombre;
    }
    public Persona(){
        this(0,"");
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;

    }
    public boolean esMenor(Object q){
        Persona obj =(Persona)q;
        return (this.nombre.compareTo(obj.getNombre())<0);
        

    }
    public boolean esMayor(Object q){
        Persona obj =(Persona)q;
        return (this.nombre.compareTo(obj.getNombre())>0);

    }
    public boolean esIgual(Object q){
        Persona obj =(Persona)q;
        //return (id==obj.getId());
        return (this.nombre.equals(obj.getNombre()));

    }
}