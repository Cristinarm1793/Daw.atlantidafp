void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dia: ");
    int dia = sc.nextInt();
    System.out.println("Mes: ");
    int mes = sc.nextInt();
    System.out.println("Año: ");
    int anio = sc.nextInt();
    String  nombreMes = "";
    boolean valido = true;

    switch (mes) {
        case 1: nombreMes = "Enero";
        case 3: nombreMes = "Marzo";
        case 5: nombreMes = "Mayo";
        case 7: nombreMes = "Julio";
        case 8: nombreMes = "Agosto";
        case 10: nombreMes = "Octubre";
        case 12: nombreMes = "Diciembre";
            if (dia < 1 || dia > 31){
                valido = false;
            }
            break;

        case 4: nombreMes = "Abril";
        case 6: nombreMes = "Junio";
        case 9: nombreMes = "Septiembre";
        case 11: nombreMes = "Noviembre";
            if (dia < 1 || dia > 30){
                valido = false;
            }
            break;

        case 2:
            nombreMes = "Febrero";
            boolean bisiesto = false;
            if (anio % 4 == 0) {
                if (anio % 100 == 0) {
                    if (anio % 400 == 0) {
                        bisiesto = true;
                    }
                } else {
                    bisiesto = true;
                }
            }
            if (bisiesto) {
                if (dia < 1 || dia > 29) {
                    valido = false;
                }
            } else {
                if (dia < 1 || dia > 28) {
                    valido = false;
                }
            }
            break;

        default:
            valido = false;
            break;
    }
    if (valido) {
        System.out.println("Fecha valida: "+dia+"/"+nombreMes+"/"+anio);
    } else {
        System.out.println("Fecha no valida");
    }
}
