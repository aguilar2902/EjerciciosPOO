
/**
 * Crear la clase ejecutable “Operador”, que contenga el método main(). En él declarar las variables a y b de tipo
   entero. Inicializarlas con los valores 8 y 3 respectivamente. Realizar y mostrar por pantalla las siguientes
   operaciones aritméticas: suma, resta, multiplicación, división y resto.
 * 
 * @author Marcelo BENGOCHEA
 * @author Jonathan AGUILAR
 * @version 1.0
 */
public class Operador
{
    public static void main(String[] args){
        int a = 8;
        int b = 3;
        
        System.out.println("Suma: a + b = " + (a + b)); 
        System.out.println("Resta: a - b = " + (a - b)); 
        System.out.println("Multiplicación: a * b = " + (a * b)); 
        System.out.println("División: a / b = " + (a / b)); 
        System.out.println("Resto: a % b = " + (a % b)); 
    }
}