import java.util.HashSet;
import java.util.Set;

public class Ejercicio15 {
    public static void ejecutar(){
        System.out.println("15. Crea un programa que compare dos HashSet y muestre los elementos que son exclusivos de cada uno.");

        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();

        a.add("Chary");
        a.add("Cristina");

        b.add("Cristina");
        b.add("Luigi");

        Set<String> soloA = new HashSet<>(a);
        soloA.removeAll(b);

        Set<String> soloB = new HashSet<>(b);
        soloB.removeAll(a);

        System.out.println("Solo en A: "+soloA);
        System.out.println("Solo en B: "+soloB);
    }
}
