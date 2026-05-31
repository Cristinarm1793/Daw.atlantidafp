package org.example;

public class Coche {
    private String marca;
    private int anio;
    private String color;
    private int id;

    public Coche(int id, String marca, int anio, String color) {
        this.id = id;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
    }

    public Coche(String marca, int anio, String color) {
        this.marca = marca;
        this.anio = anio;
        this.color = color;
    }

    public String getMarca() { return marca; }
    public int getAnio() { return anio; }
    public String getColor() { return color; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return id + " - " + marca + " - " + anio + " - " + color;
    }
}
