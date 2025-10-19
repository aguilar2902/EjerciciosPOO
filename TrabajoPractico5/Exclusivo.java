
/**
 * Implementación de la subclase Exclusivo.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 */
public class Exclusivo extends Cargo{
    private int horasDeInvestigacion;
    private int horasDeExtension;

    /**
     * Constructor para objetos de la clase Exclusivo
     * @param p_nombre nombre del cargo
     * @param p_sueldo sueldo del cargo
     * @param p_anio año de ingreso al cargo
     * @param p_horasDoc horas de docencia
     * @param p_horasInv horas de investigación
     * @param p_horasExt horas de extensión
     * 
     */
    public Exclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horasDoc, int p_horasInv, int p_horasExt)
    {
        super(p_nombre, p_sueldo, p_horasDoc, p_anio);
        this.setHorasDeInvestigacion(p_horasInv);
        this.setHorasDeExtension(p_horasExt);
    }
    //Mutadores
    /**
     * Mutador para las hs de investigación
     * @param p_horasInv horas de investigación a asignar
     */
    private void setHorasDeInvestigacion(int p_horasInv){
        this.horasDeInvestigacion = p_horasInv;
    }
    private void setHorasDeExtension(int p_horasExt){
        this.horasDeExtension = p_horasExt;
    }
    //Observadores
    /**
     * Obtiene las hs de investigación
     * @return el valor asignado a las hs de investigación
     */
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