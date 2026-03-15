import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Producto> productos = new HashMap<>();

        productos.put("P001", new Producto("P001", "Teclado", 35.99, 10, true));
        productos.put("P002", new Producto("P002", "Raton", 29.99, 20, true));
        productos.put("P003", new Producto("P003", "Monitor", 180.99, 33, true));
        productos.put("P004", new Producto("P004", "Auriculares", 25.99, 45, true));
        productos.put("P005", new Producto("P005", "Webcam", 20.99, 6, true));

        int opcion;

        do {

            System.out.println("\n -- MENU TIENDA ONLINE --");
            System.out.println("1. Alta de producto");
            System.out.println("2. Modificar stock");
            System.out.println("3. Listado de productos disponibles");
            System.out.println("4. Listado de productos sin stock");
            System.out.println("5. Borrar producto");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Tienda.altaProducto(productos, sc);
                    break;
                case 2:
                    Tienda.modificarStock(productos, sc);
                    break;
                case 3:
                    Tienda.listaDisponibles(productos);
                    break;
                case 4:
                    Tienda.listaSinStock(productos);
                    break;
                case 5:
                    Tienda.borrarProducto(productos, sc);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }
}