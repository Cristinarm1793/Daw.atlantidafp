import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio13 {
    public static void ejecutar(){
        System.out.println("13. Implementa un programa que use un HashSet para verificar si una palabra es un anagrama de otra, ignorando el orden de las letras.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Palabra 1: ");
        String palabra1 = sc.nextLine();
        System.out.println("Palabra 2: ");
        String palabra2 = sc.nextLine();

        HashSet<Character> caracter1 = new HashSet<>();
        HashSet<Character> caracter2 = new HashSet<>();

        for (char c : palabra1.toCharArray()) caracter1.add(c);
        for (char c : palabra2.toCharArray()) caracter2.add(c);

        if (caracter1.equals(caracter2)) {
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No son anagramas");
        }
    }
}
