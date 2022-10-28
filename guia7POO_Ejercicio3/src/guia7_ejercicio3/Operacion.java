/*
3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package guia7_ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    // a)_ Atributo con el modificador de acceso privado
    private int numero1;
    private int numero2;
    int suma, resta, multiplicacion;
    double division;

    //Constructor parametrizado
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // b)_ Constructor vacio
    public Operacion() {

    }

    // c)_ Metodo get y set
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero2() {
        return numero2;
    }

    // d)_ Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public void crearOperacion() {

        System.out.println("Ingrese el numero 1: ");
        numero1 = leer.nextInt();

        System.out.println("Ingrese el numero 2: ");
        numero2 = leer.nextInt();

        //Operacion operacion = new Operacion(numero1, numero2);
        //return new Operacion(numero1, numero2);
    }

    // e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar() {
        suma = numero1 + numero2;
    }

    // f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public void restar() {
        resta = numero1 - numero2;
    }

    /* g) g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
    el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main*/
    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    /* h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
    el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se 
    devuelve el resultado al main.*/
    public void dividir() {
        division = numero1 / numero2;
    }

    public void mostrarSuma() {
        System.out.println("El valor de la suma es: " + suma);
    }

    public void mostrarResta() {
        System.out.println("El valor de la resta: " + resta);
    }

    public void mostrarMultiplicacion() {
        System.out.println("El valor de la multiplicacion es: " + multiplicacion);
        if (numero1 == 0 || numero2 == 0 || multiplicacion == 0) {
            System.out.println("Para multiplicar ingrese numero distinto de cero.");

            System.out.println("Ingrese el numero 1: ");
            numero1 = leer.nextInt();

            System.out.println("Ingrese el numero 2: ");
            numero2 = leer.nextInt();

            multiplicacion = numero1 * numero2;

            System.out.println("El valor de la multiplicacion es: " + multiplicacion);
        } 
    }

    public void mostrarDivision() {
        System.out.println("El valor de la division es: " + division);

        if (numero1 == 0 || numero2 == 0 || division == 0) {
            System.out.println("Para dividir ingrese numero distinto de cero.");

            System.out.println("Ingrese el numero 1: ");
            numero1 = leer.nextInt();

            System.out.println("Ingrese el numero 2: ");
            numero2 = leer.nextInt();

            division = numero1 / numero2;

            System.out.println("El valor de la division es: " + division);
        } 

    }

}
