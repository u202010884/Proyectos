package DigitalizaciónColegio.Profesor;

public class Controller {
    private Colegio colegio;
    private View view;

    public Controller(String nombre){
        colegio = Colegio.obtenerInstancia(nombre);
        view = new View();
    }

    public void registrarProfesor(String... arg) throws SueldoMaximoException{
        Profesor profesor = ProfesorFactoria.crear(arg);
        colegio.registrarProfesor(profesor);
    }

    public void buscarXDNIProfesor() throws SueldoMaximoException {
        Profesor profesor = Colegio.obtenerDatosXDNIProfesor("45708997");
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
