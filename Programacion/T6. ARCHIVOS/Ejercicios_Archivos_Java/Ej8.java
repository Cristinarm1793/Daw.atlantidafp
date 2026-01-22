import java.io.*;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo1.txt";

        System.out.println("Ingrese una palabra");
        String buscarPalabra = sc.nextLine();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) !=null) {
                String[] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    if (palabra.equalsIgnoreCase(buscarPalabra))
                        contador++;
                }
            }
            System.out.println("La palabra "+buscarPalabra+" aparece "+contador+" veces.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
