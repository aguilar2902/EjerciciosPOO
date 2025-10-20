
/**
 * Implementación de la clase Lavarropa 
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Lavarropas extends ArtefactoHogar
{
    private int programas;
    private float kilos;
    private boolean automatico;
    
    //CONSTRUCTOR
    /**
     * Constructor para Lavarropas
     * @param p_marca marca del lavarropas
     * @param p_precio precio del lavarropas
     * @param p_stock cantidad de lavarropas disponibles
     * @param p_prog cantidad de programas del lavarropas
     * @param p_kilos peso del lavarropas
     * @param p_auto si es automático o no(booleano)
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_prog, float p_kilos, boolean p_auto){
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_prog);
        this.setKilos(p_kilos);
        this.setAutomatico(p_auto);
    }
    
    //SETTER
    /**
     * Setea la cantidad de programas del lavarropas
     * @param p_prog cant de programas
     */
    private void setProgramas(int p_prog){
        this.programas = p_prog;
    }
    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }    
    private void setAutomatico(boolean p_auto){
        this.automatico = p_auto;
    }
    
    //GETTER
    /**
     * Obtiene el valor de cant de programas
     * @return cant de programas del lavarropas
     */
    public int getProgramas(){
        return this.programas;
    }
    public float getKilos(){
        return this.kilos;
    }
    public boolean getAutomatico(){
        return this.automatico;
    }
    
    //OTROS METODOS
    /**
     * Imprime por pantalla los detalles del Lavarropas
     */
    public void imprimir(){
        System.out.println("\t **** Lavarropa ****");
        super.imprimir();
        System.out.println("\tProgramas: " + this.getProgramas());
        System.out.println("\tKilos: " + this.getKilos());
        if(this.getAutomatico()){
            System.out.println("\tCompresor: SI");
        }else{
            System.out.println("\tCompresor: NO");
        }
    }
    /**
     * Obtiene el importe final de la cuota teniendo en cuenta el adicional
     * @param p_cuotas cantidad de cuotas
     * @param p_intereses intereses a aplicar
     * @return el importe final (si no es automático, tiene un descuento del 2% 
     * en la cuota
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        if(!this.getAutomatico()){
            return this.cuotaCredito(p_cuotas, p_interes) * (float)(1 - 0.02);
        }
        return this.cuotaCredito(p_cuotas, p_interes);
    }
}