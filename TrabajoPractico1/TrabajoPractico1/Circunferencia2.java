
/**
 * Modificar la clase Circunferencia para permitir que el usuario pueda calcular el perímetro de muchas
    circunferencias, utilizando la estructura while. Modificar además el ingreso de datos, utilizando la clase
    Scanner
 * 
 * @author Marcelo BENGOCHEA
 * @author Jonathan AGUILAR
 * @version 1.0
 */
import java.util.Scanner;

public class Circunferencia2
{
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        
        while(opcion != 0){
            System.out.println("\t---Calculo de perimetro---");
            System.out.print("Ingrese el radio: ");
            
            int radio = teclado.nextInt();  
            double perimetro = 2 * radio * Math.PI;
            
            System.out.println("El perímetro calculado para el radio ingresado es: " + perimetro);
            System.out.println("\t--------------------------");
            System.out.print("Para continuar calculando perimetros ingrese algun número entero(para finalizar digite 0): ");
            opcion = teclado.nextInt();
        }
          System.out.println("\t---Programa finalizado---" );
          teclado.close();
    }
}