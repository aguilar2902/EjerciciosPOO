
/**
 * Write a description of class Exclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exclusivo extends Cargo{
    private int horasDeInvestigacion;
    private int horasDeExtension;

    /**
     * Constructor para objetos de la clase Exclusivo
     */
    public Exclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horasDoc, int p_horasInv, int p_horasExt)
    {
        super(p_nombre, p_sueldo, p_horasDoc, p_anio);
        this.setHorasDeInvestigacion(p_horasInv);
        this.setHorasDeExtension(p_horasExt);
    }

    private void setHorasDeInvestigacion(int p_horasInv){
        this.horasDeInvestigacion = p_horasInv;
    }
    
    private void setHorasDeExtension(int p_horasExt){
        this.horasDeExtension = p_horasExt;
    }
    
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("\t----Cargo de caracter Exclusivo----");
        System.out.println("\tHoras investigación: " + this.getHorasDeInvestigacion());
        System.out.println("\tHoras extension: " + this.getHorasDeExtension());
    }
}