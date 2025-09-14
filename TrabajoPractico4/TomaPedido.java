
/**
 * Ejercicio 2: Implementacion de la clase ejecutable TomaPedido
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00 
 */

import java.util.*;
import java.text.*;

public class TomaPedido
{
    public static void main(String [] args){
        //creo un cliente cualquiera
        Cliente cliente1 = new Cliente(123456, "Jorge", "Chamorro", 150000.00);
        
        //creo un laboratorio cualquiera
        Laboratorio lab = new Laboratorio("Corrientes tech", "cualquiera 1775", "2284304032");
        //Creo 5 productos de prueba
        Producto prod1 = new Producto(1, "Tecnologia", "Notebook", 800000.00, lab);
        Producto prod2 = new Producto(1, "Tecnologia", "Mouse gamer", 15000.00, lab);
        Producto prod3 = new Producto(1, "Tecnologia", "Teclado", 35000.00, lab);
        Producto prod4 = new Producto(1, "Tecnologia", "Pendrive", 10857.00, lab);
        Producto prod5 = new Producto(1, "Tecnologia", "Libro-POO", 10450.00, lab);
        
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(prod1);
        listaProductos.add(prod2);
        listaProductos.add(prod3);
        listaProductos.add(prod4);
        listaProductos.add(prod5);
        
        Pedido pedido1 = new Pedido(Calendar.getInstance(), cliente1, listaProductos);
        
        pedido1.mostrarPedido();
    }
    
}