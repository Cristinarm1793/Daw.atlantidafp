import java.util.Scanner;

public class T4Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if (Character.isLowerCase(c)){
                resultado += Character.toUpperCase(c);

            } else if (Character.isUpperCase(c)) {
                resultado += Character.toLowerCase(c);

            }else {
                resultado += c;
            }
        }
        System.out.println("La cadena modificada es: " +resultado);
        sc.close();
    }
}
