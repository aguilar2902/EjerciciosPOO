
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
    
    System.out.println("\t\n---PRUEBAS EMPLEADOS CON JEFE---");
    //prueba EmpleadoConJefe sin jefe y con año de ingreso
    System.out.println("\t----- Prueba Empleado 2 sin JEFE y con año de ingreso-----");
    System.out.print("Ingrese el cuil del empleado: ");
    long cuil2 = teclado.nextLong();
    System.out.print("Ingrese el apellido: ");
    String apellido2 = teclado.next();
    System.out.print("Ingrese el nombre: ");
    String nombre2 = teclado.next();
    System.out.print("Ingrese el sueldo basico: ");
    double sueldoBasico2 = teclado.nextDouble();
    System.out.print("Ingrese el año de ingreso: ");
    int anioIngreso2 = teclado.nextInt();
    System.out.println();
    EmpleadoConJefe empleado2 = new EmpleadoConJefe(cuil2, apellido2, nombre2, sueldoBasico2, anioIngreso2);
    empleado2.mostrar();
    System.out.println("\n");
    
    //prueba EmpleadoConJefe sin jefe y con fecha de ingreso
    System.out.println("\t----- Prueba Empleado 3 sin JEFE y con fecha de ingreso -----");
    System.out.print("Ingrese el cuil del empleado: ");
    long cuil3 = teclado.nextLong();
    System.out.print("Ingrese el apellido: ");
    String apellido3= teclado.next();
    System.out.print("Ingrese el nombre: ");
    String nombre3 = teclado.next();
    System.out.print("Ingrese el sueldo basico: ");
    double sueldoBasico3 = teclado.nextDouble();
    System.out.print("Ingrese el dia de ingreso: ");
    int diaIngreso3 = teclado.nextInt();
    System.out.print("Ingrese el mes de ingreso: ");
    int mesIngreso3 = teclado.nextInt();
    System.out.print("Ingrese el año de ingreso: ");
    int anioIngreso3 = teclado.nextInt();
    fechaIngreso.set(anioIngreso3, (mesIngreso3 - 1), diaIngreso3);
    System.out.println();
    EmpleadoConJefe empleado3 = new EmpleadoConJefe(cuil3, apellido3, nombre3, sueldoBasico3, fechaIngreso);
    empleado3.mostrar();
    if(empleado3.esAniversario()){
      System.out.println("\n¡Feliz anivesario!");
      System.out.println("Posee autorización para retirarse antes");
    }
    System.out.println("\n");
        
    //prueba EmpleadoConJefe con jefe (empleado2)
    System.out.println("\t----- Prueba Empleado 4 CON JEFE (Empleado 2) -----");
    System.out.print("Ingrese el cuil del empleado: ");
    long cuil4 = teclado.nextLong();
    System.out.print("Ingrese el apellido: ");
    String apellido4 = teclado.next();
    System.out.print("Ingrese el nombre: ");
    String nombre4 = teclado.next();
    System.out.print("Ingrese el sueldo basico: ");
    double sueldoBasico4 = teclado.nextDouble();
    System.out.print("Ingrese el dia de ingreso: ");
    int diaIngreso4 = teclado.nextInt();
    System.out.print("Ingrese el mes de ingreso: ");
    int mesIngreso4 = teclado.nextInt();
    System.out.print("Ingrese el año de ingreso: ");
    int anioIngreso4 = teclado.nextInt();
    fechaIngreso.set(anioIngreso4, (mesIngreso4 - 1), diaIngreso4);
    System.out.println("\n");
    EmpleadoConJefe empleado4 = new EmpleadoConJefe(cuil4, apellido4, nombre4, sueldoBasico4, fechaIngreso, empleado2);
    empleado4.mostrar();
    if(empleado4.esAniversario()){
      System.out.println("\n¡Feliz anivesario!");
      System.out.println("Posee autorización para retirarse antes");
    }
    System.out.println("\t----FINALIZADO----");
    teclado.close();
    }
}