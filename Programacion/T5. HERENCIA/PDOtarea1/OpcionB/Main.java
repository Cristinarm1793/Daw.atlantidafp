public class Main {
    public static void main(String[] args) {
        Empleado pedro = new Empleado("Pedro", "Pérez", 1300, 'B', 2);
        Empleado ana = new Empleado("Ana", "Díez");
        Empleado carmen = new Empleado("Carmen", "Lorenzo", 1250, 'D', 6);

        System.out.println(" = EMPLEADOS = ");
        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(carmen);
        System.out.println("Número total de empleados: "+ Empleado.getNumEmpleados());

        Empleado.setPrimaGlobal(10);
        pedro.setCategoria('C');

        System.out.println("\n = DESPUÉS DE CAMBIOS = ");
        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(carmen);
        System.out.println("Número total de empleados: "+ Empleado.getNumEmpleados());
    }
}
