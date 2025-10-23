package ejercicio02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Aplicacion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos usuarios quieres dar de alta");
        int n=sc.nextInt();

        String rutaApp2 = "C:\\Users\\alumno\\Desktop\\ProcesosYServicios\\Procesos\\ExamenPSPBorjaGarcia\\src\\main\\java\\ejercicio02\\Aplicacion02.java";

        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Ingresa el nombre del usuario: ");
                String nombre = sc.nextLine();
                sc.nextLine();
                System.out.println("Fecha de nacimiento: ");
                String fecha = sc.nextLine();
                System.out.println("Contraseña: ");
                String contrasenia = sc.nextLine();
                ProcessBuilder pb = new ProcessBuilder("java", rutaApp2, nombre, fecha, contrasenia);

                Process p = pb.start();
                p.waitFor();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
