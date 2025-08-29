
/**
 * Crear una clase denominada OperarVector que permita ingresar por teclado (Scanner) 5 notas de alumnos, las
    que serán almacenadas en un array de enteros. Calcular el promedio y determinar la mayor nota. El promedio
    debe permitir resultado con decimales (aplicar cast a los elementos enteros cuando sea necesario para obtener
    dicho resultado). Mostrar los elementos ingresados, separados por un tabulador. Mostrar el promedio y la
    mayor nota con el mensaje respectivo. 
 * 
 * @author Marcelo BENGOCHEA
 * @author Jonathan AGUILAR
 * @version 1.0
 */
import java.util.Scanner;

public class OperarVector
{
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int[] notas = new int[5];
        int maxNota = Integer.MIN_VALUE;
        int suma = 0;
    
        for(int i=0; i < notas.length; i++){
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            notas[i] = teclado.nextInt();
            
            if(notas[i] > maxNota){
                maxNota = notas[i];
            }
            
            suma += notas[i];

        }
        
        double promedio = (double)suma / notas.length;
        
        System.out.print("Notas ingresadas: "); 
        
        for(int i=0; i < notas.length; i++){
            System.out.print(notas[i] + "\t"); 
        }
        
        System.out.println("\nEl promedio de las notas es: " + promedio);
        System.out.println("La mayor nota registrada es: " + maxNota);
        
        teclado.close();
 
    }
        
    
    
}