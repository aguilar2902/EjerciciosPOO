
/**
 * Write a description of class Heladera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heladera extends ArtefactoHogar
{
    private int pies;
    private int puertas;
    private boolean compresor;
    
    //CONSTRUCTOR
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_comp){
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_comp);
    }
    
    //SETTER
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
    
    public float creditoConAdicional(int p_cuotas, float p_interes){
        if(this.getCompresor()){
            return this.cuotaCredito(p_cuotas, p_interes) + (float)50.0;
        }
        return this.cuotaCredito(p_cuotas, p_interes);
    };
}