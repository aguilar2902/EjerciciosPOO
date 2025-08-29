
public class GestionStock
{
    public static void main(String[] args){
        Laboratorio lab1 = new Laboratorio("Colgate S.A.", "Junín 5204", "54-11-4239-8447", 3, 3);
        Producto producto1 = new Producto(1, "Perfumeria", "Jabón Deluxe", 10.50, 21.0, 5, lab1 );
        
        producto1.mostrar();
        
        producto1.ajuste(500);
        producto1.mostrar();
        producto1.ajuste(-200);
        producto1.mostrar();
        System.out.println("");
        producto1.mostrarLinea();
    }
   
}
