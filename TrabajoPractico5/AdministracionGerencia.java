
/**
 * Write a description of class AdministracionGerencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class AdministracionGerencia
{
    public static void main(String[] args){
        //Creo el objeto Gerencia
        Gerencia gerencia = new Gerencia("Los Arroyos");
        
        //Datos y creacion de Cabaña
        Servicio a1 = new Servicio("alquiler auto", 100);
        Servicio a2 = new Servicio("Lavanderia", 20);
        
    
        ArrayList<Servicio> lista1 = new ArrayList<Servicio>();
        lista1.add(a1);
        lista1.add(a2);
        
        Alojamiento aloj1 = new Cabaña("Cabañas La Alondra", 120, 5, lista1, 3);
        
        Servicio a3 = new Servicio("internet", 5);
        Servicio a4 = new Servicio("alquiler auto", 100);
        
        ArrayList<Servicio> lista2 = new ArrayList<Servicio>();
        lista2.add(a3);
        lista2.add(a4);
        
        Alojamiento aloj2 = new Hotel("Hotel Guarani", 70, 7, lista2, "single");
        
        //Alojamiento aloj3 = new Hotel("Hotel Marriot", 75, 5, "doble");
        
        gerencia.agregarAlojamiento(aloj1);
        gerencia.agregarAlojamiento(aloj2);
        //gerencia.agregarAlojamiento(aloj3);
        
        gerencia.mostrarLiquidacion();
    }
}