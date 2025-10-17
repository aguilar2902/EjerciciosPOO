
/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercio
{
    public static void main(String[]  args){
        int cuotas = 6;
        float interes = 3.5f;
        ArtefactoHogar cocina1 = new Cocina("Volcan", 600, 15, 4, 2000, "80*60*60cm");
        ArtefactoHogar heladera1 = new Heladera("Gafa", 1200, 8, 11, 2, true);
        ArtefactoHogar lavarropa1 = new Lavarropas("Drean", 1150, 10, 8, 7, false);
        
        
        cocina1.imprimir();
        System.out.println("\tCuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("\tValor Cuota: " + cocina1.cuotaCredito(cuotas, interes));
        System.out.println("\tValor Cuota con Adicionales: " + cocina1.creditoConAdicional(cuotas, interes));
        System.out.println("-------------------------------------");
        heladera1.imprimir();
        System.out.println("\tCuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("\tValor Cuota: " + heladera1.cuotaCredito(cuotas, interes));
        System.out.println("\tValor Cuota con Adicionales: " + heladera1.creditoConAdicional(6, 5));
        System.out.println("-------------------------------------");
        lavarropa1.imprimir();
        System.out.println("\tCuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("\tValor Cuota: " + lavarropa1.cuotaCredito(cuotas, interes));
        System.out.println("\tValor Cuota con Adicionales: " + lavarropa1.creditoConAdicional(cuotas, interes));
    }
}