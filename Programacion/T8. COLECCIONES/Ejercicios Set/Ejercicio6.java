import java.util.HashSet;
import java.util.Set;

public class Ejercicio6 {
    public static void ejecutar(){
        System.out.println("6. Crea un programa que combine dos conjuntos (`Set`) y elimine los elementos duplicados resultantes");

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Chary");
        set1.add("Cristina");

        set2.add("Cristina");
        set2.add("Luigi");

        Set<String> combinado = new HashSet<>(set1);
        combinado.addAll(set2);

        System.out.println(combinado);
    }
}
