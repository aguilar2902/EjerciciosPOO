/**
 * Creacion de la Clase Elipse
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Elipse extends FiguraGeometrica
{
    private double radioMenor;
    private double radioMayor;
    
    public Elipse(double p_x, double p_y, double p_menor, double p_mayor){
        super(p_x, p_y);
        this.setRadioMenor(p_menor);
        this.setRadioMayor(p_mayor);
    }
    
    public Elipse(double p_menor, double p_mayor){
        super(0, 0);
        this.setRadioMenor(p_menor);
        this.setRadioMayor(p_mayor);
    }
    
    private void setRadioMenor(double p_menor){
        this.radioMenor = p_menor;
    }
    
    private void setRadioMayor(double p_mayor){
        this.radioMayor = p_mayor;
    }
    
    public double getRadioMenor(){
        return this.radioMenor;
    }
    
    public double getRadioMayor(){
        return this.radioMayor;
    }
    
    /**
     * Desplaza el punto que representa el centro de la figura
     */
    public void desplazar(double p_dx, double p_dy){
        super.getOrigen().desplazar(p_dx, p_dy);
    }
    
    public String nombreFigura(){
        return "\t****** Elipse ****** ";
    }
    
    public double superficie(){
        return Math.PI * this.getRadioMenor() * this.getRadioMayor();
    }
    
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.println("\tSuperficie: " + this.superficie());
    }

}