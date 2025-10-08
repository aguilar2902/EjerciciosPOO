
/**
 * Write a description of class Loro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loro extends Animal
{
    private boolean habla;
    
    public Loro(String p_nombre, int p_edad, double p_costo){
        super(p_nombre, p_edad, p_costo);
        this.setHabla(false);
    }
    public Loro(String p_nombre, int p_edad, double p_costo,boolean p_habla){
        super(p_nombre, p_edad, p_costo);
        this.setHabla(p_habla);
    }
    //mutadores
    private void setHabla(boolean p_habla){
        this.habla = p_habla;
    }
    //observadores
    public boolean getHabla(){
        return this.habla;
    }
    //Otros métodos
    public String emitirSonido(){
        return "Prrrrr";
    }
    public String queAnimal(){
        return "Soy un loro";
    }
    public double precioVenta(){
        if(this.getHabla()){
            return super.precioVenta() + 70;
        }
        return super.precioVenta();
    }
}