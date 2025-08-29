
/**
 * Crear una clase denominada OrdenVector, que permita ingresar por teclado (Scanner) 4 elementos de tipo
    doble, y almacenarlos en un array. Determinar el menor elemento y mostrarlo. Ordenar los elementos del
    vector de menor a mayor. Mostrar los elementos ordenados, separados por un tabulador. Usar instrucción
    FOR para el ingreso de datos. Utilizar método de la Burbuja.
 * 
 * @author Marcelo BENGOCHEA
 * @author Jonathan AGUILAR
 * @version 1.00
 */
import java.util.Scanner;

public class OrdenVector
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double[] array = new double[4];
        double menorElemento = Double.MAX_VALUE;
        
        System.out.println("\t----Ingreso de valores----");
        for(int i=0; i<array.length; i++){
            System.out.print("Ingrese el " + (i+1) + "° valor: ");
            array[i] = teclado.nextDouble();
        }
        
        for(int i=0; i<array.length; i++){
            if(array[i] < menorElemento){
                menorElemento = array[i];
            }
        }
        
        System.out.println("El menor elemento es: " + menorElemento);
        
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    double temporal = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporal;
                }
            }
        }
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + "\t");
        }
        
        System.out.println();
        teclado.close();
        
    }
}