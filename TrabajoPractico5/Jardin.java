
/**
 * Write a description of class Jardin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Jardin
{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    
    public Jardin(String p_nombre){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
    }
    
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    
    public boolean quitarFigura(FiguraGeometrica p_figura){
        if(this.getFiguras().isEmpty()){
            return false;
        }else{
            return this.getFiguras().remove(p_figura);
        }
    }
    
    private double cuantosLitros(){
        //si 4lts cubren 20mts, entonces 1lts cubre 5mts
        return this.cuantosMetros() / 5;
    }
    
    public int cuantasLatas(){
        //si sobra, redondea hacia arriba
        return (int)Math.ceil(this.cuantosLitros() / 4);
    }
    
    public double cuantosMetros(){
        double contMts = 0.0;
        
        for(FiguraGeometrica fig: figuras){
            contMts += fig.superficie();
        }
        
        return contMts;
    }
    
    public void detalleFiguras(){
        System.out.println("\tPresupuesto: Bichito de Luz\n");
        
        for(FiguraGeometrica fig: figuras){
            //System.out.println(fig.nombreFigura());
            fig.mostrarSuperficie();
            System.out.println();
        }
        
        System.out.println("\t----------------------------------");
        System.out.println("\tTotal a cubrir: " + this.cuantosMetros());
        System.out.println("\tComprar " + this.cuantasLatas() + " latas");
    }
}