import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Gestion {
    public static void altaSocio(ArrayList<Socio> socios, Scanner sc) {
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el DNI: ");
        String dni = sc.nextLine();

        boolean existe = false;

        for (Socio socio : socios) {
            if(socio.getDni().equalsIgnoreCase(dni)) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Introduce la edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la fecha de inscripcion: ");
            String fecha = sc.nextLine();

            Socio nuevo = new Socio(nombre, dni, edad, fecha, true);
            socios.add(nuevo);

            System.out.println("Socio dado de alta.");
        } else {
            System.out.println("Error, ya existe socio con ese DNI.");
        }
    }

    public static void bajaSocio(ArrayList<Socio> socios, Scanner sc) {
        System.out.println("Introduce el DNI del socio para dar de baja: ");
        String dni = sc.nextLine();

        boolean encontrado = false;

        for (Socio socio : socios) {
            if(socio.getDni().equalsIgnoreCase(dni)) {
                socio.setActivo(false);
                encontrado = true;
                System.out.println("Socio dado de baja.");
            }
        }
        if (!encontrado) {
            System.out.println("No hay socio con ese DNI.");
        }
    }
    public static void listaActivos(ArrayList<Socio> socios) {
        ArrayList<Socio> activos = new ArrayList<>();
        for(Socio socio : socios) {
            if(socio.isActivo()){
                activos.add(socio);
            }
        }
        activos.sort(Comparator.comparing(Socio::getNombre));

        System.out.println("\n -- SOCIOS ACTIVOS --");
        for (Socio socio : activos) {
            System.out.println(socio);
        }
    }
    public static void listaInactivos(ArrayList<Socio> socios) {
        ArrayList<Socio> inactivos = new ArrayList<>();
        for(Socio socio : socios) {
            if(!socio.isActivo()){
                inactivos.add(socio);
            }
        }
        inactivos.sort(Comparator.comparing(Socio::getDni));

        System.out.println("\n -- SOCIOS INACTIVOS --");
        for (Socio socio : inactivos) {
            System.out.println(socio);
        }
    }
    public static void borrarSocio(ArrayList<Socio> socios, Scanner sc) {
        System.out.println("Introduce el DNI del socio que quiere borrar: ");
        String dni = sc.nextLine();

        boolean eliminado = false;

        for (int i = 0; i < socios.size(); i++){
            if (socios.get(i).getDni().equalsIgnoreCase(dni)) {
                socios.remove(i);
                eliminado = true;
                System.out.println("Socio eliminado");
                break;
            }
        }
        if (!eliminado){
            System.out.println("No hay socio con ese DNI.");
        }
    }
}

