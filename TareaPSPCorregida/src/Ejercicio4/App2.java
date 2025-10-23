package Ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Crea tres aplicaciones
 * a. Aplicación 1
 * i. Guarda en un fichero la fecha y hora actual y un número que se corresponde con la
 * temperatura y que será un número aleatorio entre dos números que recibirá por
 * argumento.
 * ii. El nombre del fichero lo deberá recibir también como un argumento.
 * b. Aplicación 2.
 * i. Recibirá el nombre de un fichero que contiene fechas y temperaturas y deberá
 * mostrar por terminal la fecha y el día con mayor temperatura.
 * c. Aplicación 3
 * i. Llamará a Aplicación 1 para añadir al menos 4 entradas en el fichero que se
 * indique. Se recomienda dejar una pausa entre llamadas de al menos un segundo.
 * ii. Llamará a Aplicación 2 para que le indique qué día y hora ha hecho más calor por
 * terminal.
 */

public class App2 {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Falta el nombre del fichero.");
            System.exit(1);
        }
        String nombreFichero = args[0];

        try {
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader br = new BufferedReader(fr);

            //Variable auxiliar con el número mínimo posible (investigación)
            int tempAux = Integer.MIN_VALUE;

            String lineaPrint = null;

            String linea = br.readLine();
            while (linea != null) {
                String[] temp =  linea.split(" Temperatura: ");
                int temperatura = Integer.parseInt(temp[1].trim());
                if (temperatura > tempAux) {
                    tempAux = temperatura;
                    lineaPrint = linea;
                }
                linea = br.readLine();
            }

            if (lineaPrint != null) {
                //Salida que se recibe en la app3
                System.out.println(lineaPrint);
            }else{
                System.out.println("El fichero no tiene datos.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
