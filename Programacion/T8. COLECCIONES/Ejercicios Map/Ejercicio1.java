import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
    public static void ejecutar() {
        System.out.println("Crea un HashMap donde la clave sea el nombre de un país y el valor sea su capital. Añade al menos 5 países y muestra el contenido del mapa en consola.");
        Map<String,String> paises = new HashMap<>();
        paises.put("España", "Madrid");
        paises.put("Francia", "Paris");
        paises.put("Italia", "Roma");
        paises.put("Alemania", "Berlin");
        paises.put("Portugal", "Lisboa");

        System.out.println("Paises y capitales: ");

        for (Map.Entry<String, String> entry : paises.entrySet()) {
            System.out.println(entry.getKey()+"→"+entry.getValue());
        }
    }
}