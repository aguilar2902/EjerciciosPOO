
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
        //Pruebas de figuras
        Rectangulo figura9 = new Rectangulo(6, 8, 10 , 3);
        Elipse figura10 = new Elipse(4,9);
        
        jardin.agregarFigura(figura1);
        jardin.agregarFigura(figura2);
        jardin.agregarFigura(figura3);
        jardin.agregarFigura(figura4);
        
        jardin.detalleFiguras();
        //figuras
        figura9.caracteristicas();
        figura10.caracteristicas();
        
    }
}