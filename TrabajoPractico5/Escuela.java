
/**
 * clase Escuela para pruebas.
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.00
 */
import java.util.*;
public class Escuela
{
    public static void main(String [] args){
        Calendar fechaPrueba = Calendar.getInstance();
        fechaPrueba.set(1989, 6, 11);
        
        Persona persona1 = new Persona(12345678, "Humberto", "Pancracio", fechaPrueba);
        Persona persona2 = new Persona(87654321, "Ramiro", "Funes Mori", 1987);
        Alumno alumno1 = new Alumno(23570, 87654321, "Ramiro", "Funes Mori", 1987);
        Alumno alumno2 = new Alumno(23570, 10293847, "Gilberto", "Silva", 1999);
        
        alumno1.setNota1(7.0);
        alumno1.setNota2(9.0);
        alumno1.mostrar();
        persona1.mostrar();
        System.out.println("\t" + "-".repeat(40));
        persona2.mostrar();
    }
}