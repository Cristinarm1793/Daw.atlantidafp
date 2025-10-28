void main() {
    Scanner sc = new Scanner (System.in);

    System.out.print("Introduce un numero: ");
    int num = sc.nextInt();
    int suma = 0;

    for (int i = 1; i < num; i++) {
        if (num % i == 0){
            suma += i;
        }
    }

    if (suma == num){
        System.out.println("Es perfecto");
    } else {
        System.out.println("No es perfecto");
    }

    sc.close();
}
