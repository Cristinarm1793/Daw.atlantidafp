import java.util.HashSet;
import java.util.Set;

public class Ejercicio7 {
    public static void ejecutar(){
        System.out.println("7. Diseña un programa que determine la intersección entre dos conjuntos y muestre los elementos comunes.");
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        a.add(1);
        a.add(2);
        a.add(3);

        b.add(2);
        b.add(3);
        b.add(4);

        Set<Integer> interseccion = new HashSet<>(a);
        interseccion.retainAll(b);

        System.out.println(interseccion);
    }
}
