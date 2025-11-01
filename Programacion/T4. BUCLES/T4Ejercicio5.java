import java.util.Scanner;

public class T4Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero;
        System.out.println("Introduce una cadena: ");
        numero = sc.nextLine();
        numeroInverso = " ";

        for(int i=numero.length() -1; i>=0 ;i--) {
            numeroInverso += numero.charAt(i);
        }

        if(numero.equals(numeroInverso)) {
            System.out.println(numero+" es un palindromo");
        } else {
            System.out.println(numero+" no es un palindromo");
        }
        sc.close();
    }
}