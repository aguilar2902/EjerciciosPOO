/**
 * Ejercicio 8
 * Implementación de la clase Hospital
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Hospital
{
    //Atributos
    private String nombreHospital;
    private String nombreDirector;
    
    /**
     * Constructor de un Hospital
     * @param p_hospital nombre del hospital
     * @param p_director nombre de la persona a cargo del mismo
     */
    public Hospital(String p_hospital, String p_director){
        this.setNombreHospital(p_hospital);
        this.setNombreDirector(p_director);
    }
    //Mutadores
    /**
     * @param asigna un nombre al hospital
     */
    private void setNombreHospital(String p_hospital){
        this.nombreHospital = p_hospital;
    }
    private void setNombreDirector(String p_director){
        this.nombreDirector = p_director;
    }
    //Observadores
    /**
     * @return el nombre del hospital
     */
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    //Otros métodos
    /**
     * Muestra además de los datos del hospital (nombre,director),
     * los correspondientes al paciente recibido como parámetro
     * @param p_paciente un objeto del tipo Paciente
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("\tHospital: " + this.getNombreHospital() + "  Director: " + this.getNombreDirector());
        System.out.println("\t--------------------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
    
}