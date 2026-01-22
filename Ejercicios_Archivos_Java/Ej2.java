import java.io.*;

public class Ej2 {
   public static void main(String[] args) {
       String path = "D:\\Programacion\\3. Ejercicios\\T6\\Ejercicios_Archivos_Java\\archivo1.txt";

       try (BufferedReader br = new BufferedReader(new FileReader(path))) {
           String linea;
           while ((linea = br.readLine()) !=null){
               System.out.println(linea);
           }
       } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
       }
   }
}
