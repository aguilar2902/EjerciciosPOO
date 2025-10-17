
/**
 * Write a description of class Cocina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cocina extends ArtefactoHogar
{
    private int hornallas;
    private int calorias;
    private String dimensiones;
    
    //CONSTRUCTOR
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas,int p_calorias, String p_dim){
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dim);
    }
    
    //SETTER
    private void setHornallas(int p_hornallas){
        this.hornallas = p_hornallas;
    }
    
    private void setCalorias(int p_calorias){
        this.calorias = p_calorias;
    }
    
    private void setDimensiones(String p_dim){
        this.dimensiones = p_dim;
    }
    
    //GETTER
    public int getHornallas(){
        return this.hornallas;
    }
    
    public int getCalorias(){
        return this.calorias;
    }
    
    public String getDimensiones(){
        return this.dimensiones;
    }
    
    //OTROS METODOS
    public void imprimir(){
        System.out.println("\t **** Cocina ****");
        super.imprimir();
        System.out.println("\tHornallas: " + this.getHornallas());
        System.out.println("\tCalorias: " + this.getCalorias());
        System.out.println("\tDimensiones: " + this.getDimensiones());
    }
    
    public float creditoConAdicional(int p_cuotas, float p_interes){
        return this.cuotaCredito(p_cuotas, p_interes);
    };
}