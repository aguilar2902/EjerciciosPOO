
/**
 * Implementación de la clase Heladera
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Heladera extends ArtefactoHogar
{
    private int pies;
    private int puertas;
    private boolean compresor;
    
    //CONSTRUCTOR
    /**
     * Constructor para Heladera
     * @param p_marca marca de la heladera
     * @param p_precio precio de la heladera
     * @param p_stock cantidad de heladeras disponibles
     * @param p_pies cantidad de pies
     * @param p_puertas cantidad de puertas
     * @param p_comp define si la heladera posee o no compresor(booleano)
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_comp){
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_comp);
    }
    
    //SETTER
    /**
     * Mutador para pies de la heladera
     * @param p_pies cant de pies
     */
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    private void setCompresor(boolean p_comp){
        this.compresor = p_comp;
    }
    
    //GETTER
    /**
     * Obtiene la cantidad de pies 
     * @return cantidad de pies
     */
    public int getPies(){
        return this.pies;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public boolean getCompresor(){
        return this.compresor;
    }
    
    //OTROS METODOS
    /**
     * Muestra detalles de la Heladera
     */
    public void imprimir(){
        System.out.println("\t **** Heladera ****");
        super.imprimir();
        System.out.println("\tPies: " + this.getPies());
        System.out.println("\tPuertas: " + this.getPuertas());
        if(this.getCompresor()){
            System.out.println("\tCompresor: SI");
        }else{
            System.out.println("\tCompresor: NO");
        }
        
    }
    /**
     * Calcula el importe final de la cuota(si corresponde un costo adicional por seguro)
     * @param p_cuotas cantidad de cuotas
     * @param p_intereses intereses a aplicar
     * @return el importe final de cada cuota
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        if(this.getCompresor()){
            return this.cuotaCredito(p_cuotas, p_interes) + 50.0f;
        }
        return this.cuotaCredito(p_cuotas, p_interes);
    };
}