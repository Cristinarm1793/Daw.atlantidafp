import java.io.*;
import java.util.Scanner;

public class Ej1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Archivos_CSV\\datos.csv";
        System.out.println("Ingresa un dato (formato: nombre, edad, ciudad)");
        String linea = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(linea);
            bw.newLine();
            System.out.println("La linea se ha guardado");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}