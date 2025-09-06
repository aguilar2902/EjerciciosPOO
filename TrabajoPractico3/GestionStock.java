/**
 * Clase ejecutable para probar las clases Laboratorio y Producto
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class GestionStock
{
    public static void main(String[] args){
        //Se agregan 2 laboratorios
        Laboratorio lab1 = new Laboratorio("Colgate S.A.", "Junín 5204", "54-11-4239-8447", 3, 3);
        Laboratorio lab2 = new Laboratorio("Roemmers SAICF", "Mariano Moreno 1075", "0379-446-3777");
        
        System.out.println("\t----Pruebas de productos----");
        //Producto con existencia mínima
        Producto producto1 = new Producto(1234, "Perfumeria", "Jabón Dove", 1690.50, 21.0, 32, lab1 );
        System.out.println("\tProducto " + producto1.getDescripcion() + " con existencia minima: " +
            producto1.getExistMinima() + " y porc. pto. reposición: " + producto1.getPorcPtoRepo());
        //Producto sin existencia minima ni porcentaje punto de reposicion
        Producto producto2 = new Producto(5678, "Medicamentos", "Ibuprofeno 600mg", 400.76, lab2);
        System.out.println("\tProducto " + producto2.getDescripcion() + " sin existencia min (" +
            producto2.getExistMinima() + ")" + " ni porcentaje pto reposic (" + producto2.getPorcPtoRepo() +
            ")");
            
        producto2.ajustarPtoRepo(25.5);
        producto2.ajustarExistMin(60);
        System.out.println("\tAñadida exist. mínima al producto " + producto2.getDescripcion() + ": " +
            producto2.getExistMinima() + " y porc. pto. reposición: " + producto2.getPorcPtoRepo()); 
            
        producto1.mostrar();
        producto1.ajuste(500);
        producto1.mostrar();
        producto1.ajuste(-200);
        producto1.mostrar();
        producto1.mostrarLinea();
        
        producto2.mostrar();
        producto2.ajuste(250);
        producto2.mostrar();
        System.out.println("\tSe procede a quitar de stock 300 unidades(más de la que se poseen)");
        producto2.ajuste(-300);
        producto2.mostrar();
        producto2.mostrarLinea();
    }
   
}
