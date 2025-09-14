/**
 * Write a description of class ArrayDePuntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class ArrayDePuntos
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        //creo contenedor estático de 6 elementos
        Punto puntos[] = new Punto[6];
        double posX;
        double posY;
        
        System.out.println("Ingrese las posiciones de los 6 puntos");
        
        //carga del contenedor
        for(int i = 0; i < puntos.length; i++){
            
            System.out.println("Punto Nro " + (i + 1));
            System.out.print("Ingrese el primer valor: ");
            posX = teclado.nextDouble();
            System.out.print("Ingrese el segundo valor: ");
            posY = teclado.nextDouble();
            puntos[i] = new Punto(posX, posY);
        }

        System.out.println("\nMuestra de las distancia entre puntos.");
        
        //recorrido y muestra por pantalla
        for(int i = 0; i < (puntos.length - 1); i++){
            System.out.println("\nDistancia entre punto "+ (i+1) +" y "+ (i+2)+": " + puntos[i].distanciaA(puntos[i+1]));
        }
        
    }
}