
/**
 * Write a description of class PruebaCalculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaCalculadora
{
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        int ResSuma = calc.sumar(43, 79);
        System.out.println("Resultado de la Suma: " + ResSuma);
        
        try{
            double ResDiv = calc.dividir(15, 0);
            System.out.println("Resultado de la División: " + ResDiv);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero. Error: " + e);
        } catch(Exception e){
            System.out.println("Error en la operación. Error:" + e);
        } finally {
            System.out.println("Continuando...");
        }
    }
}