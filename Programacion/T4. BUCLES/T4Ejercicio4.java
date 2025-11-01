import java.util.Scanner;
import java.util.Random;

public class T4Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();
        System.out.println("Introduce la longitud de la cadena: ");
        int n = sc.nextInt();
        String cadenaAleatoria= "";
        String caracteres = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < n; i++){
            int aleatorio = azar.nextInt(caracteres.length());
            cadenaAleatoria += caracteres.charAt(aleatorio);
        }
        System.out.println("Cadena aleatoria: "+cadenaAleatoria);
        sc.close();
    }
}