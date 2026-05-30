import java.io.*;

public class Enunciado2 {
    public static void leerDatosPersonas(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            int contadorMenores = 0;
            int contadorMayores = 0;


            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length != 3) {
                    String nombre = datos[0];
                    String localidad = datos[1];
                    String edad = datos[2];

                    try {
                        int menores = Integer.parseInt(linea);
                        if (menores <= 30) {
                            contadorMenores++;
                        } else {
                            contadorMayores++;
                        }

                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }


                    System.out.println("Nombre " + nombre + "Localidad " + localidad + "Edad " + edad);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void escribirDatosPersonas (String ruta, String nuevaRuta){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nuevaRuta))) {
            bw.write("linea");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}




