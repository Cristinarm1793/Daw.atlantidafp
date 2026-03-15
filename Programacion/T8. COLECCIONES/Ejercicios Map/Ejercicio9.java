import java.util.*;

public class Ejercicio9 {
    public static void ejecutar() {
        System.out.println("Crea un TreeMap que almacene empleados ordenados por su número de identificación (DNI o ID). Cada empleado tendrá un nombre y un salario. Permite agregar empleados, buscar por ID y listar todos ordenados.");
        Scanner sc = new Scanner (System.in);
        TreeMap<String, Empleado> empleados = new TreeMap<>();
        int opcion;

        do {

            System.out.println("\n -- GESTION DE EMPLEADOS -- ");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Buscar empleado por ID");
            System.out.println("3. Lista de empleados");
            System.out.println("4. Salir del programa");
            System.out.println("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("ID del empleado: ");
                    String id = sc.nextLine();

                    System.out.println("Nombre del empleado: ");
                    String nombre = sc.nextLine();

                    System.out.println("Salario del empleado: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    empleados.put(id, new Empleado (nombre, salario));
                    break;

                case 2:
                    System.out.println("Buscar por ID: ");
                    id = sc.nextLine();

                    if (empleados.containsKey(id)) {
                        System.out.println(empleados.get(id));
                    } else {
                        System.out.println("No existe ese empleado");
                    }
                    break;

                case 3:
                    for (Map.Entry<String,Empleado> entry : empleados.entrySet()){
                        System.out.println(entry.getKey()+" → "+entry.getValue());
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
