import java.util.Scanner;

public class JavaEj3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                suma+=i;
            }
        }
        if (suma == num){
            System.out.println(num+ " es perfecto");
        } else {
            System.out.println(num+ " no es perfecto");
        }
        sc.close();
    }
}
