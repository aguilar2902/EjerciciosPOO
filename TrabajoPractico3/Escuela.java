/**
 * Ejercicio 6: Implementación de la clase Escuela
 * Nota: Aquí se evidencia una relación de dependencia (débil, por parámetro).
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Escuela
{
    //Atributos
    private String nombre;
    private String domicilio;
    private String director;
    
    /**
     * Constructor para una Escuela
     * @param p_nombre nombre de la institución
     * @param p_domicilio ubicación del institución
     * @param p_director autoridad designada
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    //Setters(mutadores)
    /**
     * Mutador privado que permite agregar/modificar el nombre de la institución
     * @param p_nombre el nombre que se desea asignar a la escuela
     */
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
    /**
     * @return el nombre que tiene asignado la escuela
     */
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getDirector(){
        return this.director;
    }
    //Otros métodos
    /**
     * Muestra por pantalla el recibo de un docente con datos de la institución y
     * del docente(nombre, sueldo, sueldo básico y asignación familiar)
     * @param p_docente el objeto Docente sobre el que se emitirá el recibo
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("\tEscuela: " + this.getNombre() + " \tDomicilio: " + this.getDomicilio() + " \tDirector: " + this.getDirector());
        System.out.println("\t------------------------------------------------------------------------------------------");
        System.out.println("\tDocente:\t" + p_docente.getNombre());
        System.out.println("\tSueldo:......................\t$" + p_docente.calcularSueldo());
        System.out.println("\tSueldo Basico................\t$" + p_docente.getSueldoBasico());
        System.out.println("\tAsignacion Familiar..........\t$" + p_docente.getAsignacionFamiliar());
    }
    
}