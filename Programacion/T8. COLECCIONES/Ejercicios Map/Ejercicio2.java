import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        System.out.println("Solicita al usuario una frase y almacena la cantidad de veces que aparece cada palabra en un HashMap<String, Integer>. Luego, muestra los resultados.");

        Scanner sc = new Scanner(System.in);
        Map<String,Integer> contador = new HashMap<>();

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();

            if (contador.containsKey(palabra)) {
                contador.put(palabra, contador.get(palabra)+1);
            } else {
                contador.put(palabra, 1);
            }
        }
        System.out.println("Frecuencia de palabras: ");
        for (Map.Entry<String, Integer> entry : contador.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
