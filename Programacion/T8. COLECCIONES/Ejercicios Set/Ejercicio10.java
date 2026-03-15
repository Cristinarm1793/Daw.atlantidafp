import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio10 {
    public static void ejecutar(){
        System.out.println("10. Implementa un programa que cuente la cantidad de elementos únicos en una lista utilizando un HashSet.");

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Chary");
        lista.add("Luigi");
        lista.add("Cristina");
        lista.add("Marina");

        HashSet<String> unicos = new HashSet<>(lista);
        System.out.println("Unicos: "+unicos.size());
    }
}
