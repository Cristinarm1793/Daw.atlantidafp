import java.util.TreeSet;

public class Ejercicio11 {
    public static void ejecutar(){
        System.out.println("11. Diseña un programa que verifique si un TreeSet es un subconjunto de otro TreeSet.");
        TreeSet<Integer> grande = new TreeSet<>();
        TreeSet<Integer> sub = new TreeSet<>();

        grande.add(1);
        grande.add(2);
        grande.add(3);

        sub.add(1);
        sub.add(2);

        System.out.println(grande.containsAll(sub));
    }
}
