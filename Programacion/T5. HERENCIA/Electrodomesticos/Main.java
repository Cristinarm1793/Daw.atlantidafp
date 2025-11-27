public class Main {
    public static void main(String[] args) {
        Lavadora lavadoraAEG = new Lavadora(400, "plateado", "PK", 30, 7);

        System.out.println("LAVADORA AEG");
        System.out.println(lavadoraAEG);
        System.out.println("Precio final: " +lavadoraAEG.precioFinal()+ "€\n");

        Television tvSamsung = new Television();

        System.out.println("TV SAMSUNG");
        System.out.println(tvSamsung);
        System.out.println("Precio final: " +tvSamsung.precioFinal()+ "€\n");

        Television tvSamsungNueva = new Television(190, "negro", "A+", 10, 24, true);

        System.out.println("TV SAMSUNG NUEVA");
        System.out.println(tvSamsungNueva);
        System.out.println("Precio final: " +tvSamsungNueva.precioFinal()+ "€");
    }
}
