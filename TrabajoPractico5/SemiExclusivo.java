
/**
 * Implementación de la subclase SemiExclusivo.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 */
public class SemiExclusivo extends Cargo{
    
    private int horasDeInvestigacion;

    /**
     * Constructor de objetos SemiExclusivo
     * @param p_nombre nombre del cargo
     * @param p_sueldo sueldo del cargo
     * @param p_anio año de ingreso al cargo
     * @param p_horasInv hs dedicadas a investigación
     * @throws IllegalArgumentException si las horas de investigación son menores a 0 o mayores a 10.
     */
    public SemiExclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horasInv)
    {
        super(p_nombre, p_sueldo, 20 - p_horasInv, p_anio);
        
        if(p_horasInv > 10 || p_horasInv < 0){
            throw new IllegalArgumentException("Las hs de investigación deben oscilar entre 0 y 10");
        } 
        this.setHorasDeInvestigacion(p_horasInv); 
    }
    //Mutadores
    /**
     * Agrega las hs que corresponde a investigación
     * @param p_horasInv hs a asignar para investigación
     */
    private void setHorasDeInvestigacion(int p_horasInv){
        this.horasDeInvestigacion = p_horasInv;
    }
    /**
     * @return la cantidad de hs asignadas a investigación.
     */
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    /**
     * Muestra por pantalla los detalles del cargo Semiexlusivo
     */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("\t----Cargo de caracter SemiExclusivo----");
        System.out.println("\tHoras investigación: " + this.getHorasDeInvestigacion());
    }


}