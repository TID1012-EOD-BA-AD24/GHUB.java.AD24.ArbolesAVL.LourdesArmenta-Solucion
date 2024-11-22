package interfases;

public class Persona implements Comparable<Persona>{
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
    
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }
    /* 
    public int compareTo(Persona otraPersona ){
       return this.id-otraPersona.getId();
        

    }
    */
    @Override
    public int compareTo(Persona otraPersona) {
        /* 
        return Integer.compare(this.id, otraPersona.getId());
        */
        if(this.nombre.compareTo(otraPersona.getNombre())<0){
            return -1;
        }else if(this.nombre.compareTo(otraPersona.getNombre())>0){
            return 1;
        }else{  
            return 0;
        }
        
    }
    
}