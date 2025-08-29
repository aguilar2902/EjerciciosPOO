/**
 * Prueba de instancias de la clase Punto
 * (cargar valores double por teclado con ",")
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.Scanner;
public class PruebaPunto
{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Opcion 1: crear un punto (0,0)");
    System.out.println("Opcion 2: ingresar coordenadas por teclado para un punto");
    System.out.print("Opcion elegida: ");
    int opcion = teclado.nextInt();
    switch(opcion){
      case 1: {
        Punto punto = new Punto();
        punto.mostrar();
        System.out.println("Coordenadas: " + punto.coordenadas());
        System.out.println("Ingrese 2 valores para desplazar el punto(0,0): ");
        double desplazX = teclado.nextDouble();
        double desplazY = teclado.nextDouble();
        punto.desplazar(desplazX, desplazY);
        punto.mostrar();
        System.out.println("Nuevas coordenadas: " + punto.coordenadas());
        break;
      }
      case 2: {
        System.out.print("Ingrese la coordenada x: ");
        double ejeX = teclado.nextDouble();
        System.out.print("Ingrese la coordenada y: ");
        double ejeY = teclado.nextDouble();
        Punto punto = new Punto(ejeX, ejeY);
        punto.mostrar();
        System.out.println("Coordenadas: " + punto.coordenadas());
        System.out.println("Ingrese 2 valores para desplazar el punto (x,y): ");
        double desplazX = teclado.nextDouble();
        double desplazY = teclado.nextDouble();
        punto.desplazar(desplazX, desplazY);
        punto.mostrar();
        System.out.println("Coordenadas nuevas: " + punto.coordenadas());
        break;
        
      }
      default : System.out.println("Opción no valida...");
    }
  }
}