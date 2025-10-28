void main() {
    Scanner sc = new Scanner (System.in);
    boolean salir = false;

    while (!salir){
        System.out.println("Calculadora avanzada");
        System.out.println("Elige una operacion:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicacion (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Potencia (^)");
        System.out.println("6. Raiz cuadrada (r)");
        System.out.println("7. Factorial (!)");
        System.out.println("8. Salir");
        System.out.println("Opcion: ");
        String opcion = sc.next().trim().toLowerCase();

        double num1, num2, resultado;

        switch (opcion) {
            case "1":
            case "+":
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case "2":
            case "-":
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case "3":
            case "*":
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case "4":
            case "/":
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;

            case "5":
            case "^":
                System.out.println("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
                if (num2 < 0) {
                    System.out.println("Error: no se permiten negativos");
                } else {
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case "6":
            case "r":
                System.out.println("Introduce un numero: ");
                num1 = sc.nextDouble();
                if (num1 < 0) {
                    System.out.println("Error: no se permiten negativos");
                } else {
                    resultado = Math.sqrt(num1);
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case "7":
            case "!":
                System.out.println("Introduce un numero entero: ");
                int n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Error: no se permiten negativos");
                } else {
                    long factorial = 1;
                    int i = 1;
                    while (i <= n) {
                        factorial = factorial * i;
                        i = i + 1;
                    }
                    System.out.println("Resultado: " + factorial);
                }
                break;

            case "8":
            case "q":
                salir = true;
                System.out.println("Saliendo de la calcualdora.");
                break;

            default:
                System.out.println("Opcion no validad, intentelo de nuevo.");
        }
    }
    sc.close();
}
