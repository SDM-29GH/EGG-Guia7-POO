/* 11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle */
package guia7_ejercicio11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class Main_eje11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        Date fechaActual = new Date();
        System.out.println("la fecha actual es: "+ fechaActual);
        
        System.out.println("Ingrese el valor del año:" );
        int año = leer.nextInt();
        System.out.println("Ingrese el valor del mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el valor del día: ");
        int dia = leer.nextInt();
        Date fecha = new Date((año-1900), mes, dia);// Asi yo, cargo el valor de la fecha yo.
        
        System.out.println("La fecha que se ingresó es: " + fecha); 
        
        int diferenciaAnual = (fechaActual.getYear()) - fecha.getYear();
        
        System.out.println("La diferencia entre fecha ingresada y fecha actual es: " + diferenciaAnual + " años");
        
        int diferenciaMensual;
        
        if(fecha.getMonth() >= fechaActual.getMonth()){
            diferenciaMensual = 12-((fecha.getMonth()-1) - fechaActual.getMonth());
            System.out.println(diferenciaMensual + " meses");
        }else{
            diferenciaMensual = 12-(fechaActual.getMonth() - fecha.getMonth());
            System.out.println(diferenciaMensual + " meses");
        }
        
        int diferenciaDia;
        
        if(fecha.getDay() >= fechaActual.getDay()){
            diferenciaDia = 30 - ((fecha.getDay()) - (fechaActual.getDay()));
            System.out.println(diferenciaDia + " días");
        }else{
            diferenciaDia = 30 - (fechaActual.getDay() - fecha.getDay());
            System.out.println(diferenciaDia + " días");
        }
        
        /*if(fechaActual.getMonth()+1 > fecha.getMonth() && fechaActual.getDay() > fecha.getDay()){
            int diferenciaMensual = (fechaActual.getMonth()+1) - (fecha.getMonth());
            int diferenciaDia = (fechaActual.getDay()) - (fecha.getDay());
            System.out.println("diferencia entre fecha actual y fecha ingresada: "+diferenciaAnual+" años y "+diferenciaMensual+" meses"+diferenciaDia+" días");       
        }else{
            int diferenciaMensual = fecha.getMonth() - (fechaActual.getMonth()+1);
            int diferenciaDia = fecha.getDay() - (fechaActual.getDay());
            System.out.println("diferencia entre fecha actual y fecha ingresada: "+diferenciaAnual+" años y "+diferenciaMensual+" meses "+diferenciaDia+" días"); 
        }*/
        /*if(fechaActual.getMonth()+1 < fecha.getMonth() && fechaActual.getDay() > fecha.getDay()){
            int diferenciaMensual = fecha.getMonth() - (fechaActual.getMonth()+1);
            int diferenciaDia = (fechaActual.getDay()-1) - fecha.getDay();
            System.out.println("diferencia entre fecha actual y fecha ingresada: "+diferenciaAnual+" años y "+diferenciaMensual+" meses"+diferenciaDia+" días");
        }else{
            int diferenciaMensual = (fechaActual.getMonth()+1) - (fecha.getMonth());
            int diferenciaDia = fecha.getDay() - (fechaActual.getDay()-1);
            System.out.println("diferencia entre fecha actual y fecha ingresada: "+diferenciaAnual+" años y "+diferenciaMensual+" meses"+diferenciaDia+" días");
        }*/
        
    }
}
    

