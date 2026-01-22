import java.io.*;

public class Ej9 {
    public static void main(String[] args) {
        String pathOrigen = "datos.csv";
        String pathDestino = "ordenado.csv";

        int totalLineas = 0;

        try(BufferedReader brContar = new BufferedReader(new FileReader(pathOrigen))) {
            while (brContar.readLine() !=null){
                totalLineas++;
            }

        } catch (IOException e) {
            System.out.println("Error contando lineas " + e.getMessage());
            return;
        }

        String[] lineas = new String[totalLineas];

        try (BufferedReader brLeer = new BufferedReader(new FileReader(pathOrigen))) {
            String linea;
            int i = 0;

            while ((linea = brLeer.readLine()) !=null) {
                lineas[i] = linea;
                i++;
            }

        } catch (IOException e) {
            System.out.println("Error de lectura " + e.getMessage());
            return;
        }

        for (int i = 0; i < lineas.length -1; i++) {
            for (int j = 0; j < lineas.length -1 -i; j++) {
                String nombre1 = lineas[j].split(",")[0].trim();
                String nombre2 = lineas[j + 1].split(",")[0].trim();

                if (nombre1.compareToIgnoreCase(nombre2) > 0){
                    String aux = lineas[j];
                    lineas[j] = lineas[j + 1];
                    lineas[j + 1] = aux;
                } else {
                    System.out.println("ya esta ordenado");
                }
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathDestino))) {
            for (int i = 0; i < lineas.length; i++){
                bw.write(lineas[i]);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error de escritura " + e.getMessage());
            return;
        }
        System.out.println("CSV ordenado");
    }
}
