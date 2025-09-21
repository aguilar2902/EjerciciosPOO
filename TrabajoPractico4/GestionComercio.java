
/**
 * Ejercicio 6: Implementacion de la clase ejecutable GestionComercio.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;

public class GestionComercio
{
    public static void main(String[] args){
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
        
        Comercio comercio = new Comercio("Avanti SRL");
        comercio.altaEmpleadoo(emp1);
        comercio.altaEmpleadoo(emp2);
        comercio.altaEmpleadoo(emp3);
        comercio.altaEmpleadoo(emp4);
        
        comercio.nomina();
    }
    
}