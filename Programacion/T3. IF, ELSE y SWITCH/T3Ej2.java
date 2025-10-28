void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Precio producto");
    double precio = sc.nextDouble();
    System.out.println("Tipo cliente");
    String cliente = sc.next().toLowerCase();
    double descuento = 0;

    if (cliente.equals("regular")) {
        descuento = 0.05;
    } else if (cliente.equals("premium")) {
        descuento = 0.10;
    } else if (cliente.equals("vip")) {
        descuento = 0.20;
        if (precio > 500) {
            descuento += 0.05;
        }
    }

    double tDescuento = precio * descuento;
    System.out.println("Descuento aplicado: "+tDescuento);
    double pFinal = precio - tDescuento;
    System.out.println("Precio final: "+pFinal);

    sc.close();
}
