import java.util.Scanner;
public class Perro extends Animal {
    private String raza;
    private boolean entrenado;

    public Perro(String raza, boolean entrenado) {
        this.raza = raza;
        this.entrenado = entrenado;
    }

    public Perro(String nombre, String especie, int edad, String raza, boolean entrenado) {
        super(nombre, especie, edad);
        this.raza = raza;
        this.entrenado = entrenado;
    }

    public Perro() {
        this.raza = "";
        this.entrenado = true;
    }

    @Override
    public void hacerSonido(){
        System.out.println("¡Guau, guau!");
    }

    @Override
    public void alimentarse(){
        System.out.println("El perro está comiendo pienso");
    }
    public static void moverCola(int veces){
        System.out.println("¿Mueve la cola?");
        for (int i=0; i < veces; i++) {
            System.out.println("Esta moviendo la cola");
        }
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Raza: "+raza);
                if (entrenado) {
                    System.out.println("Si, lo esta");

                } else {
                    System.out.println("No, no lo esta");
                }
    }

    public static Perro crearPerroPorConsola(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce especie: ");
        String especie = sc.nextLine();
        System.out.println("Introduce edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce raza: ");
        String raza = sc.nextLine();
        System.out.println("¿Esta entrenado?");
        boolean entrenado = sc.nextBoolean();

        return new Perro (nombre, especie, edad, raza, entrenado);

    }

}
