
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato extends Animal
{
    public Gato(String p_nombre, int p_edad, double p_costo){
        super(p_nombre, p_edad, p_costo);
    }
    
    public String emitirSonido(){
        return "Miau !";
    }
    public String queAnimal(){
        return "Soy un gato";
    }
}