
/**
 * Write a description of class Veterinaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Veterinaria
{
    private String nombre;
    private ArrayList<Animal> animales;
    
    public Veterinaria(String p_nombre){
        this.setNombre(p_nombre);
        this.setAnimales(new ArrayList<Animal>());
    }
    public Veterinaria(String p_nombre, ArrayList<Animal> p_animales){
        this.setNombre(p_nombre);
        this.setAnimales(p_animales);
    }
    
    //mutadores
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAnimales(ArrayList<Animal> p_animales){
        this.animales = p_animales;
    }
    //observadores
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }
    private boolean agregarAnimal(Animal p_animal){
        return this.getAnimales().add(p_animal);
    }
    private boolean quitarAnimal(Animal p_animal){
        return this.getAnimales().remove(p_animal);
    }
    
    public boolean ingresarAnimal(Animal p_animal){
        return this.agregarAnimal(p_animal);
    }
    public void venderAnimal(Animal p_animal){
        p_animal.vender();
    }
    
    public double recaudacion(){
        double acumulador = 0.00;
        for(Animal animal : this.getAnimales()){
            if(animal.getEstado().equals("Vendido")){
                acumulador += animal.precioVenta();
            }
        }
        return acumulador;
    }
    public void verAnimales(String p_estado){
        System.out.println("********* Animales " + p_estado + " de " + this.getNombre() + " *********");
        for(Animal animal:this.getAnimales()){
            if(animal.getEstado().equalsIgnoreCase(p_estado)){
                //Los siguientes 2 System.out.println podrían ir directamente en mostrar()
                //Solo que en el ejercicio se especifica el diseño de mostrar() sin ellos
                System.out.println(animal.queAnimal());
                System.out.println(animal.emitirSonido());
                animal.mostrar();
                System.out.println();
            }
        }
    }
    public void listarAnimalesDelTipo(String p_tipo){
        int contador = 0;
        System.out.println("********* Todos los " + p_tipo + "s de " + this.getNombre() + " *********");
        //Uso equalsIgnoreCase en lugar de equals para evitar problemas de mayus/minusc
        for(Animal animal:this.getAnimales()){
            if(animal.getClass().getSimpleName().equalsIgnoreCase(p_tipo) && animal.getEstado().equals("En Venta")){
                animal.mostrar();
                contador++;
                System.out.println();
            }
        }
        System.out.println("-------Hay " + contador + " " + p_tipo + "(s)\n");
    }
}
