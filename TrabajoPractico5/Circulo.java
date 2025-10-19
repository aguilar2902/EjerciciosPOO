
/**
 * Implementación de la clase Círculo
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Circulo extends Elipse
{
    /**
     * Constructor de un Círculo con un punto de origen distinto a (0,0)
     * @param p_x coordenada x del punto de origen
     * @param p_y coordenada y del punto de origen
     * @param p_radio radio del circulo
     */
    public Circulo(double p_x, double p_y, double p_radio){
        super(p_x, p_y, p_radio, p_radio);
    }
    /**
     * Constructor de un Círculo con punto de origen en (0,0)
     * @param p_radio radio del circulo
     */
    public Circulo(double p_radio){
        super(p_radio, p_radio);
    }
    //Otros métodos
    /**
     * @return el valor que corresponde al perímetro del círculo
     */
    public double perimetro(){
        return 2 * Math.PI * this.getSEjeMenor();
    }
    /**
     * Muestra las características de la Elipse
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("\tCentro: " + this.getOrigen().coordenadas() + " - Radio: " + this.getSEjeMenor());
        System.out.println("\tSuperficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
        System.out.println();
    }
    public String nombreFigura(){
        return "\t****** Circulo ****** ";
    }
    
}