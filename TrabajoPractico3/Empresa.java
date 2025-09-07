
/**
 * Clase Empresa ejecutable para pruebas de la clase Empleado
 * creando instancias de la misma, utilizando Scanner
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;
public class Empresa
{
  public static void main(String[] args){ 
      
    Scanner teclado = new Scanner(System.in);
    System.out.println("\tPruebas de la clase Empleado");
    teclado.useDelimiter("\n");
    
    Calendar fechaIngreso = Calendar.getInstance();
    
    System.out.println("--Ingrese los datos de un empleado");
    System.out.print("Dia de ingreso a la empresa: ");
    int diaIngreso = teclado.nextInt();
    System.out.print("Mes de ingreso a la empresa: ");
    int mesIngreso = teclado.nextInt();
    System.out.print("Año de ingreso a la empresa: ");
    int anioIngreso = teclado.nextInt();
    fechaIngreso.set(anioIngreso,(mesIngreso - 1),diaIngreso);
    System.out.println("--(cuil,apellido,nombre,sueldo básico):" );
    //Creando una instancia de empleado para hacer las pruebas
    Empleado empleado1 = new Empleado(
      Long.parseLong(teclado.next()),
      teclado.next(),
      teclado.next(),
      teclado.nextDouble(),
      fechaIngreso);
      
    System.out.println("Probando observadores como getCuil(), getSueldoBasico() y getAnioIngreso(): " +
      empleado1.getCuil() + ", " + empleado1.getSueldoBasico() + ", " + empleado1.getAnioIngreso());
      
    empleado1.mostrar();
      
    System.out.println(empleado1.mostrarLinea());
    if(empleado1.esAniversario()){
        System.out.println("\n¡Feliz anivesario!");
        System.out.println("Posee autorización para retirarse antes");
    }
          
    teclado.close();
    }
}