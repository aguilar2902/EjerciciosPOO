/**
 * Ejercicio 2 - Reutilizacion de la clase Producto
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00 
 */

public class Producto{
    //Atributos
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    //Constructores
    /**
     * Constructor para un producto con todos los parámetros
     * (excepto stock, fijado en 0)<br>
     * @param p_codigo código identificatorio del producto como entero
     * @param p_rubro rubro del producto 
     * @param p_desc descripción del producto
     * @param p_costo costo del producto
     * @param p_porcPtoRepo porcentaje de punto de reposición
     * @param p_existMinima existencia mínima del producto.
     * @param p_laboratorio objeto de tipo Laboratorio
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
    }
    /**
     * Constructor sin existencia mínima ni porc de pto de reposición
     * (Stock inicializado en 0)
     * @param p_codigo código identificatorio del producto como entero
     * @param p_rubro rubro del producto 
     * @param p_desc descripción del producto
     * @param p_costo costo del producto
     * @param p_laboratorio objeto de tipo Laboratorio
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setStock(0);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
    }
    
    //Mutadores
    /**
     * Mutador privado para añadir/modificar el código de producto
     * @param p_codigo valor entero representativo del cód. producto
     */
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    private void setLaboratorio(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    
    //Observadores
    /**
     * Observador para obtener el código de producto
     * @return un valor entero que representa el cód. producto.
     */
    public int getCodigo(){
        return this.codigo;
    }
    public String getRubro(){
        return this.rubro;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getCosto(){
        return this.costo;
    }
    public int getStock(){
        return this.stock;
    }
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    public int getExistMinima(){
        return this.existMinima;
    }
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    //Otros métodos
    /**
     * Método para mostrar datos básicos del Laboratorio
     * y del producto elegido (Rubro, descripción, precio, stock
     * y stock valorizado).
     */
    public void mostrar(){
        System.out.println("\n\t\t---------------------------");
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("\n\tRubro: " + this.getRubro());
        System.out.println("\tDescripcion: " + this.getDescripcion());
        System.out.printf("\tPrecio costo: $%.2f\n", this.getCosto());
        System.out.printf("\tStock: %d - Stock Valorizado: $%.2f", this.getStock(), this.stockValorizado());
        System.out.println("\n\t\t---------------------------");
        //System.out.println("\tPrecio costo: " + this.getCosto());
        //System.out.println("\tStock:" + this.getStock() + " - Stock Valorizado: $" + this.stockValorizado());
        
    }
    /**
     * Método para ajustar el stock disponible del producto.
     * Posee una validación para no guardar números negativos.
     * @param p_cantidad cantidad de productos a agregar/quitar (núm negativo para quitar).
     */
    public void ajuste(int p_cantidad){
        int resultado = this.getStock() + p_cantidad;
        if(resultado >= 0){
            this.setStock(resultado);
        } else {
            this.setStock(0);
            System.out.println("\tEl stock era menor a la cantidad de productos quitados");
            System.out.println("\tFaltante: " + Math.abs(resultado) 
                + " .Stock actualizado: " + this.getStock() + "."); 
        }
    }
    /**
     * Obtiene un valor dependiente del stock disponible y el costo (más una rentabilidad
     * del 12% extra) del producto comercializado.
     * @return el resultante de aplicar el producto entre el stock disponible y el costo
     * , adicionando además una rentabilidad del 12%
     */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto()) * 1.12;
    }
    /**
     * Obtiene el precio de lista del producto
     * @return el resultado de aplicar al precio de costo un recargo del 12%.
     */
    public double precioLista(){
        return this.getCosto() + (this.getCosto() * 12 / 100);
    }
    /**
     * Obtiene el precio especial por compras al contado.
     * @return el resultado de aplicar al precio de costo un descuento del 5%.
     */
    public double precioContado(){
        return this.getCosto() - (this.getCosto() * 5 / 100);
    }
    /**
     * Muestra en una línea detalles de un producto(descripción, precio de lista y 
     * precio contado).
     */
    public void mostrarLinea(){
        System.out.printf("\t%s  %.2f  %.2f\n", this.getDescripcion(), this.precioLista(), this.precioContado());
    }
    
    //Métodos públicos especiales por políticas de la empresa
    /**
     * Permite setear el porcentaje de punto de reposición
     * @param p_porc valor de tipo doble a asignar como porcentaje pto. reposición.
     */
    public void ajustarPtoRepo(double p_porc){
        this.setPorcPtoRepo(p_porc);
    }
    /**
     * Permite setear la existencia mínima de un producto.
     * @param p_cantidad valor entero representativo de la existencia mínima.
     */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
}