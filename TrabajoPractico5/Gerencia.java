
/**
 * Write a description of class Gerencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Gerencia
{
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;
    
    //CONSTRUCTORES
    public Gerencia(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<Alojamiento>());
    }
    
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientos);
    }
    
    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientos){
        this.alojamientosAlquilados = p_alojamientos;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }
    
    //OTROS METODOS
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }
    
    public int contarAlojamiento(String p_alojamiento){
        int aux = 0;
        for(Alojamiento lista: this.getAlojamientosAlquilados()){
            aux += lista.contar(p_alojamiento);
        }
        
        return aux;
    }
    
    public void liquidar(){
        for(Alojamiento lista: this.getAlojamientosAlquilados()){
            lista.liquidar();
            System.out.println();
        }
    }
    
    public void mostrarLiquidacion(){
        System.out.println("\tGerencia " + this.getNombre());
        System.out.println("\tLiquidacion---------------------------\n");
        this.liquidar();
        System.out.println("\n\tAlojamiento tipo Cabaña ---->" + this.contarAlojamiento("Cabaña"));
        System.out.println("\n\tAlojamiento tipo Hotel ----->" + this.contarAlojamiento("Hotel"));
    }
}