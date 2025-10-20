
/**
 * Implementación de la clase abstracta ArtefactoHogar
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public abstract class ArtefactoHogar
{
    private String marca;
    private float precio;
    private int stock;
    
    //CONSTRUCTORES
    /**
     * Constructor de ArtefactoHogar
     * @param p_marca marca del electrodoméstico
     * @param p_precio precio del electrodoméstico
     * @param p_stock stock actual
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    
    //SETTER
    /**
     * Mutador para asignar la marca del electrodoméstico
     * @param p_marca nombre de la marca
     */
    private void setMarca(String p_marca){
        this.marca = p_marca;
    }
    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    //GETTER
    /**
     * Observador para la marca del producto
     * @return la marca del producto
     */
    public String getMarca(){
        return this.marca;
    }
    public float getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }
    
    //OTROS METODOS
    /**
     * Muestra por pantalla características generales del electrodoméstico
     */
    public void imprimir(){
        System.out.println("\tMarca: " + this.getMarca() + " - Precio: " + this.getPrecio() + " - Stock: " + this.getStock());
    }
    
    /**
     * Obtiene el valor de la Cuota
     * @param p_cuotas cantidad de cuotas
     * @param p_interés a agregar 
     * @return el valor definitivo de la cuota
     */
    public float cuotaCredito(int p_cuotas, float p_interes){
        return (this.getPrecio() + (this.getPrecio() * p_interes / 100)) / p_cuotas;
    }
    
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}
