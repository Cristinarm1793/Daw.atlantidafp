import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Ejercicio9 {
    public static void ejecutar(){
        System.out.println("9. Crea un programa que almacene nombres en un HashSet y convierta el conjunto en una lista para imprimirla en orden alfabético");

        HashSet<String> nombres = new HashSet<>();
        nombres.add("Chary");
        nombres.add("Luigi");
        nombres.add("Cristina");
        nombres.add("Marina");

        ArrayList<String> lista = new ArrayList<>(nombres);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
