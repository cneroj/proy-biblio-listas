
package clases;

public class Nodo {
    private Nodo siguiente;
    private Libro dato;

    public Nodo(Libro dato,  Nodo siguiente) {
        this.siguiente = siguiente;
        this.dato = dato;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Libro getDato() {
        return dato;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }
   
}
