package DigitalizaciónColegio.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    private List<Profesor> profesores;

    public Colegio() {
        this.profesores = new ArrayList<>();
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void registrarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public Profesor obtenerDatosXCodigoProfesor(String codigo){
        for(Profesor profesor: profesores){
            if(profesor.getCodigo().equals(codigo)){
                return profesor;
            }
        }return null;
    }


}
