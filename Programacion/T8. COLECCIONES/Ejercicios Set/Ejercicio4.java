import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar(){
        System.out.println("4. Escribe un programa que compruebe si un elemento específico existe en un HashSet dado.");
        Scanner sc = new Scanner(System.in);

        HashSet<String> colores = new HashSet<>();
        colores.add("morado");
        colores.add("verde");
        colores.add("azul");
        colores.add("rojo");

        System.out.println("Color a buscar: ");
        String buscar = sc.nextLine();

        if (colores.contains(buscar)){
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
    }
}
