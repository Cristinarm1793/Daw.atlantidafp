void main () {
    Scanner sc = new Scanner (System.in);
    String num, numInverso = "";

    System.out.println("Ingresa un numero entero: ");
    num = sc.nextLine();

    for (int i = num.length() -1; i >= 0; i--){
        numInverso += num.charAt(i);
    }

    if (num.equals(numInverso)){
        System.out.println(num + " es palindromo");
    } else {
        System.out.println(num + " no es palindromo");
    }
}
