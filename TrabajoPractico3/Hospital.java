
/**
 * Write a description of class Hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
    
    public Hospital(String p_hospital, String p_director){
        this.setNombreHospital(p_hospital);
        this.setNombreDirector(p_director);
    }
    
    private void setNombreHospital(String p_hospital){
        this.nombreHospital = p_hospital;
    }
    
    private void setNombreDirector(String p_director){
        this.nombreDirector = p_director;
    }
    
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("\tHospital: " + this.getNombreHospital() + " Director: " + this.getNombreDirector());
        System.out.println("\t--------------------------------------------------------------------------------\n");
        p_paciente.mostrarDatosPantalla();
    }
    
}