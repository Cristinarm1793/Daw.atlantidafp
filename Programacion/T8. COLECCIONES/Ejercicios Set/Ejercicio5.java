import java.util.HashSet;

public class Ejercicio5 {
    public static void ejecutar(){
        System.out.println("5. Implementa un programa que elimine un elemento específico de un HashSet y luego muestre el contenido restante.");

        HashSet<String> frutas = new HashSet<>();
        frutas.add("Arandanos");
        frutas.add("Platano");
        frutas.add("Cereza");
        frutas.add("Sandia");

        frutas.remove("Platano");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
