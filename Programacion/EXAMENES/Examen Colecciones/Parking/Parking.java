import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    Map<String, Vehiculo>  parkingMap;

    public Parking(Map<String, Vehiculo> vehiculoMap) {
        this.parkingMap = vehiculoMap;
    }
    public void entradaVehiculo (){
        Scanner sc = new Scanner (System.in);
        System.out.println("registro matricula");
        String matricula = sc.nextLine();

        if(parkingMap.containsKey(matricula)) {
            System.out.println("Este vehiculo esta registrado: ");
            return;
        }
        System.out.println("Introduce el propietario del vehiculo: ");
        String propietario = sc.nextLine();
        System.out.println("Ingrese la hora de entrada: ");
        String horaEntrada  = sc.nextLine();
        System.out.println("Ingrede el numero de plaza: ");
        int plaza = sc.nextInt();
        sc.nextLine();

        boolean pagado = false;

        Vehiculo nuevo = new Vehiculo(matricula, propietario, horaEntrada, plaza, pagado);
        this.parkingMap.put(nuevo);
        System.out.println("Entrada Vehiculo");

    }

    public void salidaVehiculo(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Busca vehiculo por matricula: ");
        String matricula = sc.nextLine();

        for(Vehiculo vehiculo : vehiculoMap){

        }

    }
}
