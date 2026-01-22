import java.io.*;

public class Ej2 {
    public static void main() {
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Archivos_CSV\\datos.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
