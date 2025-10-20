
/**
 * Implementación de Comercio para las pruebas
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;
public class Comercio
{
    public static void main(String[]  args){
        int cuotas = 6;
        float interes = 3.5f;
        ArtefactoHogar cocina1 = new Cocina("Volcan", 600, 15, 4, 2000, "80*60*60cm");
        ArtefactoHogar heladera1 = new Heladera("Gafa", 1200, 8, 11, 2, true);
        ArtefactoHogar lavarropa1 = new Lavarropas("Drean", 1150, 10, 8, 7, false);
        
        ArrayList<ArtefactoHogar> electrodomesticos = new ArrayList<ArtefactoHogar>();

        electrodomesticos.add(cocina1);
        electrodomesticos.add(heladera1);
        electrodomesticos.add(lavarropa1);
        for(ArtefactoHogar electrodomestico : electrodomesticos){
            electrodomestico.imprimir();
            System.out.println("\tCuotas: " + cuotas + " - Interes: " + interes + "%");
            System.out.println("\tValor Cuota: " + electrodomestico.cuotaCredito(cuotas, interes));
            System.out.println("\tValor Cuota con Adicionales: " + electrodomestico.creditoConAdicional(cuotas, interes));
            System.out.println("-------------------------------------");
        }
    }
}