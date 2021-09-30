package DigitalizaciónColegio.Profesor;

public class Controller {
    private Colegio colegio;
    private View view;

    public Controller(String nombre){
        colegio = Colegio.obtenerInstancia(nombre);
        view = new View();
    }

    public void registrarProfesor(String... arg) {
        Profesor profesor = ProfesorFactoria.crear(arg);
        colegio.registrarProfesor(profesor);
    }

    public void buscarXDNIProfesor(){
        Profesor profesor = Colegio.obtenerDatosXDNIProfesor("A123");
        view.mostrarDatosProfesor(profesor);
    }


    public void mostrarListadoProfesor() {
        view.printListadoProfesor(colegio.getProfesores());
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
