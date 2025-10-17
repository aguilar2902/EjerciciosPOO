/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Profesor extends Persona{
    
    private String titulo;
    ArrayList<Cargo> cargos;

    /**
     * Constructor for objects of class Profesor
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, Cargo p_cargo)
    {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        
        ArrayList<Cargo> lista = new ArrayList<Cargo>();
        lista.add(p_cargo);
        this.setCargos(lista);
    }

    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargo)
    {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargo);
    }

    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    private void setCargos(ArrayList<Cargo> p_cargo){
        this.cargos = p_cargo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    
    public boolean agregarCargo(Cargo p_cargo){
        if(this.getCargos().size() < 3){
            return this.getCargos().add(p_cargo);
        }
        
        return false;
    }
    
    public boolean quitarCargo(Cargo p_cargo){
        if(this.getCargos().size() == 1){
            return false;
        }
        
        return this.getCargos().remove(p_cargo);
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("\tTitulo: " + this.getTitulo());
        System.out.println();
        this.listarCargos();
        System.out.println("\n\t** Sueldo Total: $" + this.sueldoTotal() + " **");
    }
    
    public void listarCargos(){
        System.out.println("\t_***** Cargos Asignados *****_");
        System.out.println("\t______________________________");
        for(Cargo car: cargos){
            car.mostrarCargo();
        }
    }
    
    public double sueldoTotal(){
        double aux = 0.0;
        
        for(Cargo car: cargos){
            aux += car.sueldoDelCargo();
        }
        
        return aux;
    }
    
    public String mostrarLinea(){
        String s = "\tDNI: " + super.getDni() + " Nombre: " + super.nomYApe() + " Sueldo Total: $" + this.sueldoTotal();
        return s;
    }
}