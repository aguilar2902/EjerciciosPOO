/**
 * Write a description of class CuentaCorriente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaCorriente
{
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    //constructores
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setLimiteDescubierto(500.00);
        this.setTitular(p_titular);
    }
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500.00);
        this.setTitular(p_titular);
    }
    
    //setters
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
    //getters
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
    
    //otros metodos
    
    private boolean puedeExtraer(double p_importe){
        if(p_importe < (this.getSaldo() + this.getLimiteDescubierto())){
            return true;
        }else{
            return false;
        }
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        }
    }
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    public void mostrar(){
        System.out.println("\t- Cuenta Corriente -");
        System.out.println("\tNro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("\tTitular: " + this.getTitular().nomYApe());
        System.out.println("\tDescubierto: " + this.getLimiteDescubierto());
    }
}