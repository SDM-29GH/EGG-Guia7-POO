/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/

package guia7_ejercicio5;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    //Atributos
    private int numeroCuenta = 123456789,saldoActual, ingreso, retiro, extraccion;
    private long dni;
    int saldoInicial = 1000;
    String nombre, apellido, consulta;
    //CONSTRUCTOR VACIO
    public void Cuenta(){
    
    }
    // CONSTRUCTOR PARAMETRIZADO
    public void Cuenta(int numeroCuenta, int saldoActual, long dni){
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dni = dni;
    }
    // METODO GET Y SET
    public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public int getSaldoActual(){
        return saldoActual;
    }
    
    public void setDNI(long dni){
        this.dni = dni;
    }
    
    public long getDNI(){
        return dni;
    }
    
    //      METODOS
    // • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public void crearCuenta(){
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese su apellido: ");
        apellido = leer.next();
        System.out.println("Ingrese su DNI: ");
        dni = leer.nextLong();
        System.out.println("Bienvenido. Su saldo inicial es: " + saldoInicial);
    }
    /*• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    ingresar y se la sumara a saldo actual.*/
    public void ingresar(){
        System.out.println("Ingrese la cantidad que desea ingresar: ");
        ingreso = leer.nextInt();
        System.out.println("Su saldo actual es: " + (saldoInicial + ingreso));
    }
    /*• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y 
    se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.*/
    public void retirar(){
        System.out.println("Ingrese la cantidad que desea retirar: ");
        retiro = leer.nextInt();
        System.out.println("Su saldo actual es: " + (saldoInicial - retiro));
    }
    /*• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
    que el usuario no saque más del 20%.*/
    public void extraccionRapida(){
        System.out.println("Extracción rapida del 20% : ");
        extraccion = leer.nextInt();
        if(extraccion <= 0.2*saldoInicial){
        System.out.println("Su saldo actual es: " + (saldoInicial - extraccion));
        }else{
        System.out.println("La extraccion rapida es del 20%");
        }
    }
    //• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(){
    saldoActual = saldoInicial + ingreso;
    saldoActual = saldoInicial - retiro;
        System.out.println("Su saldo actual es: " + saldoActual);
    }    
    //• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(){
        System.out.println("Consulta de dato personal y saldo? s/n");
        consulta = leer.next();
        if("s".equals(consulta)){
            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su apellido es: " + apellido);
            System.out.println("Su DNI es: " + dni);
            System.out.println("Su Numero de Cuenta es: " + numeroCuenta);
            System.out.println("Su Saldo es: " + saldoActual);
        }else{
            
        }
    }     
}
