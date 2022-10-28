/* 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20. */
package guia7_ejercicio10;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        int[] A = new int[10];
        int[] B = new int[5];
        int i = 0;
        A[i] = B[i] = (int) (Math.random() * 101);
        
        System.out.println("ARREGLO A");
        for (i = 0; i < 10; i++) {
            A[i] = (int) (Math.random() * 101);
            System.out.println(" [" + i + "] " + A[i]);
        }
        Arrays.sort(A[i]);
        System.out.println();
        
        System.out.println("ARREGLO B");
        for (i = 0; i < 5; i++){
            B[i] = (int)(Math.random() * 101);
            System.out.println(" [" + i + "] " + A[i]);
        }
        
    }

    private static void sort(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
