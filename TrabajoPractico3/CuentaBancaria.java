/**
 * Ejercicio 5 : Implementación de CuentaBancaria
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

public class CuentaBancaria
{
    //Atributos
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Constructor para una cuenta con saldo en $0.00
     * @param p_nroCuenta entero que representa el nro de cuenta del titular
     * @param p_titular objeto de tipo Persona que será asociado a la cuenta bancaria
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    /**
     * Constructor para una cuenta con saldo. 
     * @param p_nroCuenta entero que representa el nro de cuenta del titular
     * @param p_titular objeto de tipo Persona que será asociado a la cuenta bancaria
     * @param p_saldo saldo inicial asignado a la cuenta bancaria
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    //Mutadores
    /**
     * mutador privado para asignar/modificar el nro de cuenta
     * @param p_nroCuenta nro de cuenta del titular
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    //Observadores
    /**
     * Observador público para obtener el nro de cuenta
     * @return el nro de cuenta como valor de tipo entero
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
    /**
     * Permite hacer depósitos en la cuenta del titular
     * @param p_importe monto a depositar
     * @return el nuevo balance de la cuenta
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    /**
     * Permite hacer extracciones de dinero de la cuenta
     * @param p_importe dinero a extraer 
     * @return el nuevo balance de la cuenta
     */
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
    /**
     * Muestra detalles básicos de la cuenta bancaria : datos del titular(nombre,apellido,edad) y el 
     * saldo de la cuenta.
     */
    public void mostrar(){
        System.out.println("\t- Cuenta Bancaria -");
        System.out.println("\tTitular: " + this.getTitular().nomYApe() + " (" + this.getTitular().edad() + " años)");
        System.out.println("\tSaldo: " + this.getSaldo());
    }
    /**
     * Obtiene una cadena de texto con datos básicos del titular y la cuenta
     * @return el nro de cuenta, apellido y nombre del titular y el saldo en cuenta.
     */
    public String toString(){
        return "\t" + this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo();
    }
}