
/**
 * Creacion de la clase Comun (Hereda de Etiqueta)
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.00 18-10-25
 */
public class Comun extends Etiqueta
{
    private double plus;
    
    /**
     * Constructor de Comun
     * 
     * @param p_plus dinero que pagan por el diseño
     */
    public Comun(double p_plus){
        //al ser comun, el precio es fijo - $100,00
        super(100.0);
        this.setPlus(p_plus);
    }
    
    /**
     * Constructor vacio de Comun
     */
    public Comun(){
        super(100.0);
        this.setPlus(0.0);
    }
    
    /**
     * Mutador privado de Plus
     * 
     * @p_plus dinero que pagan por el diseño
     */
    private void setPlus(double p_plus){
        this.plus = p_plus;
    }
    
    /**
     * Observador de Plus
     * 
     * @return el monto pagado por el diseño
     */
    public double getPlus(){
        return this.plus;
    }
    
    /**
     * Metodo que calcula el precio final del producto
     * 
     * @param q cantidad del producto solicitado
     * @return precio final a pagar - (costo * cant + plus) * descuento
     */
    public double precio(int q){
        return ((super.getCosto() * q) + this.getPlus()) * (1 - this.descuento(q));    
    };
    
    /**
     * Metodo que calcula el descuento
     * 
     * @param q cantidad del producto solicitado
     * @return tamaño del descuento a hacer sobre el precio final
     */
    private double descuento(int q){
        if(q < 11){
            return 0.0;
        }else if(q < 51){
            return 0.02;
        }else if(q < 101){
            return 0.05;
        }else{
            return q / 10 * 0.01;
        }
    }
    
    /**
     * Metodo que muestra el tipo de etiqueta comprada
     * 
     * @return el nombre de la clase
     */
    protected String tipo(){
        return this.getClass().getSimpleName();
    }
    
    /**
     * Metodo que devuelve el objeto en forma de String
     * 
     * @return concatena lo que hay en el padre y el monto pagado por diseño
     */
    public String toString(){
        return super.toString() + " - Diseño: $" + this.getPlus(); 
    }
}