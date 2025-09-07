/**
 * Ejercicio 7
 * Implementación de la clase CajaDeAhorro
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class CajaDeAhorro
{
    //Atributos
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    //Constructores
    /**
     * Constructor para Caja De Ahorro sin saldo ($0.0)
     * Posee un límite de 10 extracciones
     * @param p_nroCuenta número de cuenta del titular
     * @param p_titular objeto de tipo Persona que será el titular 
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
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
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    //Setters
    /**
     * @param p_nroCuenta asigna un número de cuenta a la caja de ahorro.
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    //Getters
    /**
     * @return el nro de cuenta de la caja de ahorro
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    public Persona getTitular(){
        return this.titular;
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
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    /**
     * Método público que evalua la posibilidad de hacer una extracción.<br>
     * Si la extracción no se puede llevar a cabo, informa la razón.
     * @param p_importe monto que se desea extraer
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else if(this.getExtraccionesPosibles() == 0){
            System.out.println("\nNo tiene habilitadas más extracciones!");
        }else{
            System.out.println("\nNo puede extraer más que el saldo!");
        }
    }
    /**
     * Permite la carga de dinero al saldo de la cuenta
     * @param p_importe monto de dinero a depositar
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    /**
     * Muestra por pantalla información de la caja de ahorro (nro cuenta, titular,
     * saldo y extracciones posibles)
     */
    public void mostrar(){
        System.out.println("\t- Caja de Ahorro -");
        System.out.println("\tNro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("\tTitular: " + this.getTitular().nomYApe());
        System.out.println("\tExtracciones posibles: " + this.getExtraccionesPosibles());
    }
}