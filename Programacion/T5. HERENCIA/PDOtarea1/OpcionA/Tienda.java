public class Tienda {
    private String producto;
    private double precio;
    private double iva;
    private double descuento;
    private static int numProducto = 0;
    private static double descuentoGlobal = 0;

    public Tienda(String producto, double precio, double iva, double descuento) {
        this.producto = producto;
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }
        if (iva >= 0 && iva <= 100){
            this.iva = iva;
        } else {
            this.iva = 21;
        }
        if (descuento >= 0 && descuento <= 100) {
            this.descuento = descuento;
        } else {
            this.descuento = 0;
        }
        numProducto++;
    }

    public Tienda(String producto){
        this(producto, 10, 21, 0);
    }

    public String getProducto() {
        return producto;
    }
    public double getPrecio() {
        return precio;
    }
    public double getIva() {
        return iva;
    }
    public double getDescuento() {
        return descuento;
    }
    public static int getNumProducto() {
        return numProducto;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }
    }

    public static void setDescuentoGlobal(double descuentoGlobal) {
        Tienda.descuentoGlobal = descuentoGlobal;
    }

    public double calcularPrecio(){
        double descuentoFinal = Math.max(this.descuento, descuentoGlobal);
        double precioDescuento = precio * (1 - descuentoFinal / 100);
        double precioFinal = precioDescuento * (1 + iva / 100);
        return precioFinal;
    }
    @Override
    public String toString() {
        return "Producto: " +producto+ " , Precio Final: " +String.format("%.2f", calcularPrecio()) + "€";
    }
}
