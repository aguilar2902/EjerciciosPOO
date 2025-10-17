/**
 * Creacion de la Clase Triangulo (hereda de FiguraGeometrica)
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    
    public Triangulo(double p_x, double p_y, double p_base, double p_altura){
        super(p_x, p_y);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    public Triangulo(double p_base, double p_altura){
        super(0, 0);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    private void setBase(double p_base){
        this.base = p_base;
    }
    
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public String nombreFigura(){
        return "\t****** Triángulo ****** ";
    }
    
    public double superficie(){
        return this.getBase() * this.getAltura();
    }
    
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.println("\tSuperficie: " + this.superficie());
    }
}