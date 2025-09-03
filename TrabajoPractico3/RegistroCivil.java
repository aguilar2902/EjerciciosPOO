
/**
 * Ejercicio 10: Clase RegistroCivil que contiene 
 * el método main para las pruebas de Hombre/Mujer
 * respecto al matrimonio.<br>Con implementación de un menú.
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.Scanner;

public class RegistroCivil
{
    public static void main(String[] args){
        
        System.out.println("\t---Test con constructor de casado/a---");
        Hombre hombre2 = new Hombre("Marcos", "Blanco", 33); //Sin casarse
        Mujer mujer2 = new Mujer("Romina", "Arrua" , 29, hombre2); //se asocia al hombre2
        mujer2.mostrarEstadoCivil();
        hombre2.mostrarEstadoCivil();
        System.out.println("\t-----FIN PRUEBA-----");
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        System.out.println("\n\t---Registro Civil---");
        
        //Datos del hombre
        System.out.println("\tIngreso de datos del hombre...");
        System.out.print("Ingrese el/los nombre/s: ");
        String nombreHombre = teclado.next();
        System.out.print("Ingrese el/los apellido/s: ");
        String apellidoHombre = teclado.next();
        System.out.print("Ingrese la edad del hombre: ");
        int edadHombre = teclado.nextInt();
        Hombre hombre = new Hombre(nombreHombre,apellidoHombre, edadHombre);
        
        //Datos de la mujer
        System.out.println("\tIngreso de datos de la mujer...");
        System.out.print("Ingrese el/los nombre/s: ");
        String nombreMujer = teclado.next();
        System.out.print("Ingrese el/los apellido/s: ");
        String apellidoMujer = teclado.next();
        System.out.print("Ingrese la edad de la mujer: ");
        int edadMujer = teclado.nextInt();
        Mujer mujer = new Mujer(nombreMujer,apellidoMujer, edadMujer);
        
        //Implementación de un menú
        int opcion = 0;
        do {
            menu(teclado, hombre, mujer);
            System.out.print("¿Volver al menú?(0 para cerrar, otro número para volver): ");
            opcion = teclado.nextInt();
        } while(opcion != 0);
        
        System.out.println("---Programa finalizado---");
        
    }
    public static void menu(Scanner p_scanner,Hombre p_hombre, Mujer p_mujer){
        
        System.out.println("\n\t---MENÚ---");
        System.out.println("1-Detalles del Hombre.");
        System.out.println("2-Detalles de la mujer.");
        System.out.println("3-Llevar a cabo el matrimonio.");
        System.out.println("4-Ejecutar el divorcio.");
        System.out.println("0-Salir del menú...");
        System.out.print("Elija una opción: ");
        int eleccion = p_scanner.nextInt();
        
        switch(eleccion){
            case 1 : {
                System.out.println("\n---Ejecución de métodos relacionados al hombre---");
                p_hombre.mostrarEstadoCivil();
                p_hombre.casadoCon();
                System.out.println("Ejecución del método datos(): " + p_hombre.datos());
                break; 
            }
            case 2 : {
                System.out.println("\n---Ejecución de métodos relacionados a la mujer---");
                p_mujer.mostrarEstadoCivil();
                p_mujer.casadaCon();
                System.out.println("Ejecución del método datos(): " + p_mujer.datos());
                break; 
            }
            case 3: {
                System.out.println("---Casamiento---");
                System.out.println("Casamiento entre " + p_mujer.getNombre() + " y " +
                    p_hombre.getNombre());
                p_mujer.casarseCon(p_hombre);
                p_hombre.casarseCon(p_mujer);
                break;
            }
            case 4: {
                System.out.println("---Divorcio (Ejecutado desde La Mujer)---");
                System.out.println("\tEjecutando el divorcio");
                p_mujer.divorcio();
                //p_hombre.divorcio();
                System.out.println("Estado Civil Del Hombre: " + p_hombre.getEstadoCivil());
                //System.out.println("Estado Civil De La Mujer: " + p_mujer.getEstadoCivil());
                break;
            }
            case 0: {
                System.out.println("\tSaliendo del menú...");
                break;
            }
            default: System.out.println("Opción no válida");
        }
    }
}