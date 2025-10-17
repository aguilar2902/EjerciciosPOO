
/**
 * Write a description of class Lavarropas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lavarropas extends ArtefactoHogar
{
    private int programas;
    private float kilos;
    private boolean automatico;
    
    //CONSTRUCTOR
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_prog, float p_kilos, boolean p_auto){
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_prog);
        this.setKilos(p_kilos);
        this.setAutomatico(p_auto);
    }
    
    //SETTER
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
    
    public float creditoConAdicional(int p_cuotas, float p_interes){
        if(!this.getAutomatico()){
            return this.cuotaCredito(p_cuotas, p_interes) * (float)(1 - 0.02);
        }
        
        return this.cuotaCredito(p_cuotas, p_interes);
    }
}