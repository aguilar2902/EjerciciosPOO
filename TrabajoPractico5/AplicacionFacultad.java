
/**
 * Write a description of class AplicacionFacultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class AplicacionFacultad
{
    public static void main(String[] args){
        Cargo cargo1 = new Cargo("JTP-Programacion OO", 800, 2015);
        Cargo cargo2 = new SemiExclusivo("Titular-TFA", 1400, 2013, 20);
        Cargo cargo3 = new Cargo("JTP-Analisis de Sistemas", 800, 2005);
        Cargo cargo4 = new Cargo("JTP-II", 1200, 2014);
        Cargo cargo5 = new Exclusivo("JTP-Ing.Soft", 1800, 2015, 10, 20, 10);
        
        ArrayList<Cargo> listaCargos = new ArrayList<Cargo>();
        listaCargos.add(cargo1);
        listaCargos.add(cargo2);
        listaCargos.add(cargo3);
        
        ArrayList<Cargo> listaCargos2 = new ArrayList<Cargo>();
        listaCargos2.add(cargo4);
        listaCargos2.add(cargo5);
        
        Profesor prof1 = new Profesor(21859361, "Juan", "Perez", 1988, "Lic. en Sistemas de Informacion", listaCargos);
        Profesor prof2 = new Profesor(34519921, "Mirta", "Lopez", 1995, "Lic. en Sistemas de Informacion", listaCargos2);
        
        Facultad facu = new Facultad("FaCENA", prof1);
        facu.agregarProfesor(prof2);
        
        //facu.nominaProfesores();
        //prof1.mostrar();
        facu.listarProfesorCargos();
    }
}