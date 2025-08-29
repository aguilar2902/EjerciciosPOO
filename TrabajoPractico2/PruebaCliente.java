
/**
 * Pruebas de varias instancias de la clase Cliente
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class PruebaCliente
{
  public static void main(String[] args){
      
    //"33243244", "Aguirre", "Juan", "302.6","54445433","Gómez","Raquel","877.65"
    Cliente cliente1 = new Cliente(Integer.parseInt(args[0]), args[1],
    args[2], Double.parseDouble(args[3]));
    Cliente cliente2 = new Cliente(Integer.parseInt(args[4]), args[5],
    args[6], Double.parseDouble(args[7]));
    //Se muestra el 1er objeto con los datos antes de modificar y luego de hacerlo
    
    System.out.println("\n\t---Cliente 1---");
    cliente1.mostrar();      
    System.out.println("Agregando $453.3 de saldo...");
    cliente1.agregaSaldo(453.3);
    cliente1.mostrar();
    
    System.out.println("\n\t---Cliente 2---");
    cliente2.mostrar();
    System.out.println("Seteando un nuevo saldo equivalente a $300.0 ...");
    cliente2.nuevoSaldo(300.0);
    System.out.println("Obteniendo el saldo con getSaldo(): " + cliente2.getSaldo());
  }
}
