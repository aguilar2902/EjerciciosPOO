/**
 * Ejercicio 8
 * Implementación de la clase Paciente
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Paciente
{
    //Atributos
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Constructor para un paciente
     * @param p_historia nro de historia clínica
     * @param p_nombre nombre del paciente
     * @param p_domicilio domicilio del paciente
     * @param p_localidadNacido objeto de tipo Localidad (nacimiento)
     * @param p_localidadVive objeto de tipo Localidad donde vive actualmente
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio,
        Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    //Mutadores
    /**
     * Mutador privado para asignar/modificar la historia clínica
     * @param p_historia entero que representa el nro de historia clínica.
     */
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
    //Observadores
    /**
     * Observador para obtener el nro de historia clínica
     * @return un entero que representa el nro de historia clínica.
     */
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
    //Otros métodos
    /**
     * Muestra por pantalla los datos del paciente(nombre,HC,domicilio,
     * localidad y provincia actual donde vive)
     */
    public void mostrarDatosPantalla(){
        System.out.println("\tPaciente: " + this.getNombre() + "  Historia Clinica: " + this.getHistoriaClinica() + "  Domicilio: " +
        this.getDomicilio() + ("\n") + this.getVive().mostrar());
    }
    /**
     * Obtiene una cadena de texto con datos básicos del paciente(nombre,HC,
     * domicilio,localidad y provincia)
     * @return una cadena de texto en línea con los datos del paciente.
     */
    public String cadenaDeDatos(){
        return this.getNombre() + " ...... " + this.getHistoriaClinica() + " ..... " + this.getDomicilio() + " - " + this.getVive().getNombre() + " - " + this.getVive().getProvincia();
    }
    
}