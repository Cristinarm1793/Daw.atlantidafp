import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar(){
        System.out.println("3. Diseña un programa que lea una serie de palabras desde la entrada del usuario y las almacene en un LinkedHashSet, asegurando que se mantenga el orden de inserción.");
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> palabras = new LinkedHashSet<>();

        System.out.println("Cuantas palabras?: ");

        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Palabra: ");
            palabras.add(sc.nextLine());
        }
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
