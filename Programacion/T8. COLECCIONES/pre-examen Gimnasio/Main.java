import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Socio> socios = new ArrayList<>();


        socios.add(new Socio("Ana", "34143567M", 34, "01/01/2026", true));
        socios.add(new Socio("Juan", "87639020L", 23, "10/05/2024", true));
        socios.add(new Socio("Victor", "33676819V", 57, "05/01/2019", true));
        socios.add(new Socio("Sonia", "21365891E", 19, "06/03/2026", true));
        socios.add(new Socio("Francisco", "34678555A", 41, "07/09/2020", true));

        int opcion;

        do {

            System.out.println("-- MENU GIMNASIO --");
            System.out.println("1. Alta de socio");
            System.out.println("2. Baja de socio");
            System.out.println("3. Listado de socios activos");
            System.out.println("4. Listado de socios inactivos");
            System.out.println("5. Borrar socio");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    Gestion.altaSocio(socios, sc);
                    break;
                case 2:
                    Gestion.bajaSocio(socios, sc);
                    break;
                case 3:
                    Gestion.listaActivos(socios);
                    break;
                case 4:
                    Gestion.listaInactivos(socios);
                    break;
                case 5:
                    Gestion.borrarSocio(socios, sc);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 6);
    }
}

