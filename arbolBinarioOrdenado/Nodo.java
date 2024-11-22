package arbolBinarioOrdenado;
public class Nodo {
    public Comparable valor;
    public Nodo izquierdo;
    public Nodo derecho;

    public Nodo(){
        this.valor = null;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    public Nodo(Comparable valor){
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    public Comparable getValor(){
        return this.valor;
    }
    public void setValor(Comparable valor){
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