package DigitalizaciónColegio.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private static Colegio colegio = new Colegio();
    private String nombre;
    private static List<Profesor> profesores;


    public static Colegio obtenerInstancia(String nombre){
        colegio.setNombre(nombre);
        profesores = new ArrayList<>();
        return colegio;
    }


    public List<Profesor> getProfesores() {return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void registrarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public static Profesor obtenerDatosXDNIProfesor(String codigo){
        for(Profesor profesor: profesores){
            if(profesor.getDni().equals(codigo)){
                return profesor;
            }
        }return null;

    }







    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
