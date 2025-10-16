/**
 * Implementación de CuentaBancaria
 * 
 * @author Bengochea Marcelo
 * @author Aguilar Jonathan
 * @version 1.00
 */
public abstract class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.00);
    }
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    //Mutadores
    /**
     * @param p_nroCuenta asigna un número de cuenta
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    //Observadores
     /**
     * @return el nro de la cuenta bancaria
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public Persona getTitular(){
        return this.titular;
    }
    
    //Otros métodos

    public boolean extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return true;
    }
        
    public abstract String xQNoPuedoExtraer(double p_importe);
    
    /**
     * Permite la carga de dinero al saldo de la cuenta
     * @param p_importe monto de dinero a depositar
     * @return el nuevo saldo de la cuenta
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    /**
     * Muestra por pantalla información de la caja de ahorro (nro cuenta, titular y saldo )
     */
    public void mostrar(){
        System.out.println("\tNro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("\tTitular: " + this.getTitular().nomYApe());    
    }
}
