import java.util.TreeSet;

public class Ejercicio2 {
    public static void ejecutar(){
        System.out.println("2. Implementa un programa que añada números del 1 al 10 a un TreeSet y luego los imprima en orden ascendente.\n");

        TreeSet<Integer> numeros = new TreeSet<>();

        for (int i = 1; i <= 10; i ++) {
            numeros.add(i);
        }
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
