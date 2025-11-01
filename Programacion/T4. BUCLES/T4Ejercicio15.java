import java.util.Scanner;

public class T4Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieras saber cuantos dígitos contiene");
        int num = sc.nextInt();
        int contador = 0;

        if (num == 0) {
            contador = 1;

        } else {
            if (num < 0) {
                num = num * -1;
            }

            while (num > 0) {
                num = num / 10;
                contador++;
            }
        }

        System.out.println("La cantidad de digitos es: " +contador);
        sc.close();
    }
}
