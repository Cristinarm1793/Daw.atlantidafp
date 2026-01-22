import java.io.*;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "D:\\Programacion\\3. Ejercicios\\T6\\Archivos_CSV\\datos.csv";
        System.out.println("Ingresa varios datos (formato: nombre, edad, ciudad) y pon 'fin' cuando acabes");


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            while (true){
                String datos = sc.nextLine();
                if (datos.equalsIgnoreCase("fin")){
                    break;
                }
                bw.write(datos);
                bw.newLine();
            }

            System.out.println("Se han guardado los datos.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}