public class Coche {
    private String marca;
    private int anio;
    private String color;

    public Coche(String marca, int anio, String color) {
        this.marca = marca;
        this.anio = anio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }


    public String getColor() {
        return color;
    }
}
