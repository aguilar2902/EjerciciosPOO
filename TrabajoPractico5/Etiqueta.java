
/**
 * Creación de la Clase Abstracta Etiqueta
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.00 18-10-25
 */
public abstract class Etiqueta
{
    private double costo;
    
    /**
     * Constructor de la clase Etiqueta
     * 
     * @param p_costo costo de la etiqueta
     */
    public Etiqueta(double p_costo){
        this.setCosto(p_costo);
    }
    
    /**
     * Mutador privado para el costo de Etiqueta
     * 
     * @param p_costo costo de la etiqueta
     */
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    /**
     * Observador para el costo
     * 
     * @return costo de la etiqueta
     */
    public double getCosto(){
        return this.costo;
    }
    
    /**
     * Metodo abstracto para calcular precio
     * 
     * @param q cantidad de etiquetas pedidas
     */
    public abstract double precio(int q);
    
    /**
     * Metodo que devuelve el objeto en forma de String
     * 
     * @return cadena con el formato "tipo - costo"
     */
    public String toString(){
        return "tipo " + this.tipo() + " - Costo: $" + this.getCosto();
    }
    
    /**
     * Metodo abstracto para saber el tipo de etiqueta pedido
     */
    protected abstract String tipo();
}