import java.util.*;

public class Ejercicio5 {
    public static void ejecutar() {
        System.out.println("Crea un diccionario español-inglés con HashMap. Permite al usuario ingresar una palabra en español y muestra su traducción en inglés. Si la palabra no está en el diccionario, indícalo.");

        Scanner sc = new Scanner (System.in);
        Map<String, String> diccionario = new HashMap<>();

        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("casa", "house");
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");

        System.out.println("Palabras en español: ");
        String palabra = sc.nextLine().toLowerCase();

        if (diccionario.containsKey(palabra)) {
            System.out.println("Traduccion: "+diccionario.get(palabra));
        } else {
            System.out.println("La palabra no esta en el diccionario");
        }
    }
}
