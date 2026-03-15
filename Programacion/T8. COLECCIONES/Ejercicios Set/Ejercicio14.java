import java.util.HashSet;
import java.util.Set;

public class Ejercicio14 {
    public static void ejecutar(){
        System.out.println("14. Diseña un programa que copie todos los elementos de un conjunto en otro conjunto.");
        Set<String> origen = new HashSet<>();

        origen.add("Java");
        origen.add("Python");

        Set<String> copia = new HashSet<>(origen);

        System.out.println(copia);
    }
}
