
/**
 * Clase con método main para probar objetos 
 * de la clase Persona.
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class PruebaPersona
{
   
  public static void main(String[] args){
    //Creación de instancias de la clase Persona
    Persona persona1 = new Persona(12341, "Julieta", "Gómez",1989);
    Persona persona2 = new Persona(42125, "Ramón", "Gutierrez",1972);
    Persona persona3 = new Persona(99999, "Mayra", "Escalante",2003);
    //Prueba de métodos
    persona1.mostrar();
    persona2.mostrar();
    persona3.mostrar();
      
    System.out.println("Mostrando Apellido y Nombre de persona3: " + persona3.apeYNom());
    System.out.println("Mostrando edad de persona3: " + persona3.edad() + " años.");
    System.out.println("Mostrando Nombre y apellido de persona2: " + persona2.nomYApe());
    System.out.println("Algunos observadores de persona3(getDni(), getAnioNacimiento()): "
      + persona3.getDni() + ", " + persona3.getAnioNacimiento());
  }
}
