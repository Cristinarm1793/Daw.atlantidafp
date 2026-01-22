import java.io.*;

public class Ej7 {
    public static void main(String[] args) {
        String path = "datos.csv";
        String copiaPath = "copia_datos.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path));
             BufferedWriter bw = new BufferedWriter(new FileWriter(copiaPath))) {
            String linea;
            while ((linea = br.readLine()) !=null){
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Se han copiado los datos.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
