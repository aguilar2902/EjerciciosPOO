
/**
 * Ejercicio 3
 * Modelado de la clase Circulo
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo
{
    private double radio;
    private Punto centro;
    /**
     * Constructor completo
     * @param p_radio radio del circulo
     * @param p_centro punto central
     */
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
        
    }
    
    /**
     * Constructor sin parámetros
     */
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto());
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    //Cambiar los valores
    public void caracteristicas(){
        System.out.println("\t****** Circulo ******");
        System.out.println("\tCentro: ("+ this.getCentro().getX() +"," +this.getCentro().getY() +") - Radio: " + this.getRadio());
        System.out.println("\tSuperficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
    public double superficie(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
    
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
}