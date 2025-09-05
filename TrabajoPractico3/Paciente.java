/**
 * Write a description of class Pacient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente
{
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    
    private void setHistoriaClinica(int p_historia){
        this.historiaClinica = p_historia;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setNacido(Localidad p_nacido){
        this.localidadNacido = p_nacido;
    }
    
    private void setVive(Localidad p_vive){
        this.localidadVive = p_vive;
    }
    
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public Localidad getNacido(){
        return this.localidadNacido;
    }
    
    public Localidad getVive(){
        return this.localidadVive;
    }
    
    public void mostrarDatosPantalla(){
        System.out.println("\tPaciente: " + this.getNombre() + " Historia Clinica: " + this.getHistoriaClinica() + " Domicilio: " + this.getDomicilio());
        this.getVive().mostrar();
    }
    
    public String cadenaDeDatos(){
        return this.getNombre() + " ...... " + this.getHistoriaClinica() + " ..... " + this.getDomicilio() + " - " + this.getVive().getNombre() + " - " + this.getVive().getProvincia();
    }
    
}