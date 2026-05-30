import java.io.*;

public class Enunciado1 {
    public static void leer(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            int suma = 0;
            double media  = 0;
            int numEntero = 0;

            while ((linea = br.readLine()) !=null) {
                try {
                    int num = Integer.parseInt(linea);
                    numEntero++;
                    suma = num;
                    media = ((double) suma / numEntero);

                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("linea"+linea);
            System.out.println("suma"+suma);
            System.out.println("media"+media);

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
