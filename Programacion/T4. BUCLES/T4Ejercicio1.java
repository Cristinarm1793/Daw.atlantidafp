import java.util.Scanner;

public class T4Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine().trim();
        int contador=0;

        for (int i=0; i<cadena.length(); i++) {
            contador++;
        }
        System.out.println("La cadena tiene "+contador+" caracteres");
        sc.close();
    }
}