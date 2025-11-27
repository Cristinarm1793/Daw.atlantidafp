public class Television extends Electrodomesticos {
    private int resolucion;
    private boolean netflix;

    public Television() {
        super();
        this.resolucion = 20;
        this.netflix = false;
    }

    public Television(double precioBase, String colorTexto, String consumoEnergetico, double peso, int resolucion, boolean netflix) {
        super(precioBase, colorTexto, consumoEnergetico, peso);
        if (resolucion > 0) {
            this.resolucion = resolucion;
        } else {
            this.resolucion = 20;
        }
        this.netflix = netflix;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isNetflix() {
        return netflix;
    }
    @Override
    public String toString() {
        return "Television > Precio base: " +precioBase+
                "€, Color: " +color+ ", Consumo: " +consumoEnergetico+
                ", Peso: " +peso+ "kg, Resolucion: " +resolucion+
                "\", Netflix: " +netflix;
    }
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 20) {
            precio += precioBase * 0.30;
        }

        if (netflix) {
            precio += 60;
        }
        return precio;
    }
}
