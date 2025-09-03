/**
 * Ejercicio 10: Clase Mujer
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

public class Mujer
{
    /**
     * Atributos de la clase Mujer
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
     * Constructor para Mujer Soltera.<br>
     * El estado civil se asigna como "Soltera" y el esposo se 
     * setea en null.
     * @param p_nombre Cadena de texto correspondiente al nombre
     * @param p_apellido Cadena de texto correspondiente al apellido
     * @param p_edad Valor de tipo entero que será asignado a la edad
     * de la mujer.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    
    /**
     * Constructor para Mujer Casada.<br>
     * El estado civil se asigna automáticamente como "Casada" a través del 
     * método casarseCon(Hombre).
     * @param p_nombre Cadena de texto correspondiente al nombre
     * @param p_apellido Cadena de texto correspondiente al apellido
     * @param p_edad Valor de tipo entero para la edad de la mujer
     * @param p_esposo Objeto de tipo Hombre que va a ser vinculado
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.casarseCon(p_esposo);
    }
    //Mutadores
    /**
     * Mutador privado para asignar el nombre de la mujer
     * @param p_nombre cadena de texto correspondiente al nombre
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    
    //Observadores
    /**
     * Observador que obtiene el nombre de la mujer
     * @return la cadena de texto que corresponde al nombre.
     */
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    public Hombre getEsposo(){
        return this.esposo;
    }
    
    //Otros Métodos
    /**
     * Método público para formalizar el matrimonio
     * @param p_esposo corresponde al objeto de tipo Hombre que va a ser
     * asociado
     */
    public void casarseCon(Hombre p_esposo){
        if(this.getEsposo() == null){
            this.setEstadoCivil("Casada");
            this.setEsposo(p_esposo);
            p_esposo.casarseCon(this);
        } else {
            System.out.println("¡Casada!");
        }  
    }
    
    /**
     * Método público para llevar a cabo el divorcio. Se procede a setear el 
     * estado civil en "Divorciada" y se quita el objeto de tipo Hombre asociado.
     * Cuando no tiene un esposo, imprime un aviso.
     */
    public void divorcio(){
        if(this.getEsposo() != null){
            Hombre aux = this.getEsposo();
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
            aux.divorcio();
            
        } else {
            System.out.println("Estado Civil Actualizado De La Mujer: " + this.getEstadoCivil());
        }
        
    }

    /**
     * Método que obtiene datos básicos de la mujer
     * @return El nombre, apellido y la edad de la mujer como cadena 
     * de texto.
     */
    public String datos(){
        return this.getNombre() + " " + this.getApellido() +
            " de " + this.getEdad() + " años";
    }
    /**
     * Método que imprime por pantalla el nombre, apellido y estado civil
     * de la mujer.
     */
    public void mostrarEstadoCivil(){
        System.out.println("\t" + this.getNombre() + " " + this.getApellido() +
            " - " + this.getEstadoCivil());
    }
    
    /**
     * Método que imprime en pantalla datos básicos de la mujer y, si corresponde,
     * también los del hombre con el que contrajo matrimonio.
     */
    public void casadaCon(){
        if(this.getEsposo() != null){
            System.out.println(this.datos() + " está casada con " 
                + this.getEsposo().datos());
        } else {
            System.out.println(this.datos() + " no está casada");
        }
        
    }
    
    
    
}