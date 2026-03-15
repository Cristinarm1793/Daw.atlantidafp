import java.util.TreeSet;

public class Ejercicio8 {
    public static void ejecutar(){
        System.out.println("8. Escribe un programa que elimine todos los elementos de un TreeSet y confirme que el conjunto está vacío.");

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(5);
        numeros.add(10);

        numeros.clear();

        System.out.println("Vacio? "+ numeros.isEmpty());
    }
}
