import java.io.*;

public class Ej6 {
    public static void main(String[] args) {
        String path = "datos.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) !=null){
                String[] datos = linea.split(",");
                System.out.println("Nombre: " + datos[0]);
                System.out.println("Edad: " + datos[1]);
                System.out.println("Ciudad: " + datos[2]);
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("Error: " +e.getMessage());;
        }
    }
}
