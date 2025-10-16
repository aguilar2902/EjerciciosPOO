/**
 * Ejercicio 6 - TP5
 * Implementación de la clase CuentaCorriente
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class CuentaCorriente extends CuentaBancaria
{
    //Atributos
    private double limiteDescubierto;
    
    //Constructores
    /**
     * Constructor para una CuentaCorriente sin saldo
     * @param p_nroCuenta nro de cuenta
     * @param p_titular objeto de tipo Persona a asociar a la cuenta
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500.00);
    }
    /**
     * Constructor para CuentaCorriente con saldo inicial
     * @param p_nroCuenta nro de cuenta
     * @param p_titular objeto de tipo Persona a asociar a la cuenta
     * @param p_saldo saldo inicial a cargar en la cuenta
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500.00);
        
    }
    
    //Mutadores
    
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    
    //Observadores

    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    //Otros métodos
    /**
     * Método privado que informa si el titular cumple las condiciones
     * para hacer una extracción
     * @param p_importe importe que el titular quiere extraer
     * @return un booleano que define si se cumplen las condiciones
     */
    private boolean puedeExtraer(double p_importe){
        if(p_importe <= (this.getSaldo() + this.getLimiteDescubierto())){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método público que que confirma la extracción
     * @param p_importe monto a extraer
     * @return si se llevó a cabo exitosamente (booleano)
     */
    public boolean extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            return super.extraer(p_importe);
        }else{
            System.out.println(this.xQNoPuedoExtraer(p_importe));
            return false;
        }
    }
    
    public String xQNoPuedoExtraer(double p_importe){
        if(!puedeExtraer(p_importe)){
            return "\nEl importe que desea extraer supera el Limite Descubierto";
        }
        return "\nPuede realizar extracciones";
    }
    /**
     * Muestra por pantalla los datos de la cuenta corriente 
     * (titular,nro cuenta,saldo, saldo descubierto)
     */
    public void mostrar(){
        System.out.println("\t- Cuenta Corriente -");
        super.mostrar();
        System.out.println("\tDescubierto: " + this.getLimiteDescubierto());
    }
}
