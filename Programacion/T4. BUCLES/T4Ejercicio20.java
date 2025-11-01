public class T4Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Multiplos de 5 entre 1 y 100: ");

        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}