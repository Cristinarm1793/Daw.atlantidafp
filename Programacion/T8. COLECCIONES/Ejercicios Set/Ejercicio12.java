import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio12 {
    public static void ejecutar(){
        System.out.println("12. Escribe un programa que almacene números aleatorios en un LinkedHashSet y garantice que no haya duplicados.");

        Random random = new Random();
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        while (numeros.size() < 10) {
            numeros.add(random.nextInt(50) + 1);
        }
        System.out.println(numeros);
    }
}
