import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        String archivo1 = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo1.txt";
        String archivo2 = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo2))) {
            String linea;
            while ((linea = br.readLine()) !=null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Copia creada");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
