
/**
 * Clase ejecutable para pruebas de CuentaBancaria y Persona
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.Scanner;
public class PruebaCuentaBancaria
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        //Creación de una instancia Persona, que hará de titular de la cuenta bancaria
        System.out.println("\t---Agregar titular(Persona)---");
        System.out.print("Ingrese el nro de DNI: ");
        int nroDni1 = teclado.nextInt();
        System.out.print("Ingrese el/los nombres del titular: ");
        String nombre1 = teclado.next();
        System.out.print("Ingrese el/los apellido/s del titular: ");
        String apellido1 = teclado.next();
        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento1 = teclado.nextInt();
        Persona persona1 = new Persona(nroDni1, nombre1, apellido1, anioNacimiento1);
        System.out.println("\tTitular agregado....\n");
        
        System.out.println("\n\t---Creando cuenta bancaria---");
        
        int eleccionCuenta = 0;
        System.out.print("Desea agregar una cuenta con saldo inicial?(1-si ,otro num-saldo en $0.0): ");
        eleccionCuenta = teclado.nextInt();
        System.out.println();
        
        if(eleccionCuenta == 1) {
            System.out.print("Ingrese el nro de cuenta: ");
            int nroDeCuenta1 = teclado.nextInt();
            System.out.print("Ingrese el saldo inicial: $");
            double saldoInicial1 = teclado.nextDouble();
            CuentaBancaria cuentaBancaria = new CuentaBancaria(nroDeCuenta1, persona1, saldoInicial1);
            System.out.println("\n\t---Cuenta con saldo inicial en $" + cuentaBancaria.getSaldo() + " creada---");
            System.out.println("Depositando $600. Nuevo monto en cuenta: $" + cuentaBancaria.depositar(600));
            System.out.println("Extrayendo $325. Nuevo monto en cuenta: $" + cuentaBancaria.extraer(325));
            cuentaBancaria.mostrar();
            System.out.println("Probando método toString(): " + cuentaBancaria.toString()); 

        }else{
            System.out.print("Ingrese el nro de cuenta: ");
            int nroDeCuenta1 = teclado.nextInt();
            CuentaBancaria cuentaBancaria = new CuentaBancaria(nroDeCuenta1, persona1);
            System.out.println("\n\t---Cuenta sin saldo inicial creada---");
            System.out.println("Depositando $600. Nuevo monto en cuenta: $" + cuentaBancaria.depositar(600));
            System.out.println("Extrayendo $325. Nuevo monto en cuenta: $" + cuentaBancaria.extraer(325));
            cuentaBancaria.mostrar();
            System.out.println("Probando método toString(): " + cuentaBancaria.toString()); 
        }
        
        teclado.close(); 
    }  
}