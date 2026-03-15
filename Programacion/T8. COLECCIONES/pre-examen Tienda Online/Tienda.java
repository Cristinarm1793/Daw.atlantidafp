import java.util.*;

public class Tienda {

    public static void altaProducto(Map<String, Producto> productos, Scanner sc) {
        System.out.println("Introduce el codigo del producto: ");
        String codigo = sc.nextLine();

        if(!productos.containsKey(codigo)) {
            System.out.println("Introduce nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce precio del producto: ");
            double precio = sc.nextDouble();
            System.out.println("Introduce stock del producto: ");
            int stock = sc.nextInt();
            sc.nextLine();

            Producto nuevo = new Producto(codigo, nombre, precio, stock, true);
            productos.put(codigo, nuevo);
            System.out.println("Producto añadido");

        } else {
            System.out.println("Ya existe un producto con ese codigo");
        }
    }
    public static void modificarStock(Map<String, Producto> productos, Scanner sc) {
        System.out.println("Introduce el codigo del producto: ");
        String codigo = sc.nextLine();

        if(productos.containsKey(codigo)) {
            Producto producto = productos.get(codigo);
            System.out.println("Introduce nuevo stock: ");
            int nuevoStock = sc.nextInt();
            sc.nextLine();
            producto.setStock(nuevoStock);

            System.out.println("Stock actualizado");

        } else {
            System.out.println("No existe ese producto");
        }
    }

    public static void listaDisponibles(Map<String, Producto> productos) {
        ArrayList<Producto> disponibles = new ArrayList<>();
        for (Producto producto : productos.values()) {
            if (producto.isDisponible()){
                disponibles.add(producto);
            }
        }

        disponibles.sort(Comparator.comparing(Producto::getNombre));

        System.out.println("\n -- PRODUCTOS DISPONIBLES --");
        for (Producto producto : disponibles) {
            System.out.println(producto);
        }
    }

    public static void listaSinStock(Map<String, Producto> productos) {
        System.out.println("\n -- PRODUCTOS SIN STOCK --");
        for (Producto producto : productos.values()) {
            if (producto.getStock() == 0){
                System.out.println(producto);
            }
        }
    }

    public static void borrarProducto(Map<String, Producto> productos, Scanner sc) {
        System.out.println("Introduce el codigo del producto que quieres borrar: ");
        String codigo = sc.nextLine();

        if(productos.containsKey(codigo)){
            productos.remove(codigo);
            System.out.println("Producto eliminado");
        } else {
            System.out.println("No existe ese producto");
        }
    }
}
