package DigitalizaciónColegio.Profesor;

public class Ejecutadora {

    public static void main(String[] args) {

        Profesor profesor1 = new ProfesorTC("A123", "Gepetto", "Orihuela", "gepetto.orihuela@mariecourie.com", "Secundaria", "Ciencias", 1600);
        Profesor profesor2 = new ProfesorTP("B123", "Pinocho", "Orihuela", "pinocho.orihuela@mariecourie.com", "Primaria", "Idiomas", 24, 60);

        Colegio mariecourie = new Colegio();
        mariecourie.registrarProfesor(profesor1);
        mariecourie.registrarProfesor(profesor2);
        System.out.println( profesor1.obetenerDatos() +'\n' + profesor2.obetenerDatos());

        System.out.println("--Obtener datos por código de Profesor:");
        Profesor profesorBuscado = mariecourie.obtenerDatosXCodigoProfesor("A123");
        System.out.println(profesorBuscado.obetenerDatos());
    }
}
