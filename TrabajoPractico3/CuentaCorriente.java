/**
 * Ejercicio 7
 * Implementación de la clase CuentaCorriente
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class CuentaCorriente
{
    //Atributos
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    //Constructores
    /**
     * Constructor para una CuentaCorriente sin saldo
     * @param p_nroCuenta nro de cuenta
     * @param p_titular objeto de tipo Persona a asociar a la cuenta
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setLimiteDescubierto(500.00);
        this.setTitular(p_titular);
    }
    /**
     * Constructor para CuentaCorriente con saldo inicial
     * @param p_nroCuenta nro de cuenta
     * @param p_titular objeto de tipo Persona a asociar a la cuenta
     * @param p_saldo saldo inicial a cargar en la cuenta
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500.00);
        this.setTitular(p_titular);
    }
    
    //Mutadores
    /**
     * Setea el nro de cuenta del titular
     * @param p_nroCuenta nro de cuenta de tipo entero
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    //Observadores
    /**
     * Observador para obtener el nro de cuenta
     * @return el nro de cuenta del titular
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    public Persona getTitular(){
        return this.titular;
    }
    
    //Otros métodos
    /**
     * Método privado que informa si el titular cumple las condiciones
     * para hacer una extracción
     * @param p_importe importe que el titular quiere extraer
     * @return un booleano que define si se puede realizar o no la extracción
     */
    private boolean puedeExtraer(double p_importe){
        if(p_importe < (this.getSaldo() + this.getLimiteDescubierto())){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Método privado que efectiviza la extracción de dinero
     * @param p_importe dinero que se desea extraer
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    /**
     * Método público que inicia la extracción e informa ante algún percance
     * @param p_importe monto a extraer
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else{
            System.out.println("\n\tEl importe de extraccion sobrepasa el límite de descubierto!");
        }
    }
    /**
     * Carga dinero al saldo de la cuenta del titular
     * @param p_importe monto a depositar en cuenta
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    /**
     * Muestra por pantalla los datos de la cuenta corriente 
     * (titular,nro cuenta,saldo, saldo descubierto)
     */
    public void mostrar(){
        System.out.println("\t- Cuenta Corriente -");
        System.out.println("\tNro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("\tTitular: " + this.getTitular().nomYApe());
        System.out.println("\tDescubierto: " + this.getLimiteDescubierto());
    }
}