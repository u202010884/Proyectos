package DigitalizaciónColegio.Profesor;

import java.util.List;

public class View {
    public void printListadoProfesor(List<Profesor> profesores){
        System.out.println("-------------------------");
        for (Profesor profesor:profesores){
            System.out.println(profesor.obetenerDatos());
        }
        System.out.println("-------------------------");
    }

    public void mostrarDatosProfesor(Profesor profesor) {
        System.out.println("--------------------------------");
        System.out.println("Tus datos registrados son:" + '\n' + profesor.obetenerDatos());
    }
}
