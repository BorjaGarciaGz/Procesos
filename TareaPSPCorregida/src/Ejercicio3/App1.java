package Ejercicio3;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Crea dos aplicaciones:
 *
 *      a. Aplicación 1
 *          i. Guarda en un fichero la fecha y hora actual.
 *          ii. Debe recibir dos argumentos, el primero es el nombre del fichero y el segundo
 *              indica si el fichero se genera nuevo y, por tanto, se machaca su contenido o si por
 *              el contrario la fecha se debe añadir en una nueva línea.
 *
 *      b. Aplicación 2
 *          i. Debe llamar entre 4 y 6 veces (se le pedirá al usuario que introduzca número) a
 *              Aplicación 1 con una diferencia entre 2 y 5 segundos cada vez que se llama (se
 *              calcula de forma aleatorio la espera entre llamadas).
 *          ii. La primera de las llamadas indicará que el fichero se genera nuevo y el resto de
 *              veces que se sobrescribe.
 *          iii. El nombre del fichero debe ser un valor constante en la Aplicación 2.
 *          iv. Muestra por terminal el resultado del fichero. Debe mostrarse para cada fecha el
 *              formato siguiente 10/10/2026 a las 12:23:46
 */

public class App1 {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Argumentos incorrectos. Son 2.");
            System.exit(1);
        }

        String nombre = args[0];
        String opcion = args[1];


        String fecha = LocalDate.now().getDayOfMonth() + "/"
                + LocalDate.now().getMonthValue() + "/"
                + LocalDate.now().getYear();

        String horaActual = String.valueOf(LocalDateTime.now().getHour()) + ':'
                + LocalDateTime.now().getMinute() + ':' + LocalDateTime.now().getSecond();

        generarFichero(nombre, opcion, fecha, horaActual);

    }

    public static void generarFichero(String nombre, String op, String fechaActual, String horaActual) {

        switch (op) {
            case "1":
                try {
                    File archivo = new File(nombre);
                    FileWriter fw = new FileWriter(archivo, false);

                    fw.write(fechaActual + " a las " + horaActual + System.lineSeparator());
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;

            case "2":
                try {
                    File archivo = new File( nombre);
                    FileWriter fw = new FileWriter(archivo, true);

                    fw.write(fechaActual + " a las " + horaActual + System.lineSeparator());
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
        }

    }





}
