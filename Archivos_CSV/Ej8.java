import java.io.*;

public class Ej8 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("adultos.csv"))) {
            String linea;
            while ((linea = br.readLine()) !=null){
                String[] datos = linea.split(",");
                int edad = Integer.parseInt(datos[1]);

                if (edad >= 18){
                    bw.write(linea);
                    bw.newLine();
                }
            }
            System.out.println("Archivo adultos.csv creado");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}