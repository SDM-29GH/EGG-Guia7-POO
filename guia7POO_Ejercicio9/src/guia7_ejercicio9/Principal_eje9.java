/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia7_ejercicio9;


public class Principal_eje9 {


    public static void main(String[] args) {
        
        Matematica mate1 = new Matematica();
        mate1.setNro1(Math.random()*10);
        System.out.println(mate1.getNro1());
        mate1.setNro2(Math.random()*10);
        System.out.println(mate1.getNro2());
        System.out.println(mate1.devolverMayor());
        mate1.calcularPotencia();
        mate1.calculaRaiz();
    }
    
}
