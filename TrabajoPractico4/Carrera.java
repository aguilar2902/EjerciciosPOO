
/**
 * Ejercicio 5: Implementación de la clase ejecutable Carrera
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

public class Carrera
{
    public static void main(String[] args){
        //instancia de Curso
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
        
        //inscripcion de alumnos
        curso1.inscribirAlumno(alumno1);
        curso1.inscribirAlumno(alumno2);
        curso1.inscribirAlumno(alumno3);
        curso1.inscribirAlumno(alumno4);
        
        //Imprimir la cantidad y la lista de alumnos inscriptos al curso
        System.out.println("Cantidad de alumnos inscriptos: " + curso1.cantidadDeAlumnos());
        System.out.println();
        curso1.mostrarInscriptos();
        
        //Dar de baja un alumno del curso, y luego verificar que no esté inscripto
        curso1.quitarAlumno(alumno1.getLu());
        System.out.println("El alumno Ramiro Gomez esta inscripto?: " + curso1.estaInscripto(alumno1));
        
        //Imprimir nuevamente la lista de alumnos para ver como que queda definitivamente y la cantidad total de 
        //alumnos inscriptos en el curso
        System.out.println("Cantidad de alumnos inscriptos: " + curso1.cantidadDeAlumnos());
        System.out.println();
        curso1.mostrarInscriptos();
        
        //Buscar un alumno por su libreta. Una vez encontrado, mostrarlo con el método apropiado.
        System.out.println("\nBusca y muestra alumno con libreta 12124");
        curso1.buscarAlumno(12124).mostrar();
        
        //Mostrar el promedio del alumno solicitado, según libreta 
         curso1.imprimirPromedioDelAlumno(18546);
    }
}