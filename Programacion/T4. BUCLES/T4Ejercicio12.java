import java.util.Scanner;

public class T4Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---Menú---");
            System.out.println("Elige una opcion: ");
            System.out.println("1. Pares");
            System.out.println("2. Impares");
            System.out.println("3. Carácteres");
            System.out.println("4. Invertir");
            System.out.println("5. Palíndroma");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un numero: ");
                    String num1 = sc.nextLine().trim();

                    int sumaPares = 0;

                    for (int i = 0; i < num1.length(); i++) {
                        char c1 = num1.charAt(i);
                        int valor = Integer.parseInt(String.valueOf(c1));

                        if (valor % 2 == 0) {
                            sumaPares += valor;
                        }
                    }

                    System.out.println("La suma es: " +sumaPares);
                    break;

                case 2:
                    System.out.println("Introduce un numero: ");
                    String num2 = sc.nextLine();
                    int sumaImpares = 0;

                    for (int i = 0; i < num2.length(); i++) {
                        char c2 = num2.charAt(i);
                        int valor = Integer.parseInt(String.valueOf(c2));

                        if (valor % 2 != 0) {
                            sumaImpares += valor;
                        }
                    }
                    System.out.println("La suma es: " + sumaImpares);
                    break;

                case 3:
                    System.out.println("Introduce una cadena de texto: ");
                    String cadena = sc.nextLine().trim();;
                    int contador = 0;

                    for (int i = 0; i < cadena.length(); i++){
                        contador++;
                    }
                    System.out.println("La cadena de texto tiene: " +contador+ " caracteres");
                    break;

                case 4:
                    System.out.println("Introduce la cadena que quieres invertir");
                    String cadenaOriginal = sc.nextLine();
                    String cadenaInversa = "";

                    for (int i = cadenaOriginal.length()-1; i>=0; i--){
                        cadenaInversa += cadenaOriginal.charAt(i);
                    }
                    System.out.println("La cadena inversa es: "+cadenaInversa);
                    break;

                case 5:
                    System.out.println("Introduce una cadena de texto o un numero palíndromo: ");
                    String palabra = sc.nextLine().trim().toLowerCase();
                    String inversoPalabra = "";


                    for (int i =palabra.length()-1; i>=0; i--){
                        inversoPalabra += palabra.charAt(i);
                    }
                    if (palabra.equals(inversoPalabra)){
                        System.out.println("Es palíndroma");
                    } else {
                        System.out.println("No es palíndroma");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Error, opcion no valida.");

            }
            System.out.println(" ");

        }while (opcion != 6) ;

        sc.close();
    }
}

