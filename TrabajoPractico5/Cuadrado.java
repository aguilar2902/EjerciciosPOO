/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Rectangulo
{
    public Cuadrado(int p_x, int p_y, double p_ancho){
        //se repite el argumento porque es un rectangulo especial con los dos lados iguales
        super(p_x, p_y, p_ancho, p_ancho);
    }
    
    public Cuadrado(double p_ancho){
        //se repite el argumento porque es un rectangulo especial con los dos lados iguales
        super(p_ancho, p_ancho);
    }
    
    public String nombreFigura(){
        return "\t****** Cuadrado ****** ";
    }
    
    public double superficie(){
        return this.getAncho() * this.getAncho();
    }
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.println("\tSuperficie: " + this.superficie());
    }
}