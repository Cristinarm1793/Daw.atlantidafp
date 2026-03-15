import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        System.out.println("Crea un programa que almacene nombres y números de teléfono en un HashMap. Permite agregar contactos, buscar un número por nombre y mostrar todos los contactos almacenados.");

        Scanner sc = new Scanner (System.in);
        Map<String, String> agenda = new HashMap<>();
        int opcion;

        do {

            System.out.println("\n -- AGENDA -- ");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar agenda");
            System.out.println("4. Salir del programa");
            System.out.println("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Telefono: ");
                    String telefono = sc.nextLine();

                    agenda.put(nombre, telefono);
                    break;

                case 2:
                    System.out.println("Buscar por nombre: ");
                    nombre = sc.nextLine();

                    if (agenda.containsKey(nombre)) {
                        System.out.println("Telefono: "+agenda.get(nombre));
                    } else {
                        System.out.println("No existe");
                    }
                    break;

                case 3:
                    for (Map.Entry<String, String> entry : agenda.entrySet()){
                        System.out.println(entry.getKey()+" → "+entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default: System.out.println("Opcion incorrecta");
            }
        } while (opcion != 4);
    }
}