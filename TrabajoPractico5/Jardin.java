
/**
 * Implementación de la clase Jardin.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class Jardin
{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    
    /**
     * Constructor para Jardín sin figuras
     * @param p_nombre nombre del jardín
     */
    public Jardin(String p_nombre){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
    }
    /**
     * Constructor para un Jardín con una lista de figuras
     * @param p_nombre nombre del jardín
     * @param p_figuras una lista de figuras
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    //Mutadores
    /**
     * Asigna un nombre al jardín
     * @param p_nombre nombre del jardín
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    //Observadores
    /**
     * @return la cadena de texto correspondiente al nombre del jardín
     */
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    /**
     * Método para agregar una figura
     * @param p_figura figura a agregar
     * @return devuelve un booleano confirmando si se realizó con éxito.
     */
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    /**
     * Método para quitar una figura
     * @param p_figura figura a quitar
     * @return devuelve un booleano confirmando si se quitó con éxito.
     */
    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    /**
     * Método para calcular cuantos litros se requieren para cubrir la superficie
     * @return los litros necesarios
     */
    private double cuantosLitros(){
        //si 4lts cubren 20mts, entonces 1lts cubre 5mts
        return this.cuantosMetros() / 5;
    }
    /**
     * Método para calcular la cantidad de latas de pintura necesarias
     * @return la cantidad de latas necesarias (redondeo hacia arriba)
     */
    public int cuantasLatas(){
        //si sobra, redondea hacia arriba
        return (int)Math.ceil(this.cuantosLitros() / 4);
    }
    /**
     * Obtiene el total de m2 de superficie a cubrir
     * @return la sumatoria de superficies a cubrir
     */
    public double cuantosMetros(){
        double contMts = 0.0;
        
        for(FiguraGeometrica fig: figuras){
            contMts += fig.superficie();
        }
        
        return contMts;
    }
    /**
     * Muestra por pantalla todas las figuras y sus respectivas superficies, la 
     * superficie total y la cantidad de latas necesarias para cubrirla.
     * 
     */
    public void detalleFiguras(){
        System.out.println("\tPresupuesto: Bichito de Luz\n");
        
        for(FiguraGeometrica fig: this.getFiguras()){
            fig.mostrarSuperficie();
            System.out.println();
        }
        
        System.out.println("\t----------------------------------");
        System.out.println("\tTotal a cubrir: " + this.cuantosMetros());
        System.out.println("\tComprar " + this.cuantasLatas() + " latas\n");
    }
}