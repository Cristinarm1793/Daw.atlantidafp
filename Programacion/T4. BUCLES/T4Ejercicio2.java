import java.util.Scanner;

public class T4Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        System.out.println("Introduce una letra para contar: ");
        char letra = sc.nextLine().charAt(0).toLowerCase();
        int contador = 0;

        for (int i=0; i<cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra '"+letra+"' aparece "+contador+" veces");
        sc.close();
    }
}