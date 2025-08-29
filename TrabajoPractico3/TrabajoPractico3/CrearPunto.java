
public class CrearPunto
{
    public static void main(String [] args){
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        
        punto1.mostrar();
        punto2.mostrar();
        
        System.out.println(punto1.distanciaA(punto2));
        
        
        
    }
}