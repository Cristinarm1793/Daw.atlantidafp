import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion;

        do {

            System.out.println("\n -- MENU EJERCICIOS MAP -- ");
            System.out.println("1. Crear y mostrar un Map de países y capitale");
            System.out.println("2. Contar la frecuencia de palabras en una frase");
            System.out.println("3. Agenda telefónica con Map");
            System.out.println("4. Convertir una lista en un Map");
            System.out.println("5. Traductor con Map");
            System.out.println("6. Notas de estudiantes");
            System.out.println("7. Inventario de productos");
            System.out.println("8. Contar caracteres en una palabra");
            System.out.println("9. Gestión de empleados con Map");
            System.out.println("10. Sistema de votaciones");
            System.out.println("11. Salir");
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
                case 11: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion incorrecta");
            }
        } while (opcion != 11);
        sc.close();
    }
}
