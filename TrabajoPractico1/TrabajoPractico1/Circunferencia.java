
/**
 * Crear una clase ejecutable denominada “Circunferencia”, en la que se calcule el perímetro de una
   circunferencia, ingresando el radio de tipo entero a través del argumento del main().
 * 
 * @author Marcelo BENGOCHEA
 * @author Jonathan AGUILAR
 * @version 1.0
 */
public class Circunferencia
{
    public static void main(String[] args){
        int radio = Integer.valueOf(args[0]);
        
        double perimetro = 2 * radio * Math.PI;
        
        System.out.println("El perímetro calculado para el radio ingresado es " + perimetro);
        
    }
}