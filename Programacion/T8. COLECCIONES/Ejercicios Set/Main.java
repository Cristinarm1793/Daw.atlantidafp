import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion;

        do {

            System.out.println("\n -- MENU EJERCICIOS SET -- ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("14. Ejercicio 14");
            System.out.println("15. Ejercicio 15");
            System.out.println("16. Salir");
            System.out.println("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: Ejercicio1.ejecutar(); break;
                case 2: Ejercicio2.ejecutar(); break;
                case 3: Ejercicio3.ejecutar(); break;
                case 4: Ejercicio4.ejecutar(); break;
                case 5: Ejercicio5.ejecutar(); break;
                case 6: Ejercicio6.ejecutar(); break;
                case 7: Ejercicio7.ejecutar(); break;
                case 8: Ejercicio8.ejecutar(); break;
                case 9: Ejercicio9.ejecutar(); break;
                case 10: Ejercicio10.ejecutar(); break;
                case 11: Ejercicio11.ejecutar(); break;
                case 12: Ejercicio12.ejecutar(); break;
                case 13: Ejercicio13.ejecutar(); break;
                case 14: Ejercicio14.ejecutar(); break;
                case 15: Ejercicio15.ejecutar(); break;
                case 16: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion incorrecta");
            }
        } while (opcion != 16);
        sc.close();
    }
}
