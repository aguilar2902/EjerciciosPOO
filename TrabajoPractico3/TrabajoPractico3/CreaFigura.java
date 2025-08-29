import java.util.Random;

public class CreaFigura
{
    public static void main(String[] args){
        Random unNumero1 = new Random();
        Random unNumero2 = new Random();
        double radio1 = unNumero1.nextDouble() * 100.0;
        double radio2 = unNumero2.nextDouble() * 100.0;
        
        Circulo circulo1 = new Circulo(radio1, new Punto());
        Circulo circulo2 = new Circulo(radio2, new Punto(5.2, 0.5));
        
        circulo1.desplazar(-240, -230);
        circulo1.caracteristicas();
        
        System.out.println("1: " + circulo1.superficie());
        System.out.println("2: " + circulo2.superficie());
        
        Circulo aux = circulo1.elMayor(circulo2);
        aux.caracteristicas(); 
    }
}