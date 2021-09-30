package DigitalizaciónColegio.Profesor;

public class Ejecutadora {

    public static void main(String[] args) {
        Colegio mariecourie = new Colegio();

        Profesor profesor1 = new ProfesorTC("A123", "Juan", "Orihuela", "juan.orihuela@mariecourie.com", "Matematica", 500);
        Profesor profesor2 = new ProfesorTP("B123", "Fernando", "Garcia", "fernando.garcia@mariecourie.com", "Idiomas", 24, 60);



        mariecourie.registrarProfesor(profesor1);
        mariecourie.registrarProfesor(profesor2);

        System.out.println("----------------Datos de Profesores-----------------");
        System.out.println(profesor1.obetenerDatos() + '\n'
                + '\n' + profesor2.obetenerDatos());
        System.out.println('\n' + "--Obtener datos por DNI de Profesor:");
        Profesor profesorBuscado = mariecourie.obtenerDatosXDNIProfesor("A123");
        System.out.println(profesorBuscado.obetenerDatos());

        //Factoria
        ProfesorFactoria factory = new ProfesorFactoria();
        Profesor profesor3 = (ProfesorTP) factory.crear("30843176", "Gonzalo", "Guerrero", "gonzalo.guerrero@mariecuorie", "Ciencias", "1200");
        mariecourie.registrarProfesor(profesor3);
        Profesor profesor4 = (ProfesorTP) factory.crear("84613059", "Jose", "Quintana", "jose.quintana@mariecourie", "Letras", "1300");
        mariecourie.registrarProfesor(profesor4);

        //Agregar Especialidades


    }


}
