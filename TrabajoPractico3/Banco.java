/**
 * Clase Banco ejecutable, para las pruebas de Persona, CajaDeAhorro y 
 * CuentaCorriente
 * Nota: Para cumpleaños agregar dia y mes actual para ver la funcionalidad.
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;
public class Banco
{
    public static void main(String[] args){
        //Instancia de Scanner para ingresos por teclado
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        Calendar fechaNacPersona = Calendar.getInstance();
        
        //Creación de una instancia Persona, que hará de titular de las cuentas
        System.out.println("\t---Agregar titular(Persona)---");
        System.out.print("Ingrese el nro de DNI: ");
        int nroDni1 = teclado.nextInt();
        System.out.print("Ingrese el/los nombres del titular: ");
        String nombre1 = teclado.next();
        System.out.print("Ingrese el/los apellido/s del titular: ");
        String apellido1 = teclado.next();
        //Guardado de fecha de nacimiento
        System.out.print("Ingrese el día de nacimiento: ");
        int diaNacimiento1 = teclado.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mesNacimiento1 = teclado.nextInt();
        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento1 = teclado.nextInt();
        fechaNacPersona.set(anioNacimiento1,(mesNacimiento1 - 1), diaNacimiento1);
        Persona persona1 = new Persona(nroDni1, nombre1, apellido1, fechaNacPersona);
        System.out.println("\tTitular agregado....\n");
        
        //Creación Cuenta Corriente
        System.out.println("\t---Creando Cuenta Corriente---");
        System.out.print("Ingrese el nro de cuenta corriente a asignar: ");
        int nroCuentaCorriente = teclado.nextInt();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoCuentaCorriente = teclado.nextDouble();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(nroCuentaCorriente, persona1, saldoCuentaCorriente);
        System.out.println("Cuenta corriente con saldo inicial creada\n");

        //Creación Caja De Ahorros
        System.out.println("\n\t---Creando Caja De Ahorro---");
        System.out.print("Ingrese el nro de caja de ahorro a asignar: ");
        int nroCajaDeAhorro = teclado.nextInt();
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(nroCajaDeAhorro, persona1);
        System.out.println("Caja de ahorro creada\n");
        
        //Mostrar aviso de cumpleaños si se cumple la condición de que coincide día y mes
        if(persona1.esCumpleanios()){
            System.out.println("\n\t***¡¡¡FELIZ CUMPLEAÑOS!!!!!***");
        }
        
        //Implementación de un menú para un manejo más cómodo de las pruebas
        menu(teclado, cuentaCorriente, cajaDeAhorro);
        System.out.println("\n\t¡Programa finalizado!");
        teclado.close();
        
    } 
    public static void menu(Scanner p_scanner, CuentaCorriente p_cuentaCorriente, CajaDeAhorro p_cajaDeAhorro){
        
        int opcionElegida = 0;
        
        do {
            System.out.println("\n\t---Menu de operaciones---");
            System.out.println("\t1-Depositar en cuenta corriente");
            System.out.println("\t2-Extraer de cuenta corriente");
            System.out.println("\t3-Mostrar estado de cuenta corriente");
            System.out.println("\t4-Depositar en caja de ahorro");
            System.out.println("\t5-Extraer de caja de ahorro");
            System.out.println("\t6-Mostrar estado de caja de ahorro");
            System.out.println("\t7-Salir");
            System.out.print("\t*** Opción Elegida: ");
            opcionElegida = p_scanner.nextInt();
            System.out.println();
            
            switch(opcionElegida){
                case 1 : {
                    System.out.print("\nIngrese el monto a depositar en la cuenta corriente: $");
                    p_cuentaCorriente.depositar(p_scanner.nextDouble());
                    break; 
                }
                case 2 : {
                    System.out.print("\nDigite el monto que desea extraer de la cuenta corriente: $");
                    p_cuentaCorriente.extraer(p_scanner.nextDouble());
                    break;
                }
                case 3 : {
                    p_cuentaCorriente.mostrar();
                    break;
                }
                case 4 : {
                    System.out.print("\nIngrese el monto a depositar en la caja de ahorro: $");
                    p_cajaDeAhorro.depositar(p_scanner.nextDouble());
                    break; 
                }
                case 5 : {
                    System.out.print("\nDigite el monto que desea extraer de la caja de ahorro: $");
                    p_cajaDeAhorro.extraer(p_scanner.nextDouble());
                    break;
                }
                case 6 : {
                    p_cajaDeAhorro.mostrar();
                    break;
                }
                case 7 : {
                    System.out.println("\n\tSaliendo del menú...");
                    break;
                }
                default : {
                    System.out.println("\n\t---Opción no válida, reintente---"); 
                }
            }   
        } while (opcionElegida != 7);
    }
    
}