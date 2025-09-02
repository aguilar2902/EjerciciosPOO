
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo
{
    private Punto origen;
    private double ancho;
    private double alto;
    
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    public Rectangulo(double p_ancho, double p_alto){
        this.setOrigen(new Punto(0,0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto){
        this. alto = p_alto;
    }
    
    public Punto getOrigen(){
        return this.origen;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public double getAlto(){
        return this.alto;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.setOrigen(new Punto(p_dx, p_dy));
    }
    
    public void caracteristicas(){
        System.out.println("\t****** Rectangulo ******");
        System.out.println("\tOrigen: " + this.getOrigen() + " - Alto: " + this.getAlto() +
                           " - Ancho: " + this.getAncho());
        System.out.println("\tSuperficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
    }
    
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }
    
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }
    
    public double distanciaA(Rectangulo otroRectangulo){
        return getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
    }
}
