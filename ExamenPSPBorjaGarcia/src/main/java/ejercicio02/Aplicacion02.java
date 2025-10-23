package ejercicio02;

import java.io.*;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Aplicacion02 {
    public static void main(String[] args) throws IOException {
        if(args.length != 3){
            System.err.println("Formato de argumentos incorrecto");
            return;
        }

        File f = new File("20251023-Borja.md");
        FileWriter fw = new FileWriter(f);

        String nombre = args[0];
        String fecha = args[1];
        String contrasenia = args[2];

        Format formato = new SimpleDateFormat("dd/MM/yyyy");
        fecha = formato.format(new Date());


        contrasenia = Character.valueOf(contrasenia.toCharArray()[0]).toString();


    }


}
