package arbolBinario;
public class Nodo {
    public Object valor;
    public Nodo izquierdo;
    public Nodo derecho;

    public Nodo(){
        this.valor = null;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    public Nodo(Object valor){
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    public Object getValor(){
        return this.valor;
    }
    public void setValor(Object valor){
        this.valor = valor;
    }
    public Nodo getIzquierdo(){
        return this.izquierdo;
    }
    public void setIzquierdo(Nodo izquierdo){
        this.izquierdo = izquierdo;
    }   
    public Nodo getDerecho(){
        return this.derecho;
    }
    public void setDerecho(Nodo derecho){
        this.derecho = derecho;
    }
}