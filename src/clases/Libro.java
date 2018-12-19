
package clases;

public class Libro {
    private String idLibro,nomLibro,cantLibro;

    public Libro() {
    }

    public Libro(String idLibro, String nomLibro, String cantLibro) {
        this.idLibro = idLibro;
        this.nomLibro = nomLibro;
        this.cantLibro = cantLibro;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getNomLibro() {
        return nomLibro;
    }

    public void setNomLibro(String nomLibro) {
        this.nomLibro = nomLibro;
    }

    public String getCantLibro() {
        return cantLibro;
    }

    public void setCantLibro(String cantLibro) {
        this.cantLibro = cantLibro;
    }

    @Override
    public String toString() {
        return "Detalles del libro " +"\n"+"ID : "+ idLibro + "\n"+"Nombre  : " + nomLibro + "\n"+ "Stock  : " + cantLibro;
    }
    
}
