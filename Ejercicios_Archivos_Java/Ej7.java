import java.io.*;

public class Ej7 {
    public static void main(String[] args) {
        String path1 = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo1.txt";
        String path2 = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo2.txt";
        String path3 = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo3.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path3))) {
            try (BufferedReader br1 = new BufferedReader(new FileReader(path1))) {
                String linea;
                while ((linea = br1.readLine()) !=null) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

            bw.newLine();

            try (BufferedReader br2 = new BufferedReader(new FileReader(path2))) {
                String linea;
                while ((linea = br2.readLine()) !=null) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

            System.out.println("Los archivos se han concatenado en "+path3);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
