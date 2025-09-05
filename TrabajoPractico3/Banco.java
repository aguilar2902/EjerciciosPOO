/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    Persona cliente = new Persona(38886793, "Juan", "Perez", 1994);
    CajaDeAhorro caja1 = new CajaDeAhorro(2135, cliente);
    CuentaCorriente ctaCte = new CuentaCorriente(1735, cliente);
    
    //aca seguir con las pruebas                                                           
    
}