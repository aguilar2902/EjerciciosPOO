/**
 * Ejercicio 10: Clase Hombre
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

public class Hombre
{
    /**
     * Atributos de la clase Hombre
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    //Constructores
    /**
     * Constructor para Hombre Soltero.<br>
     * El estado civil se asigna como "Soltero" y el atributo esposa en null.
     * @param p_nombre Cadena de texto correspondiente al nombre
     * @param p_apellido Cadena de texto correspondiente al apellido
     * @param p_edad Valor de tipo entero que será asignado como la edad del hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }
    
    /**
     * Constructor para Hombre Casado.<br>
     * El estado civil se asigna automáticamente como "Casado" a través del 
     * método casarseCon(Mujer).
     * @param p_nombre Cadena de texto correspondiente al nombre
     * @param p_apellido Cadena de texto correspondiente al apellido
     * @param p_edad Valor de tipo entero para la edad del hombre
     * @param p_esposo Objeto de tipo Mujer que va a ser vinculado
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.casarseCon(p_esposa);
    }
    //Mutadores
    /**
     * Mutador privado para agregar/modificar el nombre.
     * @param p_nombre cadena de texto que corresponde al nombre.
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
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
    }
    
    //Observadores
    /**
     * Observador para obtener el nombre.
     * @return el nombre asociado al hombre.
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
    public Mujer getEsposa(){
        return this.esposa;
    }
    
    //Otros Métodos
    /**
     * Método público para formalizar el matrimonio
     * @param p_esposa corresponde al objeto de tipo Mujer que va a ser
     * asociado
     */
    public void casarseCon(Mujer p_esposa){
        if(this.getEsposa() == null){
            this.setEstadoCivil("Casado");
            this.setEsposa(p_esposa);
            p_esposa.casarseCon(this);
        } else {
            System.out.println("\t¡Casado!");
        }  
    }
    
    /**
     * Método público para llevar a cabo el divorcio. Se procede a setear el 
     * estado civil en "Divorciado" y se quita el objeto de tipo Mujer asociado.
     * Cuando no posee esposa, imprime un aviso.
     */
    public void divorcio(){
        if(this.getEsposa() != null){
            Mujer aux = this.getEsposa();
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
            aux.divorcio();
        } else {
            System.out.println("Estado Civil Del Hombre: " + this.getEstadoCivil());
        }
        
    }
    
    /**
     * Método que obtiene datos básicos del hombre
     * @return El nombre, apellido y la edad del hombre como cadena 
     * de texto.
     */
    public String datos(){
        return this.getNombre() + " " + this.getApellido() +
            " de " + this.getEdad() + " años";
    }
    
    /**
     * Método que imprime por pantalla el nombre, apellido y estado civil
     * del hombre.
     */
    public void mostrarEstadoCivil(){
        System.out.println("\t" + this.getNombre() + " " + this.getApellido() +
            " - " + this.getEstadoCivil());
    }
    
    /**
     * Método que imprime en pantalla datos básicos del hombre y, si corresponde,
     * también los de la mujer con la que contrajo matrimonio.
     */
    public void casadoCon(){
        if(this.getEsposa() != null){
            System.out.println(this.datos() + " está casado con " 
                + this.getEsposa().datos());
        } else {
            System.out.println(this.datos() + " no está casado");
        }
        
    }
    
    
    
}