import java.util.Random;

public class T4Ejercicio19 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int num;
        int suma = 0;
        double media;

        for (int i = 1; i <= 10; i++) {
            num = aleatorio.nextInt(100) + 1;
            System.out.println("Número " + i + ": " + num);
            suma += num;
        }
        media = suma /10.0;
        System.out.println("La media es: " +media);
    }
}
