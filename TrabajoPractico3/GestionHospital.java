
/**
 * Clase GestionHospital ejecutable, para hacer pruebas de las 
 * clases Paciente,Localida y Hospital
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.Scanner;
public class GestionHospital
{
    public static void main(String[] args){
        //Instancia de Scanner
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        //Carga de datos del paciente
        System.out.print("Ingrese el nombre del paciente: ");
        String nombreIngresado = teclado.next();
        System.out.print("Ingrese el nro de historia clínica: ");
        int nroHCIngresado = teclado.nextInt();
        System.out.print("Ingrese el domicilio del paciente: ");
        String domicilioIngresado = teclado.next();
        //Carga de Localidad de nacimiento y actual
        System.out.print("Ingrese la localidad de nacimiento: ");
        String nombreLocalidadNac = teclado.next();
        System.out.print("ingrese la provincia donde se encuentra ubicada: ");
        String nombreProvNac = teclado.next();
        System.out.print("Localidad donde reside actualmente: ");
        String nombreLocalidadActual = teclado.next();
        System.out.print("Provincia a la que pertenece: ");
        String nombreProvAct = teclado.next();
        Localidad localidadNacimiento = new Localidad(nombreLocalidadNac, nombreProvNac);
        Localidad localidadActual = new Localidad(nombreLocalidadActual, nombreProvAct);
        //Creación del paciente
        Paciente paciente = new Paciente(nroHCIngresado, nombreIngresado, domicilioIngresado,
            localidadNacimiento, localidadActual);
        System.out.println("\nDatos del paciente agregado: " + paciente.cadenaDeDatos());
        
        System.out.println("\n\t---Datos del Hospital---");
        System.out.print("Nombre del hospital: ");
        String nombreHospIngresado = teclado.next();
        System.out.print("Director a cargo: ");
        String directorHospIngresado = teclado.next();
        Hospital hospital = new Hospital(nombreHospIngresado,directorHospIngresado);
        System.out.println();
        hospital.consultaDatosFiliatorios(paciente);
        
        teclado.close();
        
        
    }
}