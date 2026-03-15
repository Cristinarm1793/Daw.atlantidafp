import java.util.*;

public class Ejercicio6 {
    public static void ejecutar() {
        System.out.println("Crea un HashMap donde la clave sea el nombre de un estudiante y el valor sea una lista de notas (ArrayList<Integer>). Permite ingresar varios estudiantes con sus notas y muestra el promedio de cada uno.");

        Scanner sc = new Scanner (System.in);
        HashMap<String, ArrayList<Integer>> estudiantes = new HashMap<>();

        System.out.println("Cuantos estudiantes quieres introducir?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre de estudiante: ");
            String nombre = sc.nextLine();

            ArrayList<Integer> notas = new ArrayList<>();

            System.out.println("Cuanta nota tiene?: ");
            int numNotas = sc.nextInt();

            for (int j = 0; j < numNotas; j++) {
                System.out.println("Introduce nota "+(j+1)+": ");
                notas.add(sc.nextInt());
            }
            sc.nextLine();
            estudiantes.put(nombre, notas);
        }

        System.out.println("Promedio de cada estudiante: ");
        for (Map.Entry<String, ArrayList<Integer>> entry : estudiantes.entrySet()) {
            String nombre = entry.getKey();
            ArrayList<Integer> notas = entry.getValue();

            int suma = 0;
            for (Integer nota : notas) {
                suma += nota;
            }

            double promedio = (double) suma / notas.size();
            System.out.println(nombre+ " → " +promedio);
        }
    }
}