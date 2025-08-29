
/**
 * Crear una clase denominada TrianguloRectangulo, en la que se determine si un triangulo es rectángulo
    (Teorema de Pitágoras → h2 = cateto12 + cateto22). 
    Los lados se deben ingresar por teclado, utilizando el argumento del main().
    Nota: probar con hipotenusa = 5; cateto1 = 3; cateto2 = 4;
 * 
 * @author Marcelo BENGOCHEA
 * @author Jonathan AGUILAR
 * @version 1.0
 */
public class TrianguloRectangulo
{
    public static void main(String[] args){
        
        double hipotenusa = Double.parseDouble(args[0]);
        double cateto1 = Double.parseDouble(args[1]);
        double cateto2 = Double.parseDouble(args[2]);
        
        boolean esTrianguloRectangulo = Math.pow(hipotenusa,2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        
        if(esTrianguloRectangulo){
            System.out.println("Es un triángulo rectángulo");
        } else {
            System.out.println("No es un triángulo rectángulo");
        }
    }
}