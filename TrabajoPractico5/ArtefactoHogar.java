
/**
 * Write a description of class ArtefactoHogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class ArtefactoHogar
{
    private String marca;
    private float precio;
    private int stock;
    
    //CONSTRUCTORES
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    
    //SETTER
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
    public void imprimir(){
        System.out.println("\tMarca: " + this.getMarca() + " - Precio: " + this.getPrecio() + " - Stock: " + this.getStock());
    }
    
    public float cuotaCredito(int p_cuotas, float p_interes){
        //hay que arreglar. 
        return (this.getPrecio() + (this.getPrecio() * p_interes / 100)) / p_cuotas;
    }
    
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}
