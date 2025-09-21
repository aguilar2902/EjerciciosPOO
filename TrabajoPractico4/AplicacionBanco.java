/**
 * Implementación de la clase ejecutable AplicacionBanco
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class AplicacionBanco
{
    public static void main(String [] args){ 
        
        Calendar fecha = Calendar.getInstance();
        
       //creo 5 empleados de prueba - 2 con años y 3 con fechas
       Empleado emp1 = new Empleado(123456789, "Ramirez", "Ruperto", 1750.0, 1992);
       Empleado emp2 = new Empleado(123456788, "Rodriguez", "Lucrecia", 2250.0, 1994);
       
       fecha.set(2005, Calendar.JULY, 21);
       Empleado emp3 = new Empleado(123456788, "Perez", "Lorena", 5000.0, fecha);
       
       fecha.set(1999, Calendar.AUGUST, 10);
       Empleado emp4 = new Empleado(123456788, "Dominguez", "Pedro", 3700.0, fecha);
       
       fecha.set(1989, Calendar.APRIL, 25);
       Empleado emp5 = new Empleado(123456788, "Casimiro", "Humberto", 8490.0, fecha);
       
       
       Localidad loc1 = new Localidad("Goya", "Corrientes");
       Localidad loc2 = new Localidad("Mercedes", "Corrientes");
       
       //pruebas del banco1 
       System.out.println("\n\t ***** PRUEBAS DEL BANCO 1 (con un empleado) ***** \n\n");
       Banco banco1 = new Banco("Santander", loc1, 1, emp1 );
       banco1.mostrar();
       banco1.agregarEmpleado(emp2);
       banco1.agregarEmpleado(emp3);
       banco1.mostrar();
       System.out.println();
       banco1.quitarEmpleado(emp1);
       banco1.mostrar();
       System.out.println();
       banco1.listarSueldos();
       System.out.println(banco1.sueldosAPagar());
       
       //pruebas del banco 2
       
       System.out.println("\n\t ***** PRUEBAS DEL BANCO 2 (Con varios empleados) ***** \n\n");
       ArrayList<Empleado> listaEmp = new ArrayList<>();
       listaEmp.add(emp1);
       listaEmp.add(emp3);
       listaEmp.add(emp4);
       listaEmp.add(emp5);
       
       Banco banco2 = new Banco("RIO", loc2, 2, listaEmp);
       banco2.mostrar();
       banco2.agregarEmpleado(emp2);
       System.out.println();
       banco2.mostrar();
       System.out.println();
       banco2.quitarEmpleado(emp5);
       banco2.mostrar();
    }

    
    
    
}