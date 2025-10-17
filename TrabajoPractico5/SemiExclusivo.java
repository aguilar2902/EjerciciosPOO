
/**
 * Write a description of class SemiExclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SemiExclusivo extends Cargo{
    
    private int horasDeInvestigacion;

    /**
     * Constructor for objects of class SemiExclusivo
     * Horas docencia deben ser minimo 10. SemiExclusivo tiene un total de 20hs maximo
     */
    public SemiExclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horasDoc)
    {
        super(p_nombre, p_sueldo, 20, p_anio);
        this.setHorasDeInvestigacion(20 - p_horasDoc);
    }
    
    private void setHorasDeInvestigacion(int p_horasInv){
        this.horasDeInvestigacion = p_horasInv;
    }
    
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("\t----Cargo de caracter SemiExclusivo----");
        System.out.println("\tHoras investigación: " + this.getHorasDeInvestigacion());
    }


}