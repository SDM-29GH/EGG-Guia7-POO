/*2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
package guia7_ejercicio2;

import java.util.Locale;
import java.util.Scanner;


public class Principal_eje2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Circunferencia circunferencia = new Circunferencia();
        
        System.out.println("CALCULAR AREA Y PERIMETRO DE LA CIRCUNFERENCIA");
        System.out.println("Ingrese el valor del radio de la circunferencia: ");
        double radio = entrada.nextDouble();
        
        
        circunferencia.crearCircunferencia(radio);
        circunferencia.area();
        circunferencia.perimetro();
        
    }
    
}
