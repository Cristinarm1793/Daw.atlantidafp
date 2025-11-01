import java.util.Scanner;

public class T4Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contador = 0;
        String masLarga = "";

        do {
            System.out.println("Introduce una cadena ('salir' para terminar):");
            cadena = sc.nextLine();

            if (!cadena.equals("salir")) {
                contador++;
                if (cadena.length() > masLarga.length()) {
                    masLarga = cadena;
                }
            }
        } while (!cadena.equals("salir"));

        System.out.println("Cadenas ingresadas: " + contador);
        System.out.println("La cadena más larga es: " + masLarga);

        sc.close();
    }
}