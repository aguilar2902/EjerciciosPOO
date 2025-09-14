
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
    private ArrayList<Producto> productos;
    
    /**
   * Método Constructor de la clase Pedido (Muchos productos)
   * @param p_fecha fecha del pedido
   * @param p_cliente datos del Cliente
   * @param p_productos Lista de productos
   */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
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
        
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(p_producto);
        this.setProductos(lista);
    }
    
    //mutadores
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
    
    private void setProductos(ArrayList<Producto> p_producto){
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
    
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    
    //otros metodos
    /**
     * 
     */
    public double totalAlContado(){
        
        double acumulador = 0.0;
        
        for(Producto prod: productos){
            acumulador += prod.precioContado();
        }
        
        return acumulador;
    }
    
    /**
     * 
     */
    public double totalFinanciado(){
        double acumulador = 0.0;
        
        for(Producto prod: productos){
            acumulador += prod.precioLista();
        }
        
        return acumulador;
    }
    
    /**
     * 
     * 
     */
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    /**
     * 
     */
    public boolean quitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);
    }
    
    /**
     * 
     */
    public void mostrarPedido(){
        DateFormat formato = DateFormat.getDateInstance(DateFormat.LONG);

        System.out.println("\n\t****** Detalle del pedido ****** Fecha: " + formato.format(this.getFecha().getTime()));
        System.out.println("\tProducto    Precio Lista    Precio Contado");
        System.out.println("\t------------------------------------------");
        for (Producto prod : productos){
            System.out.println("\t" + prod.getDescripcion() + "     " + prod.precioLista() + "     " + prod.precioContado());
        }
        System.out.println("\t------------------------------------------");
        System.out.println("\t*** Total--- " + this.totalFinanciado() + "    " + this.totalAlContado());
    }
}