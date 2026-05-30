import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GestionAlumnos {
    private ArrayList<Alumno> alumnos;

    public GestionAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void altaAlumno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el DNI del alumno: ");
        String dni = sc.nextLine();
        for(Alumno alumno : this.alumnos) {
            if (alumno.getDni().equalsIgnoreCase(dni)) {
                System.out.println("Ya esta registrado");
                return;
            }
        }
        System.out.println("Ingrese el curso del alumno: ");
        String curso = sc.nextLine();
        System.out.println("Ingrese la fecha de matricula del alumno: ");
        String fechaMatricula = sc.nextLine();
        boolean activo = sc.nextBoolean();
        Alumno nuevo = new Alumno(nombre, dni, curso, fechaMatricula, activo);
        this.alumnos.add(nuevo);
        System.out.println("Alumno nuevo");

    }
    public void bajaAlumno(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el DNI del alumno: ");
        String dni = sc.nextLine();

        for (Alumno alumno : this.alumnos){
            if (alumno.getDni().equalsIgnoreCase(dni)){
                alumno.setActivo(false);
                return;
            }
        }
    }
    public void listaActivos() {
        System.out.println("\n -- ALUMNOS ACTIVOS --");

        for (Alumno alumno : this.alumnos) {


        }



    }

    public void listaInactivos() {
        System.out.println("\n -- ALUMNOS INACTIVOS --");



    }

    public void borrarAlumno(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el DNI del alumno: ");
        String dni = sc.nextLine();

        for(Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)){
                alumnos.remove(alumno);
                System.out.println("Alumno eliminado");
                return;
            }
        }

    }
}
