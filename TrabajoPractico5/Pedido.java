/**
 * Creacion de la Clase Pedido
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.00
 */

import java.util.*;

public class Pedido
{
    private ArrayList<Renglon> renglones;
    
    /**
     * Constructor de Pedido (unico renglon)
     * 
     * @param p_renglon objeto de tipo Renglon
     */
    public Pedido(Renglon p_renglon){
        this.setRenglones(new ArrayList<Renglon>());
        this.agregarRenglon(p_renglon);
    }
    
    /**
     * Constructor de Pedido (multiples renglones)
     * 
     * @param p_renglones ArrayList de renglones
     * @throws IllegalArgumentException cuando la lista se envía vacía
     */
    public Pedido(ArrayList<Renglon> p_renglones){
        if(p_renglones.isEmpty()){
            throw new IllegalArgumentException("Debe tener elementos cargados");
        }
        this.setRenglones(new ArrayList<Renglon>(p_renglones));
    }
    
    /**
     * Mutador privado de renglones
     * 
     * @param p_renglones ArrayList de renglones
     */
    private void setRenglones(ArrayList<Renglon> p_renglones){
        this.renglones = p_renglones;
    }
    
    /**
     * Observador de renglones
     * 
     * @return ArrayList de renglones
     */
    public ArrayList<Renglon> getRenglones(){
        return this.renglones;
    }
    
    /**
     * Metodo para agregar un nuevo renglon
     * 
     * @param p_renglon renglon a agregar a la lista
     * @return true si la adicion fue exitosa; de lo contrario Falso
     */
    public boolean agregarRenglon(Renglon p_renglon){
        return this.getRenglones().add(p_renglon);
    }
    
    /**
     * Metodo para eliminar un renglon
     * 
     * @param p_renglon renglon que se quiere eliminar
     * @return true si es posible la eliminacion (siempre debe quedar 1)
     */
    public boolean quitarRenglon(Renglon p_renglon){
        if(this.getRenglones().size() > 1){
            return this.getRenglones().remove(p_renglon);
        }
        return false;
    }
    
    /**
     * Metodo para mostrar el detalle del pedido por pantalla
     */
    public void mostrar(){
        int contItem = 1, contPed = 0;
        double acum = 0.0;
        
        System.out.println("\tPedido:");
        System.out.println("\tCantidad de items:" + this.getRenglones().size() + "\n");
        
        for(Renglon a: this.getRenglones()){
            System.out.print("\tItem " + contItem + ": ");
            a.mostrar();
            System.out.println("\tPrecio:$" + a.getImporte());
            contItem++;
            contPed += a.getCantidad();
            acum += a.getImporte();
        }
        
        System.out.println("\n\t---Total Pedido:" + contPed + " Etiquetas por un importe total de: $ " + acum);
    }
    
}
