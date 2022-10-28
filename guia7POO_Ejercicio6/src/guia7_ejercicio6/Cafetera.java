/*
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package guia7_ejercicio6;

import java.util.Locale;
import java.util.Scanner;


public class Cafetera {
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    // Atributos
    private double capacidadMaxima = 1000;
    private double cantidadActual;
    
    // CONSTRUCTOR VAVIO
    public void Cafetera() {
        
    }
    // CONSTRUCTOR PARAMETRIZADO
    public void Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    // METODO SET Y GET
    public void setCapacidadMaxima(double capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public void setCapacidadActual(double capacidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadActual() {
        return cantidadActual;
    }
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
        System.out.println("Se ha llenado la Cafetera");
    }
    /* • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza. */
    public void servirTaza(){
        int capacidadTaza = 250, cantidadCafe ;
        double capacidadMaxima = 1000;
        System.out.println("agregue la cantidad de café que desea servir en la taza: ");
        cantidadActual= leer.nextDouble();
            if(cantidadActual >= capacidadTaza){
                System.out.println("Se ha llenado la taza en su capacidad de: " + capacidadTaza);
            }else{
                System.out.println("Se cargó la taza hasta: " + cantidadActual + "de su capacidad máxima que es de " + capacidadTaza);
            }
    }
    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
        public void vaciarCafetera(){
            cantidadActual = 0;
            System.out.println("Se ha vaciado la cafetera");
        }
    /*• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.*/
        public void agregarCafe(){
            System.out.println("Agregue cafe en la cafetera");
            cantidadActual = leer.nextDouble();
                if(cantidadActual==capacidadMaxima){
                    System.out.println("Se ha llenado la cafetera  ");
                }else{
                    System.out.println("Se ha cargado la cafetera hasta " + cantidadActual+" cc de capacidad");
                }
        }

    
    
    
    
}
