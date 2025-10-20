
/**
 * Implementación de la clase Cocina
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Cocina extends ArtefactoHogar
{
    private int hornallas;
    private int calorias;
    private String dimensiones;
    
    //CONSTRUCTOR
    /**
     * Constructor de objetos de la clase Cocina
     * @param p_marca marca de la cocina
     * @param p_precio precio de la cocina
     * @param p_stock stock disponible
     * @param p_hornallas cantidad de hornallas de la cocina
     * @param p_calorias calorías 
     */    
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas,int p_calorias, String p_dim){
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dim);
    }
    
    //SETTER
    /**
     * Mutador para la cantidad de hornallas
     * @param p_hornallas cantidad de hornallas de la cocina
     */
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
    /**
     * Obtiene la cantidad de hornallas de la cocina
     * @return cant de hornallas
     */
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
    /**
     * Imprimir los detalles de la Cocina
     */
    public void imprimir(){
        System.out.println("\t **** Cocina ****");
        super.imprimir();
        System.out.println("\tHornallas: " + this.getHornallas());
        System.out.println("\tCalorias: " + this.getCalorias());
        System.out.println("\tDimensiones: " + this.getDimensiones());
    }
    /**
     * Calcula un valor adicional del crédito
     * @param p_cuotas cantidad de cuotas
     * @param p_intereses intereses a aplicar
     * @return el importe final de la cuota de la cocina
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        return this.cuotaCredito(p_cuotas, p_interes);
    };
}