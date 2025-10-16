
/**
 * Creacion de la clase Renglon
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.00 18-10-25
 */
public class Renglon
{
    private int cantidad;
    private double importe;
    private Etiqueta item;
    
    /**
     * Constructor de Renglon
     * 
     * @param p_cant cantidad de etiquetas solicitadas
     * @param p_item datos de tipo Etiqueta
     */
    public Renglon(int p_cant, Etiqueta p_item){
        this.setCantidad(p_cant);
        this.setItem(p_item);
        //el importe calculamos pidiendo el precio segun la etiqueta
        this.setImporte(this.getItem().precio(p_cant));
    }
    
    /**
     * Mutador privado de cantidad
     * 
     * @param p_cant cantidad de etiquetas solicitadas
     */
    private void setCantidad(int p_cant){
        this.cantidad = p_cant;
    }
    
    private void setImporte(double p_importe){
        this.importe = p_importe;
    }
    
    private void setItem(Etiqueta p_item){
        this.item = p_item;
    }
    
    /**
     * Observador de cantidad
     * 
     * @return cantidad de etiquetas solicitadas
     */
    public int getCantidad(){
        return this.cantidad;
    }
    
    public double getImporte(){
        return this.importe;
    }
    
    public Etiqueta getItem(){
        return this.item;
    }
    
    /**
     * Metodo que muestra la cantidad y el tipo de etiqueta solicitado
     */
    public void mostrar(){
        System.out.println(this.getCantidad() + " Etiquetas de " + this.getItem().toString());
    }
}