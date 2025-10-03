
/**
 * Write a description of class Escuela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escuela
{
    public static void main(String [] args){
        Persona persona1 = new Persona(12345678, "Humberto", "Pancracio", 1992);
        Persona persona2 = new Persona(87654321, "Ramiro", "Funes Mori", 1987);
        Alumno alumno1 = new Alumno(23570, 87654321, "Ramiro", "Funes Mori", 1987);
        Alumno alumno2 = new Alumno(23570, 10293847, "Gilberto", "Silva", 1999);
        
        alumno1.setNota1(7.0);
        alumno1.setNota2(9.0);
        alumno1.mostrar();
        persona1.mostrar();
    }
}