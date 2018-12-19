
package clases;

import javax.swing.JOptionPane;


public class Lista {
    
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        } else{
            return false;
        }
    }
    
    public void insertar(Libro libro){
        Nodo actual;
        if(estaVacia()){
            actual = new Nodo(libro,null);
            inicio = actual;
            fin = actual;
        } else{
            actual = new Nodo(libro,null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    
    public void mostrar(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "No se encontraron elementos en la lista");
        } else{
            Nodo temporal;
            temporal = inicio;
            while(temporal!=null){
                JOptionPane.showMessageDialog(null, temporal.getDato().toString());
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public boolean consultar(String libId){
        boolean resultado = false;
       if(estaVacia()){
            JOptionPane.showMessageDialog(null, "No se encontraron elementos en la lista");
            return resultado;
        } else{
            Nodo temporal;
            temporal = inicio;
            while(temporal!=null){
                if(libId.equals(temporal.getDato().getIdLibro())){
                    JOptionPane.showMessageDialog(null, temporal.getDato().toString());
                    resultado = true;
                }
                temporal = temporal.getSiguiente();
            }
        }
       
       return resultado;
    }
    
    public boolean existeID(String libId){
       boolean resultado = false;
       if(estaVacia()){
            JOptionPane.showMessageDialog(null, "No se encontraron elementos en la lista");
            return resultado;
        } else{
            Nodo temporal;
            temporal = inicio;
            while(temporal!=null){
                if(libId.equals(temporal.getDato().getIdLibro())){
                    resultado = true;
                }
                temporal = temporal.getSiguiente();
            }
        }
       
       return resultado;
    }
     
     public boolean ordenada() {
        if (!estaVacia()) {
            Nodo reco1=inicio;
            Nodo reco2=inicio.getSiguiente();
            while (reco2!=null) {
                if (Integer.parseInt(reco2.getDato().getCantLibro())<
                        Integer.parseInt(reco1.getDato().getCantLibro())) {
                    return false;
                }
                reco2=reco2.getSiguiente();
                reco1=reco1.getSiguiente();
            }
        }
        return true;
    }
    
    public void eliminar(String libId){
        if(!estaVacia()){
            if(inicio==fin && libId.equals(inicio.getDato().getIdLibro())){
                inicio = fin = null;
            } else if(libId.equals(inicio.getDato().getIdLibro())){
                inicio = inicio.getSiguiente();
                } else{
                    Nodo anterior, temporal;
                    anterior = inicio;
                    temporal = inicio.getSiguiente();
                    while(temporal!=null && !(temporal.getDato().getIdLibro().equals(libId))){
                        anterior = anterior.getSiguiente();
                        temporal = temporal.getSiguiente();
                    }

                    if(temporal!=null){
                        anterior.setSiguiente(temporal.getSiguiente());
                        if(temporal == fin){
                            fin = anterior;
                        }
                    }
            }
        }
    }
    
    
    public void modificar(String idLibro, String titulo, String cantidad){
        Nodo temporal = inicio;
        while(!(temporal==null)){
            if(temporal.getDato().getIdLibro().equals(idLibro)){
                temporal.setDato(new Libro(idLibro,titulo,cantidad));
                break;
            }
            temporal = temporal.getSiguiente();
        }
    }
}
