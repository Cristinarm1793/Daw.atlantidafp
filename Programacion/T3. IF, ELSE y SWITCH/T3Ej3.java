void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Primera nota: ");
    int n1 = sc.nextInt();
    System.out.println("Segunda nota: ");
    int n2 = sc.nextInt();
    System.out.println("Tercera nota: ");
    int n3 = sc.nextInt();
    System.out.println("Cuarta nota: ");
    int n4 = sc.nextInt();
    System.out.println("Quinta nota: ");
    int n5 = sc.nextInt();

    if (n1 < 0 || n1 > 100 || n2 < 0 || n2 > 100 ||n3 < 0 || n3 > 100 || n4 < 0 || n4 > 100 || n5 < 0 || n5 > 100) {
        System.out.println("La nota debe estar entre 0 y 100");
    } else {
        double nota = ((n1 + n2 + n3 + n4 + n5) / 5.0);
        System.out.println("Nota: " + nota);

        if (nota >= 90 && nota <= 100) {
            System.out.println("A");
        } else if (nota >= 80 ) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else if (nota >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    sc.close();
}
