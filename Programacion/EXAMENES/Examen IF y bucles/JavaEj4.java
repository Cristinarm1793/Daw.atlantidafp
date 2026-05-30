import java.util.Scanner;

public class JavaEj4 {
    static void main (){
        Scanner sc = new Scanner (System.in);
        double suma = 0, nota;
        double media = 0;
        int contador = 0;

        System.out.println("Ingrese una nota (0 finaliza): ");
        nota = sc.nextDouble();

        while (nota != 0.0){
                media += nota;
                suma = media + nota;
                contador ++;
        }
        media = suma / contador;

        System.out.print("la nota media es: %.2f%n" +media);
    }
}
