/**
 * Implementación de la clase ejecutable AplicacionBanco
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class AplicacionBanco
{
    public static void main(String [] args){ 
        
        Calendar fecha = Calendar.getInstance();
        
       //creo 5 empleados de prueba - 2 con años y 3 con fechas
       Empleado emp1 = new Empleado(123456789, "Ramirez", "Ruperto", 1750.0, 1992);
       Empleado emp2 = new Empleado(123456788, "Rodriguez", "Lucrecia", 2250.0, 1994);
       
       fecha.set(2005, Calendar.JULY, 21);
       Empleado emp3 = new Empleado(123456788, "Perez", "Lorena", 5000.0, fecha);
       
       fecha.set(1999, Calendar.AUGUST, 10);
       Empleado emp4 = new Empleado(123456788, "Dominguez", "Pedro", 3700.0, fecha);
       
       fecha.set(1989, Calendar.APRIL, 25);
       Empleado emp5 = new Empleado(123456788, "Casimiro", "Humberto", 8490.0, fecha);
       
       // creo 2 localidades
       Localidad loc1 = new Localidad("Goya", "Corrientes");
       Localidad loc2 = new Localidad("Mercedes", "Corrientes");
       
       // creo 4 titulares para cuentas bancarias
       Persona titular1 = new Persona(38886793, "Jeremias", "Iniesta", 1995);
       Persona titular2 = new Persona(33575793, "Josias", "Ledesma", 1946);
       Persona titular3 = new Persona(38867463, "Mayra", "Ramos", 1975);
       Persona titular4 = new Persona(31234693, "Daniela", "Quintana", 1978);
       
       //pruebas del banco1 
       System.out.println("\n\t ***** PRUEBAS DEL BANCO 1 (con un empleado) ***** \n\n");
       Banco banco1 = new Banco("Santander", loc1, 1, emp1 );
       banco1.mostrar();
       banco1.agregarEmpleado(emp2);
       banco1.agregarEmpleado(emp3);
       banco1.mostrar();
       System.out.println();
       banco1.quitarEmpleado(emp1);
       banco1.mostrar();
       System.out.println();
       banco1.listarSueldos();
       System.out.println(banco1.sueldosAPagar());
       
       //pruebas del banco 2
       
       System.out.println("\n\t ***** PRUEBAS DEL BANCO 2 (Con varios empleados) ***** \n\n");
       ArrayList<Empleado> listaEmp = new ArrayList<>();
       listaEmp.add(emp1);
       listaEmp.add(emp3);
       listaEmp.add(emp4);
       listaEmp.add(emp5);
       
       Banco banco2 = new Banco("RIO", loc2, 2, listaEmp);
       banco2.mostrar();
       banco2.agregarEmpleado(emp2);
       System.out.println();
       banco2.mostrar();
       System.out.println();
       banco2.quitarEmpleado(emp5);
       banco2.mostrar();
       
        //pruebas banco 3
        System.out.println("\n\t ******* PRUEBA EJERCICIO 4 ******* ");
        System.out.println("\n\t ***** PRUEBAS DEL BANCO 3 (Con varios empleados y varias cuentas) ***** \n\n");
        
        //cuentas bancarias (3 sin saldo y 3 con saldo)
        CuentaBancaria cta1 = new CuentaBancaria(001, titular1);
        CuentaBancaria cta2 = new CuentaBancaria(002, titular1);
        CuentaBancaria cta3 = new CuentaBancaria(003, titular3);
        CuentaBancaria cta4 = new CuentaBancaria(004, titular1, 1500);
        CuentaBancaria cta5 = new CuentaBancaria(005, titular2, 3670);
        CuentaBancaria cta6 = new CuentaBancaria(006, titular4, 15000);
        
        ArrayList<CuentaBancaria> listaCuentas = new ArrayList<>();
        listaCuentas.add(cta1);
        listaCuentas.add(cta2);
        listaCuentas.add(cta3);
        listaCuentas.add(cta4);
        
        Banco banco3 = new Banco("BBVA", loc1, 3, listaEmp ,listaCuentas);
        banco3.mostrarResumen();
        banco3.agregarCuentaBancaria(cta5);
        banco3.agregarCuentaBancaria(cta6);
        System.out.println();
        banco3.mostrarResumen();
        System.out.println();
        banco3.quitarCuentaBancaria(cta1);
        banco3.mostrarResumen();
    }

   
}