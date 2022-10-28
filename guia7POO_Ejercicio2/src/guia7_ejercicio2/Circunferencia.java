/* 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
package guia7_ejercicio2;

import static java.lang.Math.PI;
import java.util.Locale;
import java.util.Scanner;


public class Circunferencia {
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    private double radio;
    private double area, perimetro;
    
    public Circunferencia(){
    }
    
    // Constructor parametrizado
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    // Método SET
    public void setradio(double radio) {
        this.radio = radio;   
    }
    
    // Método GET
    public double getradio() {
        return radio;
    }
    
    
    // Método crearCircunferencia()
    public void crearCircunferencia(double radio){
        this.radio = radio;
        System.out.println("El valor del radio de la circunferencia es: " + radio);
    
    }
    
    public void area(){
        area = PI * Math.pow(radio, 2);
        System.out.println("El valor del area de la circunferencia es: " + area);
    
    }
    
    public void perimetro(){
        perimetro = 2 * PI * radio;
        System.out.println("El valor del perimetro de la circunferencia es: " + perimetro);
    }
    
}
