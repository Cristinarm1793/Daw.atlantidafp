void main() {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingresos anuales: ");
    double ingresos = sc.nextDouble();
    System.out.println("Numero de dependientes: ");
    int dependientes = sc.nextInt();
    double tasaImpuestos = 0;

    if (ingresos < 20000) {
        tasaImpuestos = 0.05;
    } else if (ingresos < 40000) {
        tasaImpuestos = 0.10;
    } else if (ingresos < 80000) {
        tasaImpuestos = 0.20;
    } else {
        tasaImpuestos = 0.30;
    }

    double impuestos = ingresos * tasaImpuestos;

    if (dependientes > 3){
        impuestos *= 0.95;
    }

    System.out.println("Impuestos a pagar: "+impuestos);
    sc.close();
}
