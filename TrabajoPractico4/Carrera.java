
/**
 * Ejercicio 5: Implementación de la clase ejecutable Carrera
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;
public class Carrera
{
    public static void main(String[] args){
        //instancia de Curso
        System.out.println("***Creando curso Electronica...");
        Curso curso1 = new Curso("Electronica");
        
        //instancia de alumnos con sus notas
        Alumno alumno1 = new Alumno(12345, "Ramiro", "Gomez");
        alumno1.setNota1(9);
        alumno1.setNota2(7);
        Alumno alumno2 = new Alumno(12124, "Ruben", "Neves");
        alumno2.setNota1(6);
        alumno2.setNota2(6);
        Alumno alumno3 = new Alumno(11234, "Florencia", "Gomez");
        alumno3.setNota1(2);
        alumno3.setNota2(4);
        Alumno alumno4 = new Alumno(18546, "Ricardo", "Lencina");
        alumno4.setNota1(5);
        alumno4.setNota2(9);
        
        ArrayList<Alumno> alumnosCreados = new ArrayList<>();
        alumnosCreados.add(alumno1);
        alumnosCreados.add(alumno2);
        alumnosCreados.add(alumno3);
        alumnosCreados.add(alumno4);
        
        System.out.print("\nListado de alumnos: {");
        for(Alumno alumno:alumnosCreados){
            System.out.print(alumno.nomYApe() + ", ");
        }
        System.out.print("}\n");        
        System.out.println("Cantidad de alumnos inscriptos al curso: " + curso1.cantidadDeAlumnos());
        System.out.println("\nInscribiendo alumnos...");
        
        //inscripcion de alumnos
        for(Alumno alumno:alumnosCreados){
            curso1.inscribirAlumno(alumno);
        }

        //Imprimir la cantidad y la lista de alumnos inscriptos al curso
        System.out.println();
        System.out.println("****__Cantidad de inscriptos: " + curso1.cantidadDeAlumnos());
        curso1.mostrarInscriptos();
        System.out.println("El alumno " + alumno1.apeYNom() + " esta inscripto?: ->" + curso1.estaInscripto(alumno1));
        System.out.println();
        //Dar de baja un alumno del curso, y luego verificar que no esté inscripto
        System.out.println("****__Se da de baja a " + alumno1.getNombre() + " porque abandona el curso__****");
        curso1.quitarAlumno(alumno1.getLu());
        System.out.println("El alumno " + alumno1.apeYNom() + " esta inscripto?: ->" + curso1.estaInscripto(alumno1));
        
        //Imprimir nuevamente la lista de alumnos inscriptos en el curso
        System.out.println("\n****__Alumnos inscriptos actualmente: " + curso1.cantidadDeAlumnos());
        curso1.mostrarInscriptos();
        
        //Buscar un alumno por su libreta. Una vez encontrado, mostrarlo con el método apropiado.
        System.out.print("****__Busca y muestra alumno con libreta 12124__****");
        curso1.buscarAlumno(12124).mostrar();
        
        //Mostrar el promedio del alumno solicitado, según libreta 
         curso1.imprimirPromedioDelAlumno(18546);
    }
}