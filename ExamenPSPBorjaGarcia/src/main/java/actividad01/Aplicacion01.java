package actividad01;

import java.io.File;
import java.util.ArrayList;

public class Aplicacion01 {

    private String nombre;

    public Aplicacion01(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {

        File file = new File("Borja.txt");

        ArrayList<Aplicacion01> lista = new ArrayList();
        lista.add(new Aplicacion01("Borja"));
        lista.add(new Aplicacion01("Guillermo"));
        lista.add(new Aplicacion01("Marco"));
        lista.add(new Aplicacion01("Juanito"));
        lista.add(new Aplicacion01("Paco"));
        lista.add(new Aplicacion01("Juanito"));

    }
}
