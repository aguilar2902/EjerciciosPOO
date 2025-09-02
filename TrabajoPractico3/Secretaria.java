/**
 * Write a description of class Secretaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secretaria
{
    public static void main(String [] args){
        Docente unDocente = new Docente("Elisa Sanchez", "tercero", 1600.00, 1290.00 );
        Escuela escuela1 = new Escuela("Manuel Belgrano", "Irigoyen 1580", "Leopoldo Juez");
        
        escuela1.imprimirRecibo(unDocente);
        
    }
}