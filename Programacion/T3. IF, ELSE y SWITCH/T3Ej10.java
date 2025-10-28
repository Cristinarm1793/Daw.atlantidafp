void main() {
    Scanner sc = new Scanner (System.in);

    double cal1, cal2, cal3, cal4, cal5, cal6;
    double peso1, peso2, peso3, peso4, peso5, peso6;

    System.out.println("Introduce la calificacion de cada materia (del 0 al 100): ");
    System.out.println("Programacion: ");
    cal1 = sc.nextDouble();
    System.out.println("Base de datos:");
    cal2 = sc.nextDouble();
    System.out.println("Lenguaje de marcas: ");
    cal3 = sc.nextDouble();
    System.out.println("Entorno de desarollo: ");
    cal4 = sc.nextDouble();
    System.out.println("Sistemas informaticos: ");
    cal5 = sc.nextDouble();
    System.out.println("Ingles: ");
    cal6 = sc.nextDouble();

    System.out.println("\nAhora introduce el peso porcentual de cada materia (la suma debe ser 100): ");
    System.out.println("Programacion: ");
    peso1 = sc.nextDouble();
    System.out.println("Base de datos:");
    peso2 = sc.nextDouble();
    System.out.println("Lenguaje de marcas: ");
    peso3 = sc.nextDouble();
    System.out.println("Entorno de desarollo: ");
    peso4 = sc.nextDouble();
    System.out.println("Sistemas informaticos: ");
    peso5 = sc.nextDouble();
    System.out.println("Ingles: ");
    peso6 = sc.nextDouble();

    double sumaPesos = peso1 + peso2 + peso3 + peso4 + peso5 + peso6;

    if (sumaPesos == 100) {
        double promedio = (cal1 * peso1 + cal2 * peso2 + cal3 * peso3 + cal4 * peso4 + cal5 * peso5 + cal6 * peso6) / 100;
        System.out.printf("\nPromedio: %.2f%%%n", promedio);
        if (promedio < 60) {
            System.out.println("Has suspendido, debes de estudiar mas.");
        } else {
            System.out.println("¡Has aprobado!, sigue asi.");
        }
    } else {
        System.out.println("Error: la suma de los pesos no es igual a 100%");
    }

}
