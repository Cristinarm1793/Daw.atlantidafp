import java.util.Random;
import java.util.Scanner;

public class T4Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random aleatorio = new Random();

        int numSecreto = aleatorio.nextInt(10)+1;
        int num;

        System.out.println("¡Advina el numero entre 1 y 100!");

        do{
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();

            if (num < numSecreto) {
                System.out.println("El numero es mas grande");
            } else if (num > numSecreto) {
                System.out.println("El numero es mas pequeño");
            } else {
                System.out.println("¡Correcto! has adivinado el número");
            }
        } while (num!= numSecreto);

        sc.close();
    }
}