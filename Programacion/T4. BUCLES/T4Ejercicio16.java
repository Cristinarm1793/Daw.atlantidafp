import java.util.Scanner;

public class T4Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un numero entero: ");
        int num = sc.nextInt();
        int suma = 0;

        if (num < 0) {
            num = num * -1;
        }

        do {
            int digito = num % 10;
            suma += digito;
            num /= 10;
        }while (num > 0);

        System.out.println("La suma de los digitos es: "+suma);
        sc.close();
    }
}
