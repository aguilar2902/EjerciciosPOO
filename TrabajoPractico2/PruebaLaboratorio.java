
/**
 * Prueba de instancias de la clase Laboratorio
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class PruebaLaboratorio
{
  public static void main(String[] args){
    Laboratorio lab1 = new Laboratorio("Colgate S.A.", "Junín 5204", "54-11-4239-8447", 3, 3);
    System.out.println("\t-----Pruebas lab1-----");
    System.out.println("Prueba métodos getDomicilio(), getCompraMinima(),getDiaEntrega(): " +
      lab1.getDomicilio() + ", " + lab1.getCompraMinima() + ", " + lab1.getDiaEntrega());
    System.out.println("--Seteo de compra mínima(lab.1nuevaCompraMinima(6) y lab1.nuevoDiaEntrega(11))....");
    lab1.nuevaCompraMinima(6);
    lab1.nuevoDiaEntrega(11);
    System.out.println("Ejecución de getCompraMinima() y getDiaEntrega con nuevos valores: " +
        lab1.getCompraMinima() + ", " + lab1.getDiaEntrega()); 
    System.out.println(lab1.mostrar());
   
    System.out.println("\t-----Pruebas lab2-----");
    Laboratorio lab2 = new Laboratorio("Andesfarma S.A.", "Colón 1256", "54-11-3334-4444");
    System.out.println("Compra mínima predeterminada lab2 (sin asignar): " + lab2.getCompraMinima());
    System.out.println("--Seteo de compra mínima para lab2 en 52....");
    lab2.nuevaCompraMinima(52);
    System.out.println("Compra mínima en lab2 tras aplicar lab2.nuevaCompraMinima(52): " + lab2.getCompraMinima());
      
      
    System.out.println("\t-----Pruebas lab3-----");
    Laboratorio lab3 = new Laboratorio("Farmar S.A.", "Junín 604", "54-11-4339-8140");
    System.out.println("Dia de entrega predeterminado lab3 (sin asignar): " + lab3.getDiaEntrega());
    System.out.println("--Seteo de dia de entrega en 15 para lab3....");
    lab3.nuevoDiaEntrega(15);
    System.out.println("Dia de entrega para lab3 tras aplicar lab3.nuevoDiaEntrega(15): " + lab3.getDiaEntrega());      
  }
}
