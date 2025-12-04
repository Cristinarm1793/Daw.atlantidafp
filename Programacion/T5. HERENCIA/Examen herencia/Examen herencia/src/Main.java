public class Main {
    public static void main(String[] args) {
        Perro perro = Perro.crearPerroPorConsola();
        Gato gato = Gato.crearGatoPorConsola();
        Loro loro = new  Loro("paco", "exotico", 4, "verde", true);

        System.out.println("== Muestra los detalles ==");

        perro.mostrarDetalles();
        gato.mostrarDetalles();
        loro.mostrarDetalles();

        System.out.println("Comparacion de edades: ");
        perro.esMayor(gato);
        perro.esMayor(loro);
        gato.esMayor(loro);

        System.out.println("Ejecutar acciones: ");
        System.out.println("Perro: ");
        perro.hacerSonido();
        perro.alimentarse();
        Perro.moverCola(3);

        System.out.println("Gato: ");
        gato.hacerSonido();
        gato.alimentarse();
        Gato.salta(2);

        System.out.println("Loro: ");
        loro.hacerSonido();
        loro.alimentarse();


    }

}

