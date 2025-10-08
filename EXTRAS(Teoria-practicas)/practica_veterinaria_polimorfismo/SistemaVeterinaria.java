
/**
 * Write a description of class SistemaVeterinaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SistemaVeterinaria
{
    public static void main(String[] args){
        Veterinaria sweet = new Veterinaria("Sweet Pets");
        Animal mascota1 = new Perro("Lassie", 5, 875.0);
        Animal mascota2 = new Gato("Garfield", 3, 875.0);
        Animal mascota3 = new Perro("Sheepy", 1, 1875);
        Animal mascota4 = new Loro("Pepito", 2, 500);
        Animal mascota5 = new Loro("Pepita", 3, 500, true);
        System.out.println("Pepita habla?: " + ((Loro)mascota5).getHabla());
        
        sweet.ingresarAnimal(mascota1);
        sweet.ingresarAnimal(mascota2);
        sweet.ingresarAnimal(mascota3);
        sweet.ingresarAnimal(mascota4);
        sweet.ingresarAnimal(mascota5);
        
        sweet.verAnimales("En Venta");
        sweet.listarAnimalesDelTipo("perro");
        System.out.println("Vendiendo a " + mascota3.getNombre() + "....\n");
        sweet.venderAnimal(mascota3);
        sweet.verAnimales("Vendido");
        System.out.println("****** Total recaudado:" + sweet.recaudacion());
        System.out.println();
        sweet.listarAnimalesDelTipo("perro");
        sweet.listarAnimalesDelTipo("Gato");
        sweet.listarAnimalesDelTipo("Loro");
        System.out.println("Vendiendo a " + mascota5.getNombre() + "....\n");
        sweet.venderAnimal(mascota5);
        sweet.verAnimales("Vendido");
        System.out.println("****** Total recaudado:" + sweet.recaudacion());
        System.out.println();
        sweet.listarAnimalesDelTipo("Loro");
    }
}