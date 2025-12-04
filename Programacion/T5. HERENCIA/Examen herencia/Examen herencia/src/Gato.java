import java.util.Scanner;
public class Gato extends Animal {
    private int vidasRestantes;
    private boolean tieneCola;

    public Gato(int vidasRestantes, boolean entrenado) {
        this.vidasRestantes = vidasRestantes;
        this.tieneCola = entrenado;
    }

    public Gato(String nombre, String especie, int edad, int vidasRestantes, boolean entrenado) {
        super(nombre, especie, edad);
        this.vidasRestantes = vidasRestantes;
        this.tieneCola = entrenado;
    }

    public Gato() {
        this.tieneCola = true;
        this.vidasRestantes = 7;
    }

    @Override
    public void hacerSonido(){
        System.out.println("miau miau");
    }

    @Override
    public void alimentarse(){
        System.out.println("El gato come pescado");
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Vidas Restantes: "+vidasRestantes);
        if (tieneCola){
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    public static void salta(int veces){
        System.out.println("¿Esta saltando?");
        for (int i=0; i < veces; i++) {
            System.out.println("Esta moviendo la cola");
        }
    }

    public static Gato crearGatoPorConsola(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce especie: ");
        String especie = sc.nextLine();
        System.out.println("Introduce edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce vidas restantes: ");
        int vidasRestantes = sc.nextInt();
        System.out.println("¿Tiene cola?");
        boolean tieneCola = sc.nextBoolean();

        return new Gato (nombre, especie, edad, vidasRestantes, tieneCola);

    }

}
