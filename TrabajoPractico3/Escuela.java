/**
 * Write a description of class Escuela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escuela
{
    private String nombre;
    private String domicilio;
    private String director;
    
    //Constructor
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    //Setters(mutadores)
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    //Getters (Observadores)
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public void imprimirRecibo(Docente p_docente){
        System.out.println("\tEscuela: " + this.getNombre() + "\tDomicilio: " + this.getDomicilio() + "\tDirector: " + this.getDirector());
        System.out.println("\t---------------------------------------------------------------------");
        System.out.println("\tDocente:\t" + p_docente.getNombre());
        System.out.println("\tSueldo:......................\t$" + p_docente.calcularSueldo());
        System.out.println("\tSueldo Basico................\t$" + p_docente.getSueldoBasico());
        System.out.println("\tAsignacion Familiar..........\t$" + p_docente.getAsignacionFamiliar());
    }
    
}