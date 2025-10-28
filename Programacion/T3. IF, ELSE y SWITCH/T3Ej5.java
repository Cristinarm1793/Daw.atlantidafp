void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Longitud del primer lado: ");
    double lado1 = sc.nextDouble();
    System.out.println("Longitud del segundo lado: ");
    double lado2 = sc.nextDouble();
    System.out.println("Longitud del tercer lado: ");
    double lado3 = sc.nextDouble();

    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ||
            lado1 + lado2 <= lado3 ||
            lado1 + lado3 <= lado2 ||
            lado2 + lado3 <= lado1) {
        System.out.println("Invalido, no forman un triangulo");
    } else {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triangulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triangulo Isóceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }
    }

    sc.close();
}