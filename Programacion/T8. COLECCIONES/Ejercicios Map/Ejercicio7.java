import java.util.*;

public class Ejercicio7 {
    public static void ejecutar() {
        System.out.println("Crea un sistema de inventario con HashMap<String, Integer>, donde la clave es el nombre del producto y el valor es la cantidad disponible. Permite agregar, actualizar y productos, además de mostrar el inventario.");

        Scanner sc = new Scanner (System.in);
        Map<String, Integer> inventario = new HashMap<>();
        int opcion;

        do {

            System.out.println("\n -- INVENTARIO -- ");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir del programa");
            System.out.println("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.println("Cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    inventario.put(nombre, cantidad);
                    break;

                case 2:
                    System.out.println("Producto para actualizar: ");
                    nombre = sc.nextLine();

                    if (inventario.containsKey(nombre)) {
                        System.out.println("Nueva cantidad: ");
                        cantidad = sc.nextInt();
                        sc.nextLine();

                        inventario.put(nombre, cantidad);

                    } else {
                        System.out.println("No existe ese producto");
                    }
                    break;

                case 3:
                    System.out.println("Producto a eliminar: ");
                    nombre = sc.nextLine();

                    if (inventario.containsKey(nombre)) {
                        inventario.remove(nombre);
                        System.out.println("Producto eliminado");

                    } else {
                        System.out.println("No existe ese producto");
                    }
                    break;

                case 4:
                    for (Map.Entry<String, Integer> entry : inventario.entrySet()){
                        System.out.println(entry.getKey()+" → "+entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default: System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);
    }
}

