public class Main {
    public static void main(String[] args) {
        Tienda impresora = new Tienda("Impresora HP", 100, 21,5);
        Tienda raton = new Tienda("Ratón Logitech");
        Tienda libro = new Tienda ("Libro Java", 20, 4, 15);

        System.out.println(" PRODUCTOS ");
        System.out.println(impresora);
        System.out.println(raton);
        System.out.println(libro);
        System.out.println("Productos en tienda: " +Tienda.getNumProducto());

        Tienda.setDescuentoGlobal(10);
        raton.setPrecio(12);

        System.out.println("\n BLACK FRIDAY ");
        System.out.println(impresora);
        System.out.println(raton);
        System.out.println(libro);
        System.out.println("Productos en tienda: " +Tienda.getNumProducto());
    }
}
