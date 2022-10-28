/* 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
package guia7_ejercicio4;

import java.util.Locale;
import java.util.Scanner;


public class Rectangulo {
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    // Atributo
    private int base, altura;
    int superficie, perimetro, i, j;
    
    // CONSTRUCTOR VACIO
    public void Rectangulo(){
    
    }
    // CONSTRUCTOR PARAMETRIZAZO
    public void Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    // METODO get y set
    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getAltura(){
        return altura;
    }

    
    
    
//              METODOS
    
    public void crearRectangulo(){
        System.out.println("Ingrese el valor de la base: ");
        base = leer.nextInt();
        
        System.out.println("Ingrese el valor de la altura");
        altura = leer.nextInt();
    }
    
    public void calcularSuperficie(){
        superficie = base * altura;
    }
    
    public void calcularPerimetro(){
        perimetro = (base + altura) * 2;
    }
    
    public void mostrarResultado(){
        System.out.println("La superficie es: " + superficie);
        System.out.println("El perimetro es: " + perimetro);
    }
    
    public void dibujarRectangulo(){
        i = base; j = altura;
        
        for (int i = 0 ; i < altura ; i++) {
            for (int j = 0 ; j < base ; j++) {
                if( i == 0 || i == altura - 1 || j == 0 || j == base - 1){
                    System.out.print(" * ");
                }
                else {
                System.out.print("   ");
                }
           
            }
        
        System.out.println();
                
        }
    }
}
