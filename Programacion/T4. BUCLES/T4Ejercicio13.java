import java.util.Scanner;
import java.util.Random;

public class T4Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String pass = "";

        System.out.println("¿De cuantos caracteres quieres tu contaseña?");
        int longitud = sc.nextInt();

        for (int i = 0 ; i < longitud; i++){
            int opcion = azar.nextInt(caracteres.length());
            pass += caracteres.charAt(opcion);
        }
        System.out.println("Tu contraseña es: " +pass);
        sc.close();
    }
}
