import java.io.*;

public class Ej5 {
    public static void main(String[] args) {
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Archivos_CSV\\datos.csv";
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.readLine() != null) {
                contador++;
            }
            System.out.println("El archivo tiene "+contador+" lineas.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
