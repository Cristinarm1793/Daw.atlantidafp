import java.util.*;

public class Ejercicio10 {
    public static void ejecutar() {
        System.out.println("Simula un sistema de votación con un HashMap<String, Integer> donde la clave es el nombre del candidato y el valor es la cantidad de votos. Permite registrar votos, mostrar el total de votos por candidato y determinar el gana.");

        Scanner sc = new Scanner (System.in);
        HashMap<String, Integer> votos = new HashMap<>();
        int opcion;

        do {

            System.out.println("\n -- SISTEMA DE VOTACION -- ");
            System.out.println("1. Resgistrar voto");
            System.out.println("2. Mostrar voto");
            System.out.println("3. Mostrar ganador");
            System.out.println("4. Salir del programa");
            System.out.println("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del candidato: ");
                    String candidato = sc.nextLine();

                    if (votos.containsKey(candidato)) {
                        votos.put(candidato, votos.get(candidato)+1);
                    } else {
                        votos.put(candidato, 1);
                    }
                    break;

                case 2:
                    for (Map.Entry<String, Integer> entry : votos.entrySet()){
                        System.out.println(entry.getKey()+" → "+entry.getValue());
                    }
                    break;

                case 3:
                    String ganador = "";
                    int maxVotos = -1;

                    for (Map.Entry<String, Integer> entry : votos.entrySet()){
                        if (entry.getValue() > maxVotos) {
                            maxVotos = entry.getValue();
                            ganador = entry.getKey();
                        }
                    }

                    if (maxVotos == -1) {
                        System.out.println("Ganador: "+ganador+ " con "+maxVotos);
                    } else {
                        System.out.println("Todavia no hay votos");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default: System.out.println("Opcion incorrecta");
            }
        } while (opcion != 4);
    }
}
