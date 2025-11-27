public class Empleado {
    private String nombre;
    private String apellidos;
    private double sueldoBase;
    private double retenciones;
    private char categoria;
    private static int numEmpleados = 0;
    private static double primaGlobal = 0;

    public Empleado(String nombre, String apellidos, double sueldoBase, char categoria, double retenciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        if (sueldoBase > 0) {
            this.sueldoBase = sueldoBase;
        } else {
            this.sueldoBase = 1500;
        }
        if (categoria == 'A' || categoria == 'B' || categoria == 'C' || categoria == 'D'){
            this.categoria = categoria;
        } else {
            this.categoria = 'A';
        }
        if(retenciones >= 0 && retenciones <= 100) {
            this.retenciones = retenciones;
        } else {
            this.retenciones = 5;
        }
        numEmpleados++;
    }

    public Empleado(String nombre, String apellidos) {
        this(nombre, apellidos, 1500, 'A', 5);
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public char getCategoria() {
        return categoria;
    }
    public static int getNumEmpleados() {
        return numEmpleados;
    }

    public void setCategoria(char nuevaCategoria) {
        if (nuevaCategoria == 'A' || nuevaCategoria == 'B' || nuevaCategoria == 'C' || nuevaCategoria == 'D'){
            this.categoria = nuevaCategoria;
        } else {
            System.out.println("Categoría no válida.");
        }
    }
    public static void setPrimaGlobal(double prima) {
        if (prima >= 0 && prima <= 100){
            Empleado.primaGlobal = prima;
        }
    }

    public double calcularSueldo(){
        double sueldoFinal = sueldoBase;

        if (categoria == 'A') sueldoFinal += 100;
        else if (categoria == 'B') sueldoFinal += 200;
        else if (categoria == 'C') sueldoFinal += 300;
        else if (categoria == 'D') sueldoFinal += 500;

        double prima = sueldoBase * (primaGlobal / 100);
        sueldoFinal += prima;

        double retencionCant = sueldoFinal * (retenciones / 100);
        sueldoFinal -= retencionCant;

        return  sueldoFinal;
    }
    @Override
    public String toString(){
        return  nombre+" "+apellidos+" -> Sueldo: "+ String.format("%.2f", calcularSueldo()) + "€";
    }
}
