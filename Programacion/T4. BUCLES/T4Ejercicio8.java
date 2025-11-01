import java.util.Scanner;
import java.util.Random;

public class T4Ejercicio8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        do {
            System.out.println("Adivina el número (entre 1 y 100):");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto.");
            } else {
                System.out.println("¡Correcto!");
            }
        } while (intento != numeroSecreto);

        sc.close;
    }
}