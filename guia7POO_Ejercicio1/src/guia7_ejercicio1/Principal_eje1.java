/*1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
package guia7_ejercicio1;

public class Principal_eje1 {

    public static void main(String[] args) {

        Libro book1 = new Libro();
        Libro book2 = new Libro(2022, "EL GRAN LIBRO DE LA PROGRAMACIÓN", "SDM", 303033333);

        book1.setTítulo("EL GRAN LIBRO DE ECONOMIA Y POLITICA");
        book1.setAutor("Autor: SERGIO DANIEL MARTÍNEZ");
        book1.setIsbn(2022202220);
        book1.setNroDePaginas(1200);

        System.out.println("*** LIBRO 1 ***");
        System.out.println("TÍTULO: " + book1.getTítulo());
        System.out.println("AUTOR: " + book1.getAutor());
        System.out.println("Isbn: " + book1.getIsbn());
        System.out.println("NÚMERO DE PAGINAS: " + book1.getNroDePaginas());

        System.out.println("*** LIBRO 2 ***");
        System.out.println("TÍTULO: " + book2.getTítulo());
        System.out.println("AUTOR: " + book2.getAutor());
        System.out.println("Isbn: " + book2.getIsbn());
        System.out.println("Número de Páginas: " + book2.getNroDePaginas());
    }
}
