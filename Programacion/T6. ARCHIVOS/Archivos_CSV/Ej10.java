import java.io.*;

public class Ej10 {
    public static void main(String[] args) {
        String archivo1 = "datos.csv";
        String archivo2 = "copia_datos.csv";
        String pathDestino = "combinar.csv";

        int totalLineas = 0;

        try (BufferedReader brContarA1 = new BufferedReader(new FileReader(archivo1))) {
            while (brContarA1.readLine() !=null){
                totalLineas++;
            }
        } catch (IOException e) {
            System.out.println("Error contando lineas de " + archivo1);
            return;
        }

        try (BufferedReader brContarA2 = new BufferedReader(new FileReader(archivo2))) {
            while (brContarA2.readLine() !=null){
                totalLineas++;
            }
        } catch (IOException e) {
            System.out.println("Error contando lineas de " + archivo2);
            return;
        }

        String[] combinado = new String[totalLineas];
        int indice = 0;

        try (BufferedReader brLeerA1 = new BufferedReader(new FileReader(archivo1))) {
            String linea;

            while ((linea = brLeerA1.readLine()) !=null){
                combinado[indice] = linea;
                indice++;
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el " + archivo1);
            return;
        }

        try (BufferedReader brLeerA2 = new BufferedReader(new FileReader(archivo2))) {
            String linea;

            while ((linea = brLeerA2.readLine()) !=null){
                boolean repetida = false;

                for (int i = 0; i < indice; i++) {
                    if(combinado[i].equals(linea)) {
                        repetida = true;
                        break;
                    }
                }

                if (!repetida) {
                    combinado[indice] = linea;
                    indice++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el " + archivo2);
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathDestino))) {
            for(int i = 0; i < indice; i++){
                bw.write(combinado[i]);
                bw.newLine();
            }
            System.out.println("Archivo combinado creado");
        } catch (IOException e) {
            System.out.println("Error escribiendo archivo combinado");
        }
    }
}