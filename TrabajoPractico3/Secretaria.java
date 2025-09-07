/**
 * Ejercicio 6
 * Clase ejecutable para pruebas de Docente y Escuela
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.Scanner;
public class Secretaria
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        //Instancia de docente
        System.out.println("\t---Carga de un docente---");
        System.out.print("Ingrese el nombre y apellido: ");
        String nombre1 = teclado.next();
        System.out.print("Ingrese el grado del docente: ");
        String grado1 = teclado.next();
        System.out.print("Ingrese el sueldo básico a asignar: $");
        double sueldoBasico1 = teclado.nextDouble();
        System.out.print("Ingrese el monto por asignación familiar: $");
        double asignacionFamiliar1 = teclado.nextDouble();
        Docente unDocente = new Docente(nombre1, grado1, sueldoBasico1, asignacionFamiliar1);
        System.out.println("\n¡Docente " + unDocente.getNombre() + " agregado!");
        
        //Instancia de escuela
        System.out.println("\n\t---Carga de una escuela---");
        System.out.print("Ingrese el nombre de la institución: ");
        String nombreEscuela = teclado.next();
        System.out.print("Domicilio de la institución: ");
        String domicilioEscuela = teclado.next();
        System.out.print("Nombre del director asignado: ");
        String directorEscuela = teclado.next();
        
        Escuela escuela1 = new Escuela(nombreEscuela, domicilioEscuela, directorEscuela);
        System.out.println("\n¡Institución " + escuela1.getNombre() + " agregada!\n");
        escuela1.imprimirRecibo(unDocente);
        
        teclado.close();
        
    }
}