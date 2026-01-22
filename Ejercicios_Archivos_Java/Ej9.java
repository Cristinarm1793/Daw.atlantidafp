import java.io.*;
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo1.txt";
        String pathFiltrado = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\filtrado.txt";

        System.out.println("Ingrese la palabra que deseas buscar: ");
        String buscarPalabra = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path));
             BufferedWriter bw = new BufferedWriter(new FileWriter(pathFiltrado))) {
            String linea;
            while ((linea = br.readLine()) != null){
                if (linea.contains(buscarPalabra)) {
                    bw.write(linea);
                    bw.newLine();
                }
            }
            System.out.println("Las lineas que contienen la palabra "+buscarPalabra+" han sido guardadas en "+pathFiltrado);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
