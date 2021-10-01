package DigitalizaciónColegio.Profesor;

public class Main {
    public static void main(String[] args) throws SueldoMaximoException {
        Controller controller = new Controller("Marie Curie");

        try {
            controller.registrarProfesor("ProfesorTC", "45708997", "Juan", "Andrade", "juan.andrade@mariecourie.com", "Matematica", "1200");
            controller.registrarProfesor("ProfesorTC","56702382", "Fernando", "Ramirez", "fernando.ramirez@mariecourie.com", "Letras","1500");
            controller.registrarProfesor("ProfesorTC","38492032", "Carlos", "Ortiz", "carlos.ortiz@mariecourie.com", "Idiomas","1050");
            controller.registrarProfesor("ProfesorTC","41400572", "Luis", "Fernandez", "luis.fernandez@mariecourie.com", "Ciencias","1100");
            controller.registrarProfesor("ProfesorTC","70349323", "Christian", "Alva", "christian.alva@mariecourie.com", "Educacion Fisica","950");
            controller.registrarProfesor("ProfesorTC","39982919", "Martha", "Delgado", "martha.delgado@mariecourie.com", "Lenguaje","1180");
            controller.registrarProfesor("ProfesorTP","50332010","Teresa","Contreras","teresa.contreras@mariecourie.com","Matematica","40","45");
            controller.mostrarListadoProfesor();
        }catch (SueldoMaximoException e){
            System.out.println(e.getMessage());
        }

        try {
            controller.registrarProfesor("ProfesorTC", "58683922", "Fabiana", "Lopez", "juan.andrade@mariecourie.com", "Matematica", "3000");
            controller.mostrarListadoProfesor();
        }catch (SueldoMaximoException ex){
            System.out.println(ex.getMessage());
            System.out.println("-------------------------");
        }



        controller.buscarXDNIProfesor();
    }
}
