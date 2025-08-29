
/**
 * Crear la clase “Multiplo”, que contenga el método main(), en el que se determinen y muestren por pantalla los
   números múltiplos de 4 a partir de 42 y hasta el 150 inclusive. Usar la instrucción iterativa más apropiada.
 * 
 * @author Marcelo BENGOCHEA
 * @author Jonathan AGUILAR
 * @version 1.0
 */
public class Multiplo
{
    public static void main(String[] args){
        for(int i = 42; i <= 150; i++){
            if(i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}