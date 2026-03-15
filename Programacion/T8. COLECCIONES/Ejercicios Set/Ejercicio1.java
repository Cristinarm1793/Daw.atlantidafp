import java.util.HashSet;

public class Ejercicio1 {
    public static void ejecutar() {

        System.out.println(" 1. Crea un programa que almacene una lista de nombres en un HashSet e imprima todos los nombres en la consola.\n");
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Chary");
        nombres.add("Luigi");
        nombres.add("Cristina");
        nombres.add("Marina");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}