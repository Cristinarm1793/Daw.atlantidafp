void main() {
    Scanner sc = new Scanner (System.in);
    int num, suma = 0;

    System.out.println("Ingresa un numero: ");
    num = sc.nextInt();

    for (int i = 1; i <= num; i++) {
        if (i % 2 == 0) {
            suma += i;
        } else {
            System.out.println(" ");
        }
    }
    System.out.println( num+" es par "+suma);
    sc.close();
}
