/**
 * Ejercicio 2: Implementacion de la clase Pedido
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;
import java.text.*;

public class Pedido
{
   private Calendar fecha;
   private Cliente cliente;
   private ArrayList productos;
    
   /**
    * Método Constructor de la clase Pedido (Muchos productos)
    * @param p_fecha fecha del pedido
    * @param p_cliente datos del Cliente
    * @param p_productos Lista de productos
    */
   public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
       this.setFecha(p_fecha);
       this.setCliente(p_cliente);
       this.setProductos(p_productos);
   }
    
   /**
    * Método Constructor de la clase Pedido (unico producto)
    * @param p_fecha fecha del pedido
    * @param p_cliente datos del Cliente
    * @param p_productos datos del producto
    */
   public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
       this.setFecha(p_fecha);
       this.setCliente(p_cliente);
       ArrayList lista = new ArrayList();
       lista.add(p_producto);
       this.setProductos(lista);
    }
    
   //Mutadores
   /**
    * Mutador privado para la fecha de pedido
    * @param p_fecha fecha del pedido
    */
   private void setFecha(Calendar p_fecha){
       this.fecha = p_fecha;
   }
    
   private void setCliente(Cliente p_cliente){
       this.cliente = p_cliente;
   }
    
   private void setProductos(ArrayList p_producto){
       this.productos = p_producto;
   }
    
   //observadores
   /**
    * Observador para la fecha del pedido
    * @return fecha del pedido 
    */
   public Calendar getFecha(){
       return this.fecha;
   }
    
   public Cliente getCliente(){
       return this.cliente;
   }
    
   public ArrayList getProductos(){
       return this.productos;
   }
    
    
   //otros metodos
   /**
    * Método que suma todos los precios de los productos pagando al contado (descuento 5%)
    * 
    * @return la sumatoria de los precios al contado
    */
   public double totalAlContado(){
       double acumulador = 0.0; 
       for(Object elemento : this.getProductos()){
           Producto prod = (Producto)elemento;
           acumulador += prod.precioContado();
       }  
       return acumulador;
    }
    
   /**
    * Método que suma todos los precio de lista de los productos (con recargo del 12%)
    * 
    * @return la sumatoria de los precios de lista
    */
   public double totalFinanciado(){
       double acumulador = 0.0;
       
       for(Object elemento : this.getProductos()){ 
           //Implementación de un condicional para que solo acumule si es instancia de Producto
           if(elemento instanceof Producto){
               Producto prod = (Producto)elemento;
               acumulador += prod.precioLista();
           }
       }
        
       return acumulador;
   }
    
   /**
    * Método para agregar un producto a una colección
    * @param p_producto el producto que se desea agregar
    * 
    * @return Verdadero si se añade correctamente; De lo contrario, falso.
    */
   public boolean agregarProducto(Producto p_producto){
       return this.getProductos().add(p_producto);
   }
    
   /**
    * Método para elimitar un producto de una colección
    * @param p_producto el producto que se desea eliminar
    * 
    * @return Verdadero si se elimina; De lo contrario, falso.
    */
   public boolean quitarProducto(Producto p_producto){
       return this.getProductos().remove(p_producto);
   }
    
   /**
    * Método que muestra el lista de productos en formato de ticket
    * 
    */
   public void mostrarPedido(){
       DateFormat formato = DateFormat.getDateInstance(DateFormat.LONG);

       System.out.println("\n\t****** Detalle del pedido ****** Fecha: " + formato.format(this.getFecha().getTime()));
       System.out.println("\t Producto\tPrecio Lista\tPrecio Contado");
       System.out.println("\t------------------------------------------");
       for (Object elemento : this.getProductos()){
           Producto prod = (Producto)elemento;
           System.out.printf("\t %-14s \t%6.2f \t%6.2f%n", prod.getDescripcion(), prod.precioLista(), prod.precioContado());
       }
       System.out.println("\t------------------------------------------");
       System.out.println("\t*** Total---\t" + this.totalFinanciado() + "\t" + this.totalAlContado());
   }
}