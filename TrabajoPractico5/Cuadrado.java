/**
 * Implementación de Clase Cuadrado
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Cuadrado extends Rectangulo
{
    /**
     * Constructor para un Cuadrado con origen distinto a (0,0)
     * @param p_x coordenada x del punto
     * @param p_y coordenada y del punto
     * @param p_lado valor del lado
     */
    public Cuadrado(int p_x, int p_y, double p_lado){
        super(p_x, p_y, p_lado, p_lado);
    }
    /**
     * Constructor para un Cuadrado con origen en (0,0)
     * @param p_lado valor del lado
     */
    public Cuadrado(double p_lado){
        super(p_lado, p_lado);
    }
    
    /**
     * Muestra las características del Cuadrado(Origen, Lado, Superficie y Perímetro)
     */
    public void caracteristicas(){
        this.nombreFigura();
        System.out.println("\tOrigen: " + this.getOrigen().coordenadas() + " - Lado: " + this.getAlto());
        System.out.println("\tSuperficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
        System.out.println();
    }
    /**
     * Obtiene el nombre de la figura
     * @return cadena de texto con la leyenda Cuadrado
     */
    public String nombreFigura(){
        return "\t****** Cuadrado ****** ";
    }
}