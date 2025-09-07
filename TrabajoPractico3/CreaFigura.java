/**
 * Clase con método ejecutable para las pruebas de instancias de Punto, Circulo y Rectangulo.<br>
 * Nota: un Punto se envía por arg del main, el otro se crea en el punto (0,0).<br>
 * Otras figuras: usando Scanner
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00 
 */

import java.util.Random;
import java.util.Scanner;
public class CreaFigura
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        /*
        Pruebas de Punto
        El punto2 se ingresa como argumento del main 
        */
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        System.out.println("----Pruebas de métodos en instancias de la clase Punto---");
        punto1.mostrar();
        punto2.mostrar();
        System.out.println("Distancia entre los puntos " + punto1.coordenadas() + 
            " y " + punto2.coordenadas() + ": " + punto1.distanciaA(punto2));
        System.out.println("Desplazando el punto 1 desde (0,0) a (3,9)...");
        punto1.desplazar(3, 9);
        punto1.mostrar();
        System.out.println("Distancia entre los puntos " + punto1.coordenadas() + 
            " y " + punto2.coordenadas() + ": " + punto1.distanciaA(punto2));
        System.out.println("----Fin pruebas de Punto---");
        
        System.out.println("\n\t----Creando círculos----");
        
        double radio1 = rand.nextDouble() * 100.0;
        Circulo circulo1 = new Circulo(radio1, new Punto());
        
        System.out.print("1° Círculo creado");
        circulo1.caracteristicas();
        System.out.println("Desplazando el centro en 240 unidades hacia la izquierda y 230 hacia abajo");
        circulo1.desplazar(-240, -230);
        circulo1.caracteristicas();
            
        System.out.println("Creando el 2° círculo...\n");
        double radio2 = rand.nextDouble() * 100.0;
        
        System.out.println("Ingrese el punto de origen del circulo (cordenadas x e y)");
        System.out.println("Sugerido (5.2 , 0.5) del ejercicio (usar , para separar decimales): ");
        Circulo circulo2 = new Circulo(radio2, new Punto(teclado.nextDouble(), teclado.nextDouble()));
        System.out.println("2° Círculo creado");
        System.out.println("\n--------**Círculo de mayor tamaño**------");
        circulo1.elMayor(circulo2).caracteristicas();
        
        System.out.println("---Test de superficies de círculos---");
        System.out.println("1: " + circulo1.superficie());
        System.out.println("2: " + circulo2.superficie());
        
        System.out.println("La distancia entre los dos círculos es de " + circulo1.distanciaA(circulo2) + " unidades.");
        
        System.out.println("\n\t----Creando rectángulos----");
        System.out.println("Creando 1° rectángulo...");
        double alto1 = rand.nextDouble() * 100;
        double ancho1 = rand.nextDouble() * 100;
        Rectangulo rectangulo1 = new Rectangulo(ancho1,alto1);
        rectangulo1.caracteristicas();
        rectangulo1.desplazar(40,-20);
        rectangulo1.caracteristicas();
        
        System.out.println("Creando el 2° rectángulo...\n");
        double alto2 = rand.nextDouble() * 100;
        double ancho2 = rand.nextDouble() * 100;
        System.out.println("Ingrese el punto de origen del rectángulo (cordenadas x e y)");
        System.out.println("Sugerido (7.4 , 4.5) del ejercicio (usar , para separar decimales): ");
        Rectangulo rectangulo2 = new Rectangulo(new Punto(teclado.nextDouble(), teclado.nextDouble()), ancho2, alto2);
        System.out.println("2° Rectángulo creado");
        rectangulo2.caracteristicas();
        System.out.println("\n--------**Rectángulo de mayor tamaño**------");
        rectangulo1.elMayor(rectangulo2).caracteristicas();
        System.out.println("La distancia entre los dos rectángulos es de " + rectangulo1.distanciaA(rectangulo2) + " unidades.");

        teclado.close();    
    }
}