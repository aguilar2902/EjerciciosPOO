
/**
 * Ejercicio 3: Implementación de la clase Círculo
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Circulo
{
    //Atributos
    private double radio;
    private Punto centro;
    /**
     * Constructor con parámetros
     * @param p_radio radio del círculo
     * @param p_centro punto central
     */
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
        
    }
    /**
     * Constructor sin parámetros.<br>
     * El radio se setea en 0 y el punto en (0,0)
     */
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto());
    }
    //Mutadores
    /**
     * mutador privado que setea el punto que marca el centro del círculo
     * @param p_centro corresponde al punto centro del círculo
     */
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    //Observadores
    /**
     * Observador que obtiene el punto central del círculo
     * @return el punto que representa el centro del círculo
     */
    public Punto getCentro(){
        return this.centro;
    }
    public double getRadio(){
        return this.radio;
    }
    //Otros métodos
    /**
     * Desplaza el punto que representa el centro del círculo
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    /**
     * Muestra los detalles del círculo (Centro, Radio, Superficie y Perímetro)
     */
    public void caracteristicas(){
        System.out.println("\n\t****** Círculo ******");
        System.out.println("\tCentro: " + this.getCentro().coordenadas() + " - Radio: " + this.getRadio());
        System.out.println("\tSuperficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
        System.out.println();
    }
    /**
     * @return el valor que corresponde al perímetro del círculo
     */
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    /**
     * @return el valor que corresponde a la superficie del círculo
     */
    public double superficie(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
    /**
     * Devuelve la distancia calculada entre dos círculos (distancia entre sus centros)
     * @param otroCirculo un objeto del tipo Circulo
     * @return la distancia hallada entre el círculo que llama al método y el recibido como parámetro.
     */
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
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
}