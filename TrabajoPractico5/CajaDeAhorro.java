
/**
 * Ejercicio 6 - TP5
 * Implementación de la clase CajaDeAhorro
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class CajaDeAhorro extends CuentaBancaria
{
    //Atributos
    private int extraccionesPosibles;
    
    //Constructores
    /**
     * Constructor para Caja De Ahorro sin saldo ($0.0)
     * Posee un límite de 10 extracciones
     * @param p_nroCuenta número de cuenta del titular
     * @param p_titular objeto de tipo Persona que será el titular 
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
    }
    /**
     * Constructor para instancias de CajaDeAhorro con saldo.
     * Posee un límite de 10 extracciones.
     * @param p_nroCuenta número de cuenta del titular
     * @param p_titular objeto de tipo Persona que será el titular
     * @param p_saldo el saldo inicial de la cuenta
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    //Setters
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }
    //Getters
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    //Otros métodos
    /**
     * Obtiene un booleano que representa la posibilidad de extraer o no
     * dinero.<br>
     * (Depende de poseer el saldo suficiente y extracciones posibles disponibles).
     * @param p_importe el monto que se desea extraer
     * @return un booleano confirmando si es posible o no la extracción.
     */
    private boolean puedeExtraer(double p_importe){
        if(this.getSaldo() > p_importe && this.getExtraccionesPosibles() > 0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Método privado que realiza la extracción propiamente dicha.
     * @param p_importe monto de dinero a extraer.
     */
    
    /**
     * Método público que evalua la posibilidad de hacer una extracción.<br>
     * Si la extracción no se puede llevar a cabo, informa la razón.
     * @param p_importe monto que se desea extraer
     */
    public boolean extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
            return super.extraer(p_importe);
        } else {
            System.out.println(this.xQNoPuedoExtraer(p_importe));
            return false;
        }
        
    }
    
    public String xQNoPuedoExtraer(double p_importe){
        if(p_importe > this.getSaldo()){
            return "\nSaldo insuficiente!";
        } else if (this.getExtraccionesPosibles() == 0){
            return "\nNo tiene habilitadas más extracciones!";
        } else {
           return "\nNo hay impedimentos para la extracción"; 
        }
    }
    
    /**
     * Muestra por pantalla información de la caja de ahorro (nro cuenta, titular,
     * saldo y extracciones posibles)
     */
    public void mostrar(){
        System.out.println("\t- Caja de Ahorro -");
        super.mostrar();
        System.out.println("\tExtracciones posibles: " + this.getExtraccionesPosibles());
    }
}
