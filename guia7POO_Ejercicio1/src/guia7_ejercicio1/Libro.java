/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
*/
package guia7_ejercicio1;


public class Libro {
    
    private String Título, Autor;
    private int Isbn, NroDePaginas;
    
    // Constructor vacío
    public Libro() {  
    }
    
    // Constructor con Atributos pasados por parámetros o parametrizado
    public Libro(int Isbn, String Título, String Autor, int NroDePaginas) {
        this.Isbn = Isbn;
        this.Título = Título;
        this.Autor = Autor;
        this.NroDePaginas = NroDePaginas;
    }
    
    public void setTítulo(String Título) {
        this.Título = Título;
    }
    
    public String getTítulo() {
        return Título;
    }
    
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    public String getAutor() {
        return Autor;
    }
    
    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }
    
    public int getIsbn() {
        return Isbn;
    }
    
    public void setNroDePaginas(int NroDePaginas) {
        this.NroDePaginas = NroDePaginas;
    }
    
    public int getNroDePaginas() {
        return NroDePaginas;
    }


    
}
