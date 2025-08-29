
/**
 * Pruebas de la clase Empleado creando instancias
 * de la misma, utilizando Scanner
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.Scanner;
public class PruebaEmpleado
{
  public static void main(String[] args){ 
      
    Scanner teclado = new Scanner(System.in);
    System.out.println("\tPruebas de la clase Empleado");
    teclado.useDelimiter("\n");
    
    System.out.println("--Ingrese los datos de un empleado");
    System.out.println("--(cuil,apellido,nombre,sueldo básico y año de ingreso):" );
    //Creando una instancia de empleado para hacer las pruebas
    Empleado empleado1 = new Empleado(
      Long.parseLong(teclado.next()),
      teclado.next(),
      teclado.next(),
      Double.parseDouble(teclado.next()),
      Integer.parseInt(teclado.next()));
      
    System.out.println("Probando observadores como getCuil(), getSueldoBasico() y getAnioIngreso(): " +
      empleado1.getCuil() + ", " + empleado1.getSueldoBasico() + ", " + empleado1.getAnioIngreso());
      
    empleado1.mostrar();
      
    System.out.println(empleado1.mostrarLinea());
          
    teclado.close();
    }
}