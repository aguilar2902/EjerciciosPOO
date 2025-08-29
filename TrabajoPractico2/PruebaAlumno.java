
/**
 * Clase de prueba de las instancias de la clase Alumno
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.0 19-08-25
 */
public class PruebaAlumno
{
  public static void main(String[] args){
    //Datos a ingresar como args en el main:
    //"3245","Juan","Perez","3333","Micaela","González","9999","Horacio","Zamudio"
    Alumno alumno1 = new Alumno(Integer.parseInt(args[0]), args[1], args[2]);
    Alumno alumno2 = new Alumno(Integer.parseInt(args[3]), args[4], args[5]);
    Alumno alumno3 = new Alumno(Integer.parseInt(args[6]), args[7], args[8]);
    //NOTAS ALUMNO 1
    alumno1.setNota1(7.1);
    alumno1.setNota2(7.3);
    System.out.println("Probando apeYNom(): " + alumno1.apeYNom());
    System.out.println("Promedio obtenido: " + alumno1.promedio());
    //NOTAS ALUMNO 2
    alumno2.setNota1(6.1);
    alumno2.setNota2(7.9);
    //NOTAS ALUMNO 3
    alumno3.setNota1(3.1);
    alumno3.setNota2(8.9);
    //MOSTRAR
    alumno1.mostrar();
    alumno2.mostrar();
    alumno3.mostrar();   
  }
}
