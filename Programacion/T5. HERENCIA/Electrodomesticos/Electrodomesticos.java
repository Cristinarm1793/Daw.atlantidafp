public class Electrodomesticos {
    protected double precioBase;
    protected Color color;
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomesticos() {
        this.precioBase = 100;
        this.color = Color.Blanco;
        this.consumoEnergetico = "A";
        this.peso = 10;
    }

    public Electrodomesticos(double precioBase, String colorTexto, String consumoEnergetico, double peso) {
        if (precioBase > 0) {
            this.precioBase = precioBase;
        } else {
            this.precioBase = 100;
        }
        this.color = comprobarColor(colorTexto);
        if (peso > 0) {
            this.peso = peso;
        } else {
            this.peso = 10;
        }
        comprobarConsumoEnergetico (consumoEnergetico);
    }

    private void comprobarConsumoEnergetico(String letra) {
        if (letra == null) {
            this.consumoEnergetico = "A";
        } else if (letra.equalsIgnoreCase("A+")) {
            this.consumoEnergetico = "A+";
        } else if (letra.equalsIgnoreCase("A")) {
            this.consumoEnergetico = "A";
        } else if (letra.equalsIgnoreCase("B")) {
            this.consumoEnergetico = "B";
        } else if (letra.equalsIgnoreCase("C")) {
            this.consumoEnergetico = "C";
        } else if (letra.equalsIgnoreCase("D")) {
            this.consumoEnergetico = "D";
        } else if (letra.equalsIgnoreCase("E")) {
            this.consumoEnergetico = "E";
        } else if (letra.equalsIgnoreCase("F")) {
            this.consumoEnergetico = "F";
        } else {
            this.consumoEnergetico = "A";
        }
    }

    private Color comprobarColor(String colorTexto) {
        if (colorTexto == null) {
            return Color.Blanco;
        }
        String c = colorTexto.toLowerCase().trim();

        if (c.equals("blanco")) {
            return Color.Blanco;
        } else if (c.equals("negro")) {
            return Color.Negro;
        } else if (c.equals("plateado")) {
            return Color.Plateado;
        } else if (c.equals("rojo")) {
            return Color.Rojo;
        } else if (c.equals("azul")) {
            return Color.Azul;
        } else if (c.equals("gris")) {
            return Color.Gris;
        } else {
            return Color.Blanco;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String colorTexto) {
        this.color = comprobarColor(colorTexto);
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        comprobarConsumoEnergetico (consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Precio base: " +precioBase+
                "€, Color: " +color+ ", Consumo: " +consumoEnergetico+
                ", Peso: " +peso+ "kg";
    }

    public double precioFinal() {
        double precio = precioBase;

        // Por consumo energetico
        if (consumoEnergetico.equals("A+")) {
            precio += 120;
        } else if (consumoEnergetico.equals("A")) {
            precio += 100;
        } else if (consumoEnergetico.equals("B")) {
            precio += 80;
        } else if (consumoEnergetico.equals("C")) {
            precio += 60;
        } else if (consumoEnergetico.equals("D")) {
            precio += 50;
        } else if (consumoEnergetico.equals("E")) {
            precio += 30;
        } else if (consumoEnergetico.equals("F")) {
            precio += 10;
        } else {
            System.out.println("Error");
        }

        // Por peso
        if(peso >= 0 && peso <= 19) {
            precio += 10;
        } else if (peso >= 20 && peso <= 49) {
            precio += 30;
        } else if (peso >= 50 && peso <= 79) {
            precio += 50;
        } else if (peso >= 80) {
            precio += 100;
        } else {
            System.out.println("Error");
        }

        return precio;
    }
}