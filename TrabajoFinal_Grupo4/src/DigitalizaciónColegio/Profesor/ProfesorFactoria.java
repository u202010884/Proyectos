package DigitalizaciónColegio.Profesor;

public class ProfesorFactoria {
    public Profesor crear (String tipo, String... args){
        if (tipo.equals("ProfesorTC")){
            return new ProfesorTC(args[0], args[1], args[2], args[3], args[4], args[5],Double.parseDouble(args[6]));
        }else if (tipo.equals("ProfesorTP")){
            return new ProfesorTP(args[0],args[1],args[2],args[3],args[4],args[5],Integer.parseInt(args[6]),Double.parseDouble(args[7]));

        }return null;
    }
}
