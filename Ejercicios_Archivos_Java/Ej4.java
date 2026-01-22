import java.io.*;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo1.txt";

        System.out.println("Ingrese un texto");
        String texto = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(texto);
            bw.newLine();
            System.out.println("Texto agregado");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
