import java.util.Scanner;

public class T4Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine().toLowerCase();
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    contador++;
                }
            }
        }
        System.out.println("Tiene " +contador+ " consonantes.");
        sc.close();
    }
}