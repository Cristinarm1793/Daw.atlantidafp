import java.util.*;

public class Ejercicio4 {
    public static void ejecutar() {
        System.out.println("Dada una lista de nombres, almacénalos en un HashMap donde la clave sea el nombre y el valor sea la cantidad de veces que aparece en la lista.");

        List<String> nombres = Arrays.asList("Chary", "Luigi", "Chary", "Cristina", "Chary", "Luigi");
        Map<String, Integer> contador = new HashMap<>();

        for (String nombre : nombres) {
            if (contador.containsKey(nombre)) {
                contador.put(nombre, contador.get(nombre)+1);
            } else {
                contador.put(nombre, 1);
            }
        }

        System.out.println("Cantidad de veces que aparece cada nombre: ");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
