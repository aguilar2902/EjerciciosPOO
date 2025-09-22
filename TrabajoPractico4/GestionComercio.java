
/**
 * Ejercicio 6: Implementacion de la clase ejecutable GestionComercio, con menú.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;

public class GestionComercio
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        Calendar fecha = Calendar.getInstance();
        
        //creo 5 empleados de prueba - 2 con años y 3 con fechas
        Empleado emp1 = new Empleado(123456789, "Ramirez", "Ruperto", 1750.0, 1992);
        Empleado emp2 = new Empleado(123456788, "Rodriguez", "Lucrecia", 2250.0, 1994);
        
        fecha.set(2005, Calendar.JULY, 21);
        Empleado emp3 = new Empleado(123456790, "Perez", "Lorena", 5000.0, fecha);
       
        fecha.set(1999, Calendar.AUGUST, 10);
        Empleado emp4 = new Empleado(123456791, "Dominguez", "Pedro", 3700.0, fecha);
       
        fecha.set(1989, Calendar.APRIL, 25);
        Empleado emp5 = new Empleado(123456792, "Casimiro", "Humberto", 8490.0, fecha);
        
        Comercio comercio = new Comercio("Avanti SRL");
        
        ArrayList<Empleado> posiblesEmpleados = new ArrayList<>();
        posiblesEmpleados.add(emp1);
        posiblesEmpleados.add(emp2);
        posiblesEmpleados.add(emp3);
        posiblesEmpleados.add(emp4);
        posiblesEmpleados.add(emp5);
        
        menu(teclado, comercio, posiblesEmpleados);
        System.out.println("\n\t-----Programa finalizado-----");
        teclado.close();
    }
    public static void menu(Scanner p_scanner, Comercio p_comercio, ArrayList<Empleado> p_empleados){
        int opcion = 7;
        System.out.printf("\n\t---Gestion del Comercio %s ---", p_comercio.getNombre());

        do {
            System.out.println("\n\t---Menu---");
            System.out.println("\t1-Dar de Alta a un Empleado");
            System.out.println("\t2-Dar de Baja a un Empleado");
            System.out.println("\t3-Cantidad de Empleados");
            System.out.println("\t4-Es Empleado? ");
            System.out.println("\t5-Buscar Empleado ");
            System.out.println("\t6-Nómina de Empleados");
            System.out.println("\t7-Salir");
            System.out.print("\t*** Opción Elegida: ");
            opcion = p_scanner.nextInt();
            System.out.println();
            
            switch(opcion){
                case 1 : {
                    int i = 1;
                    int opcEmpl;
                    System.out.println("\nIngrese el num de empleado al que quiere dar de ALTA");
                    for(Empleado empleado : p_empleados){
                        System.out.println(i + "-" + empleado.apeYNom() + " - CUIL: " + empleado.getCuil());
                        i++;
                    }
                    System.out.print("Opcion Elegida: ");
                    opcEmpl = p_scanner.nextInt() - 1;
                    p_comercio.altaEmpleado(p_empleados.get(opcEmpl));
                    System.out.println("HECHO!");
                    break; 
                }
                case 2 : {
                    int i = 1;
                    int opcEmpl;
                    System.out.println("\nIngrese el num de empleado al que quiere dar de BAJA");
                    for(Empleado empleado : p_empleados){
                        System.out.println(i + "-" + empleado.apeYNom() + " - CUIL: " + empleado.getCuil());
                        i++;
                    }
                    System.out.print("Opcion Elegida: ");
                    opcEmpl = p_scanner.nextInt() - 1;
                    p_comercio.bajaEmpleado(p_empleados.get(opcEmpl).getCuil());
                    System.out.println("HECHO!");
                    break; 
                }
                case 3 : {
                    System.out.println("Cantidad de empleados del comercio: " + p_comercio.cantidadDeEmpleados());
                    break;
                }
                case 4 : {
                    long cuil;
                    System.out.print("Ingrese el CUIL: ");
                    cuil = p_scanner.nextLong();
                    System.out.println("Es Empleado? --> " + p_comercio.esEmpleado(cuil));
                    break; 
                }
                case 5 : {
                    long cuil;
                    System.out.print("\nIngrese el CUIL del empleado al que desea buscar: ");
                    cuil = p_scanner.nextLong();
                    System.out.println("-----------------------");
                    if(p_comercio.buscarEmpleado(cuil) == null){
                        System.out.println("No está registrado como empleado");
                    } else {
                        p_comercio.buscarEmpleado(cuil).mostrar();
                    }
                    break;
                }
                case 6 : {
                    p_comercio.nomina();
                    break;
                }
                case 7 : {
                    System.out.println("\n\tSaliendo del menú...");
                    break;
                }
                default : {
                    System.out.println("\n\t---Opción no válida, reintente---"); 
                }
            }   
        } while (opcion != 7);
    }
}