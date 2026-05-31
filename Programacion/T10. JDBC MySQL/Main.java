package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CocheRepositorio repo = new CocheRepositorio();

        /* -- MODO AUTOMATICO --
        ArrayList<Coche> coches = repo.obtenerTodos();
        System.out.println("Listado de coches:");
        for (Coche c : coches) {
            System.out.println(c);
        }

        Coche cocheNuevo = new Coche("Toyota", 2020, "Negro");
        repo.insertarCoche(cocheNuevo);

        Coche cocheActualizado = new Coche(1,"Seat", 2022, "Rojo");
        repo.actualizarCoche(cocheActualizado);

        repo.eliminarCoche(2);
         */



        int opcion;

        do {
            System.out.println("\n --- MENU COCHES ---");
            System.out.println("1. Mostrar coches");
            System.out.println("2. Insertar coches");
            System.out.println("3. Actualizar coches");
            System.out.println("4. Eliminar coches");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    mostrarCoches();
                    break;
                case 2:
                    insertarCoche();
                    break;
                case 3:
                    actualizarCoche();
                    break;
                case 4:
                    eliminarCoche();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");;
                    break;
                default:
                    System.out.println("Error, opcion incorrecta");
            }

        } while (opcion != 5);

        sc.close();
    }

    public static void mostrarCoches(){
        CocheRepositorio repo = new CocheRepositorio();
        ArrayList<Coche> coches = repo.obtenerTodos();
        System.out.println("\n--- LISTA DE COCHES ---");
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }

    public static void insertarCoche(){
        Scanner sc = new Scanner(System.in);
        CocheRepositorio repo = new CocheRepositorio();
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Año: ");
        int anio = sc.nextInt();
        sc.nextLine();
        System.out.println("Color: ");
        String color = sc.nextLine();

        Coche coche = new Coche(marca, anio, color);
        repo.insertarCoche(coche);
    }

    public static void actualizarCoche(){
        Scanner sc = new Scanner(System.in);
        CocheRepositorio repo = new CocheRepositorio();

        System.out.println("ID del coche que desea actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Actualizar marca: ");
        String marca = sc.nextLine();

        System.out.println("Actualizar año: ");
        int anio = sc.nextInt();
        sc.nextLine();

        System.out.println("Actualizar color: ");
        String color = sc.nextLine();

        Coche coche = new Coche(id, marca, anio, color);
        repo.actualizarCoche(coche);
    }
    public static void eliminarCoche(){
        Scanner sc = new Scanner (System.in);
        CocheRepositorio repo = new CocheRepositorio();
        System.out.println("Introduce ID del coche que desea eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        repo.eliminarCoche(id);
    }
}
