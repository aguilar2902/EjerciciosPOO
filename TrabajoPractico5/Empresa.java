
/**
 * Clase Empresa ejecutable para pruebas de la clase Empleado
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;
public class Empresa
{
  public static void main(String[] args){ 
      
    Calendar fechaNacim = Calendar.getInstance();
    Calendar fechaIngreso = Calendar.getInstance();
    fechaNacim.set(1992, 0, 14);
    fechaIngreso.set(2016, 7, 12);
    
    Persona persona1 = new Persona(332221, "Juan Carlos", "Gómez", 1982);
    Persona empleado1 = new Empleado(242331, 444444, "Roberto Elias", "Escobar",fechaNacim, 900000, fechaIngreso); 
    fechaNacim.set(1996, 3, 29);
    Empleado empleado2 = new Empleado(333333, 676372, "Aldana Mayra", "Zamudio", fechaNacim, 350000, 2013);
    System.out.println("\tPruebas de las clases Persona y Empleado");
    System.out.println("\n\t----Prueba clase Persona----");
    System.out.println("\n\t----Método mostrar()----");
    persona1.mostrar();
    
    System.out.println("\n\t----Prueba Empleado creado como Persona----");
    System.out.println("\n*---Probando observadores como getCuil(), getSueldoBasico() y getAnioIngreso(): " +
      ((Empleado)empleado1).getCuil() + ", " + ((Empleado)empleado1).getSueldoBasico() + ", " + ((Empleado) empleado1).getAnioIngreso());
    
    System.out.println("\n\t----Método mostrar()----");
    empleado1.mostrar();
    
    System.out.println("\n\t----Prueba Empleado----");
    System.out.println(empleado2.mostrarLinea());
    System.out.println("\n*---Probando observadores como getCuil(), getSueldoBasico() y getAnioIngreso(): " +
      empleado2.getCuil() + ", " + empleado2.getSueldoBasico() + ", " + empleado2.getAnioIngreso());
     
    System.out.println("\n\t----Método mostrar()----");
    empleado2.mostrar(); 
    

  }
}