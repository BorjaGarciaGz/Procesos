package Ejercicio2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Crea dos aplicaciones
 * a. Aplicación 1
 * i. Le pide al usuario el número de palabras que quiere introducir.
 * ii. Le pide al usuario que introduzca estas palabras.
 * iii. Todas estas palabras se las pasará en una única cadena a Aplicación 2
 * iv. Recibirá una cadena con estas palabras ordenadas de Aplicación 2 y mostrará estas
 * palabras poniendo cada palabra en una línea distinto y al final indicará el número
 * total de palabras.
 * b. Aplicación 2
 * i. Recibe una cadena con sucesivas palabras
 * ii. Le devolverá todas las palabras en una única cadena a Aplicación ordenadas
 * alfabéticamente en orden descendente (Si recibe Mario Ana Zaragoza devolverá
 * Zaragoza Mario Ana)
 */

public class App1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas palabras quieres introducir?");
        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder palabrasEspacio = new StringBuilder();

        for (int i = 0; i < n; i++) {
            System.out.println("Palabra " + (i + 1) + ":");
            palabrasEspacio.append(sc.nextLine()).append(" ");
        }

        //Borrar último espacio
        palabrasEspacio.deleteCharAt(palabrasEspacio.length() - 1);

        String rutaApp2 ="src/Ejercicio2/App2.java";

        ProcessBuilder pb = new ProcessBuilder("java", rutaApp2, palabrasEspacio.toString());

        try {
            pb.inheritIO();
            Process p = pb.start();
            //p.waitFor();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
