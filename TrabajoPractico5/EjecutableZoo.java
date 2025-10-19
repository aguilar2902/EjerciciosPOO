
/**
 * Write a description of class EjecutableZoo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class EjecutableZoo
{
    public static void main(String[] args){
        Zoologico zoo1 = new Zoologico("El Caribú");
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(2024, 9 - 1, 22);
        
        //Calendar fechaPrueba = Calendar.getInstance();
        //fechaPrueba.set(2024, 9 - 1, 13);
        
        Persona pers1 = new Persona(14528796, "Maria", "Perez", 1969);
        Persona pers2 = new Persona(23568963, "Maria", "Lusteau", 1969);
        Persona pers3 = new Persona(24875785, "Carlos", "Perez", 1978);
        //Persona pers4 = new Persona(24875785, "Josefina", "Rodriguez", 1995);
        
        //individuo
        Visitante visi1 = new Individuo("Individuo", fecha, pers1);
        Individuo ind2 = new Individuo("Individuo", fecha, pers2);
        Individuo ind3 = new Individuo("Individuo", fecha, pers3);
        
        //delegacion
        
        ArrayList<Individuo> lista = new ArrayList<Individuo>();
        lista.add(ind2);
        lista.add(ind3);
        
        Visitante visi2 = new Delegacion("PAMI", fecha, lista);
        //Visitante visi3 = new Individuo("Individuo", fechaPrueba, pers4);
        
        //Agregar visitantes
        zoo1.nuevoVisitante(visi1);
        zoo1.nuevoVisitante(visi2);
        //zoo1.nuevoVisitante(visi3);
        
        System.out.println("Listar todos los visitantes por fecha...");
        zoo1.listarVisitantePorFecha(fecha);
        
        System.out.println("\nListar la recaudacion del ultimo mes..");
        Calendar fechaDesde = Calendar.getInstance();
        Calendar fechaHasta = Calendar.getInstance();
        
        fechaDesde.set(2024, 9 - 1, 1);
        fechaHasta.set(2024, 9 - 1, 30);
        
        System.out.println("Total recaudado: $" + zoo1.recaudacion(fechaDesde, fechaHasta));
        
        System.out.println("\nListar las delegaciones que asistieron el 22/09/2024..");
        zoo1.listarTipoVisitantePorFecha(fecha, "delegacion");
    }
}