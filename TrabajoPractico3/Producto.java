public class Producto{
    //atributos
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
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
    
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setStock(0);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
    }
    
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
    
    public void mostrar(){
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("\n\tRubro: " + this.getRubro());
        System.out.println("\tDescripcion: " + this.getDescripcion());
        System.out.println("\tPrecio costo: " + this.getCosto());
        System.out.println("\tStock: " + this.getStock() + " - Stock Valorizado: $ 0" + this.stockValorizado());
        
    }
    
    //ver validacion
    public void ajuste(int p_cantidad){
            this.setStock(this.getStock() + p_cantidad);      
    }
    
    public double stockValorizado(){
        return (this.getStock() * this.getCosto()) * 1.12;
    }
    
    public double precioLista(){
        return this.getCosto() + (this.getCosto() * 12 / 100);
    }
    
    public double precioContado(){
        return this.getCosto() - (this.getCosto() * 5 / 100);
    }
    
    public void mostrarLinea(){
        System.out.println("\t" + this.getDescripcion() + "  " + this.precioLista() + "  " + this.precioContado());
    }
    
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
}