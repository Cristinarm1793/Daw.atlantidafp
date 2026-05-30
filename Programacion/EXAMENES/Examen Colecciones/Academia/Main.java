import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Ana", "13245336T", "1ºB", "01/01/2021", true));
        alumnos.add(new Alumno("Juan", "35678923M", "1ºA", "01/01/2021", true));
        alumnos.add(new Alumno("Antonio", "45728908J", "2ºB", "01/01/2021", true));
        alumnos.add(new Alumno("Pepe", "23567981M", "2ºB", "01/01/2021", true));
        alumnos.add(new Alumno("Maria", "12345678P", "2ºA", "01/01/2021", true));
        GestionAlumnos ge = new GestionAlumnos(alumnos);

        int opcion;

        do {
            System.out.println("-- MENU ACADEMIA --");
            System.out.println("1. Alta de alumno");
            System.out.println("2. Baja de alumno");
            System.out.println("3. Listado de alumnos activos");
            System.out.println("4. Listado de alumnos inactivos");
            System.out.println("5. Borrar alumno");
            System.out.println("6. Salir del programa");
            System.out.println("Elige una opcion.");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    ge.altaAlumno();
                    break;
                case 2:
                    ge.bajaAlumno();
                    break;
                case 3:
                    ge.listaActivos();
                    break;
                case 4:
                    ge.listaInactivos();
                    break;
                case 5:
                    ge.borrarAlumno();
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 6);
    }
}



