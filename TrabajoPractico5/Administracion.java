
/**
 * Creacion de la clase ejecutable Administracion
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administracion
{
    public static void main(String[] args){
        Jardin jardin = new Jardin("Bichito de Luz");
        
        FiguraGeometrica figura1 = new Cuadrado(25);
        FiguraGeometrica figura2 = new Triangulo(10, 20);
        FiguraGeometrica figura3 = new Circulo(5);
        FiguraGeometrica figura4 = new Elipse(5, 10);
        
        jardin.agregarFigura(figura1);
        jardin.agregarFigura(figura2);
        jardin.agregarFigura(figura3);
        jardin.agregarFigura(figura4);
        
        jardin.detalleFiguras();
    }
}