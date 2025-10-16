
/**
 * Creacion de la clase ejecutable ArmadoPedido
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.00 18-10-25
 */
import java.util.*;

public class ArmadoPedido
{
    public static void main(String[] args){
        Etiqueta eti1 = new Comun(100.0);
        Etiqueta eti2 = new Premium(200.0, 10);
        Etiqueta eti3 = new Premium(200.0, 7);
        
        Renglon renglon1 = new Renglon(57, eti1);
        Renglon renglon2 = new Renglon(7, eti2);
        Renglon renglon3 = new Renglon(94, eti3);
        //renglon1.mostrar();
        //renglon2.mostrar();
        ArrayList<Renglon> lista = new ArrayList<Renglon>();
        lista.add(renglon1);
        lista.add(renglon2);
        
        Pedido pedido1 = new Pedido(lista);
        pedido1.mostrar();
        
        System.out.println("\n\t----- Agrego nuevo renglon y muestro -----");
        pedido1.agregarRenglon(renglon3);
        pedido1.mostrar();
    }
}
