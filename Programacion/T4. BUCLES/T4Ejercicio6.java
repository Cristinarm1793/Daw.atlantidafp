import java.util.Scanner;

public class T4Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = scanner.nextLine().toLowerCase();
        int contador = 0;

        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);
        sc.close();
    }
}