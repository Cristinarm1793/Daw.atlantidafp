import java.util.Scanner;

public class T4Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean palabra = false;
        int contadorPalabras = 0;
        char letra;

        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine().trim();

        for (int i=0; i<cadena.length(); i++){
            letra = cadena.charAt(i);

            if (letra != ' '){
                if ((!palabra)){
                    contadorPalabras++;
                    palabra = true;
                }
            } else {
                palabra = false;
            }
        }
        System.out.println("La cantidad de palabras es: " +contadorPalabras);
        sc.close();
    }
}
