
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
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        //empleados
        Empleado emp1 = new Empleado(123456789, "Perez", "Lorena", 121200.0, 1994);
        Empleado emp2 = new Empleado(123456567, "Dominguez", "Pedro", 265000.4, 1995);
        Empleado emp3 = new Empleado(123456763, "Chupamoco", "Humberto", 345600.0, 1996);
        
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        
        //localidad
        Localidad loc = new Localidad("Corrientes", "Corrientes");
        
        //Banco
        Banco banco1 = new Banco("Rio", loc, 3, empleados);
        
        banco1.mostrar();
        
    }
}