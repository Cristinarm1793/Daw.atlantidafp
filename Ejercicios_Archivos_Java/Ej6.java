import java.io.*;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo1.txt";

        System.out.println("Ingrese un nuevo texto");
        String texto = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(texto);
            bw.newLine();

            System.out.println("El archivo ha sido sobrescrito.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
