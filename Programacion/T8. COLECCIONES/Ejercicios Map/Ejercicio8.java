import java.util.*;

public class Ejercicio8 {
    public static void ejecutar() {
        System.out.println("Solicita una palabra al usuario y usa un HashMap<Character, Integer> para contar cuántas veces aparece cada carácter en la palabra.");

        Scanner sc = new Scanner (System.in);
        HashMap<Character, Integer> contador = new HashMap<>();

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (contador.containsKey(letra)) {
                contador.put(letra, contador.get(letra)+1);
            } else {
                contador.put(letra, 1);
            }
        }
        System.out.println("Frecuencia de caracteres: ");
        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}