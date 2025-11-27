public class Lavadora extends Electrodomesticos {
    private int carga;

    public Lavadora () {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, String colorTexto, String consumoEnergetico, double peso, int carga) {
        super(precioBase, colorTexto, consumoEnergetico, peso);
        if (carga > 0) {
            this.carga = carga;
        } else {
            this.carga = 5;
        }
    }

    public int getCarga() {
        return carga;
    }
    @Override
    public String toString() {
        return "Lavadora > Precio base: " +precioBase+
                "€, Color: " +color+ ", Consumo: " +consumoEnergetico+
                ", Peso: " +peso+ "kg, Carga: " +carga+ "kg";
    }
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();

        if (carga > 6) {
            precio += 50;
        }

        return precio;
    }
}
