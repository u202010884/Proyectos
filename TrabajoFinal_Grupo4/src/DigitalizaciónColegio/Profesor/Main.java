package DigitalizaciónColegio.Profesor;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller("Marie Curie");
        controller.registrarProfesor("ProfesorTC","A123", "Juan", "Orihuela", "juan.orihuela@mariecourie.com", "Matematica","1200");
        controller.registrarProfesor("ProfesorTC","A123", "Juan", "Orihuela", "juan.orihuela@mariecourie.com", "Letras","1500");
        controller.registrarProfesor("ProfesorTC","A123", "Juan", "Orihuela", "juan.orihuela@mariecourie.com", "Idiomas","1110");
        controller.mostrarListadoProfesor();
        controller.buscarXDNIProfesor();
    }
}
