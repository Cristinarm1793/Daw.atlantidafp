import java.util.Scanner;

public class Loro extends Animal{
    private String colorPlumas;
    private boolean habla;

    public Loro(String nombre, String especie, int edad, String colorPlumas, boolean habla) {
        super(nombre, especie, edad);
        this.colorPlumas = colorPlumas;
        this.habla = habla;
    }

    @Override
    public void hacerSonido(){
        System.out.println("¡Hola, hola!");
    }

    @Override
    public void alimentarse(){
        System.out.println("Come semillas y frutas");
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Color plumas: "+colorPlumas);
        if (habla) {
            System.out.println("Si, habla");
        } else {
            System.out.println("No, no habla");
        }
    }
}
