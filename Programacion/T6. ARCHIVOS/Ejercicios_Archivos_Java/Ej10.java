import java.io.*;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo2.txt";
        File fl = new File(path);

        if (fl.exists()) {
            System.out.println("¿Quieres eliminar 'archivo2.txt'? (s/n)");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("s")) {
                if (fl.delete()) {
                    System.out.println("Archivo eliminado");
                } else {
                    System.out.println("No se pudo eliminar el archivo");
                }
            } else {
                System.out.println("La eliminacion del archivo ha sido cancelada. ");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
        sc.close();
    }
}