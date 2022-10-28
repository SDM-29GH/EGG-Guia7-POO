/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia7_ejercicio8;

import java.util.Locale;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.concat;


public class Cadena {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
// Atributos
    private String frase = "Casa Blanca", frase1 = "", frase2 = "";
    private int Long = frase.length(), Long1 = frase1.length();
    int contador = 0;
    String invertir, letra;
// CONSTRUCCTOR VACIO
    public Cadena(){
        
    }
    
// CONSTRUCTOR PARAMETRIZADO
    public Cadena(String frase){
        this.frase = frase;
    }
// METODO SET Y GET

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }
    
    public void setLong(int Long){
        this.Long = Long;
    }
    
    public int getLong(){
        return Long;
    }
    /* • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    frase ingresada. */
    public void mostrarVocales(){
        for(int i = 0; i < frase.length(); i++){
            if((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || 
                (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u') ){
                contador++;
                System.out.println("La frase "+ frase + " tiene " + contador + " vocales");
            }

        }
    }
    /*• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(String frase){
        for (int i = frase.length()-1 ; i >= 0; i--){
            invertir = invertir + frase.charAt(i);
        }
            System.out.println("La frase " + frase + " invertida es: " + invertir);
    }
    /* • Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
        y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. */
    
    public void vecesRepetido(String letra){
        System.out.println("Ingrese el caracter en busqueda: ");
        letra = leer.next();
        
        for(int i = 0; i < frase.length(); i++){
            if(frase.equals(letra)){
                contador++;
            }
            System.out.println("El caracter " + letra + " se repite " + contador);
        }

    }
    /* • Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario. */
    public void compararLongitud(String frase, String frase1){
        System.out.println("Ingrese otra nueva frase: ");
        frase1 = leer.next();
        System.out.println("La frase: "+frase1+" tiene longitud de: "+ frase1.length());
            if(frase1.length() > frase.length()){
                System.out.println("La frase: "+ frase1 +" ,es mayor que la frase: "+ frase);
            }if(frase.length() > frase1.length()){
                System.out.println("La frase: " + frase + " ,es mayor que la frase: " + frase1 );
            }
    
    }
    /* • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante. */
    public void unirFrases(String frase, String frase2){
        frase.concat(frase2);
        System.out.println("Ingrese nueva frase: ");
        frase2 = leer.next();
        System.out.println(" El resultado de unir las dos frases es : " + frase.concat(frase2));
           
    }
    
    /*• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    mostrar la frase resultante.*/
    public void reemplazarLetra(){
        char letra;
        System.out.println("Ingrese la letra para reemplazar en la frase: "+frase+", por aterisco: ");
        letra = leer.next().charAt(0);
        frase.replace(letra,'*' );
        System.out.println(" En la frase " + frase + " reemplazo letra a por el aterisco: " + frase.replace('a', '*'));
    }
    /*• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public void contiene(String letra){
        System.out.println("Ingrese una letra para buscar en la frase: " + frase);
        letra = leer.next();
        frase.contains(letra);
        if(frase.contains(letra)== true){
            System.out.println("La frase " + frase + " contiene la letra: " + letra);
        }else{
            System.out.println("La frase " + frase + " no contiene la letra: " + letra);
        }
    }

}
    

    


