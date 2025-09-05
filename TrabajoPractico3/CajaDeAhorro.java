/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CajaDeAhorro
{
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    //constructores
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }
    
    //Setters
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
    
    //metodos
    private boolean puedeExtraer(double p_importe){
        if(this.getSaldo() > p_importe && this.getExtraccionesPosibles() > 0){
            return true;
        }else{
            return false;
        }
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else if(this.getExtraccionesPosibles() == 0){
            System.out.println("No tiene habilitadas mas extracciones!");
        }else{
            System.out.println("No puede extraer mas que el saldo!");
        }
    }
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    public void mostrar(){
        System.out.println("\tCaja de Ahorro -");
        System.out.println("\t\tNro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("\t\tTitular: " + this.getTitular().nomYApe());
        System.out.println("\t\tExtracciones posibles: " + this.getExtraccionesPosibles());
    }
}