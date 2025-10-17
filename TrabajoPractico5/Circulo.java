
/**
 * Ejercicio 3: Implementación de la clase Círculo
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Circulo extends Elipse
{
    //Atributos
    /**
     * Constructor con parámetros
     * @param p_radio radio del círculo
     * @param p_centro punto central
     */
    public Circulo(double p_x, double p_y, double p_radio){
        //ambos radios son iguales para el circulo
        super(p_x, p_y, p_radio, p_radio);
    }
    /**
     * Constructor sin parámetros.<br>
     * El radio se setea en 0 y el punto en (0,0)
     */
    public Circulo(double p_radio){
        //ambos radios son iguales para el circulo
        super(0, 0, p_radio, p_radio);
    }
    //Mutadores
    
    //Otros métodos

    /**
     * Muestra los detalles del círculo (Centro, Radio, Superficie y Perímetro)
     */
    public void caracteristicas(){
        System.out.println("\n\t****** Círculo ******");
        System.out.println("\tCentro: " + super.getOrigen().coordenadas() + " - Radio: " + super.getRadioMenor());
        System.out.println("\tSuperficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
        System.out.println();
    }
    /**
     * @return el valor que corresponde al perímetro del círculo
     */
    public double perimetro(){
        return 2 * Math.PI * super.getRadioMenor();
    }
    /**
     * @return el valor que corresponde a la superficie del círculo
     */
    public double superficie(){
        return Math.PI * Math.pow(super.getRadioMenor(), 2);
    }
    /**
     * Devuelve la distancia calculada entre dos círculos (distancia entre sus centros)
     * @param otroCirculo un objeto del tipo Circulo
     * @return la distancia hallada entre el círculo que llama al método y el recibido como parámetro.
     */
    public double distanciaA(Circulo otroCirculo){
        return super.getOrigen().distanciaA(otroCirculo.getOrigen());
    }
    /**
     * Método que compara entre el tamaño entre círculo que lo invoca y el que recibe como parámetro.
     * @param otroCirculo objeto de tipo Circulo con el que se va a comparar
     * @return el objeto Circulo que posee mayor tamaño
     */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
    
    public String nombreFigura(){
        return "\t****** Circulo ****** ";
    }
    
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.println("\tSuperficie: " + this.superficie());
    }
}