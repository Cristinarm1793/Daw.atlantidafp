import java.util.Scanner;
public class T4Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto que desees invertir: ");
        String cadena = sc.nextLine();
        String invertida = "";

        for (int i = cadena.length() -1; i>=0; i--) {
            invertida += cadena.charAt(i);
        }
        System.out.println("El texto inverso es: "+invertida);
        sc.close();
    }
}