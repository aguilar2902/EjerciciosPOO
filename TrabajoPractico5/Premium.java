
/**
 * Creacion de la Clase Premium (Hereda de la clase Etiqueta)
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.00 18-10-25
 */
public class Premium extends Etiqueta
{
    private int colores;
    
    /**
     * Constructor de Premium
     * 
     * @param p_costo costo unitario de la etiqueta (super)
     * @param p_colores cantidad de colores pedidos
     */    
    public Premium(double p_costo, int p_colores){
        super(p_costo);
        this.setColores(p_colores);
    }
    
    /**
     * Constructor de Premium (sin colores)
     * 
     * @param p_costo costo unitario de la etiqueta (super)
     */
    public Premium(double p_costo){
        super(p_costo);
        this.setColores(0);
    }
    
    /**
     * Mutador privado de colores
     * 
     * @param p_colores cantidad de colores pedidos
     */
    private void setColores(int p_colores){
        this.colores = p_colores;    
    }
    
    
    /**
     * Observador de colores
     * 
     * @return cantidad de colores pedidos
     */
    public int getColores(){
        return this.colores;
    }
    
    /**
     * Metodo que calcula el precio final del producto 
     * 
     * @param q cantidad del producto solicitado
     * @return devuelve el precio - (costo * cant) * adicional
     */
    public double precio(int q){
        return (super.getCosto() * q) * (1 + this.adicional()) ;    
    }
    
    /**
     * Metodo que calcula el porcentaje que se debe agregar al precio final
     * 
     * @return porcentaje a agregar al precio final (depende de colores pedidos)
     */
    private double adicional(){
        double aux;
        
        switch(this.getColores()){
            case 1: 
                aux = 0.0;
                break;
            case 2: 
                aux = 0.05;
                break;
            case 3:
                aux = 0.07;
                break;
            default:
                aux = this.getColores() * 0.03;
        }
        return aux;
    }
    
    /**
     * Metodo que muestra el tipo de etiqueta comprada
     * 
     * @return "premium"
     */
    protected String tipo(){
        return this.getClass().getSimpleName();
    };
    
    /**
     * Metodo que devuelve el objeto en forma de String
     * 
     * @return concatena lo que hay en el padre y cantidad de colores
     */
    public String toString(){
        return super.toString() + " - Colores: " + this.getColores();
    }
}