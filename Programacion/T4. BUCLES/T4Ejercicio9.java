import java.util.Scanner;

public class T4Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número N:");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los números pares es: " + suma);

        sc.close();
    }
}