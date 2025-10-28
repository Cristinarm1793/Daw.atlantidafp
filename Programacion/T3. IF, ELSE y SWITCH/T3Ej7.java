void main() {
    Scanner sc = new Scanner (System.in);
    System.out.println("Juego de piedra, papel, tijeras");
    System.out.println("Reglas del juego: " +
            "- Tijeras cortan papel.\n" +
            "- Papel cubre piedra.\n" +
            "- Piedra aplasta lagarto.\n" +
            "- Lagarto envenena Spock.\n" +
            "- Spock rompe tijeras.\n" +
            "- Tijeras decapitan lagarto.\n" +
            "- Lagarto come papel.\n" +
            "- Papel desautoriza a Spock.\n" +
            "- Spock vaporiza piedra.\n" +
            "- Piedra aplasta tijeras.\n");

    System.out.println("Jugador 1: ");
    String P1 = sc.nextLine().toLowerCase();
    System.out.println("Jugador 2: ");
    String P2 = sc.nextLine().toLowerCase();
    String resultado = "";

    if (P1.equals(P2)) {
        resultado = "Empate";
    } else {
        switch (P1) {
            case "piedra":
                switch (P2) {
                    case "papel":
                    case "spock":
                        resultado = "Jugador 2 Gana!";
                        break;
                    case "tijera":
                    case "lagarto":
                        resultado = "Jugador 1 Gana!";
                        break;
                }
                break;
            case "papel":
                switch (P2) {
                    case "tijera":
                    case "lagarto":
                        resultado = "Jugador 2 Gana!";
                        break;
                    case "piedra":
                    case "spock":
                        resultado = "Jugador 1 Gana!";
                        break;
                }
                break;
            case "tijera":
                switch (P2) {
                    case "piedra":
                    case "spock":
                        resultado = "Jugador 2 Gana!";
                        break;
                    case "papel":
                    case "lagarto":
                        resultado = "Jugador 1 Gana!";
                        break;
                }
                break;
            case "lagarto":
                switch (P2) {
                    case "piedra":
                    case "tijera":
                        resultado = "Jugador 2 Gana!";
                        break;
                    case "papel":
                    case "spock":
                        resultado = "Jugador 1 Gana!";
                        break;
                }
                break;
            case "spock":
                switch (P2) {
                    case "papel":
                    case "lagarto":
                        resultado = "Jugador 2 Gana!";
                        break;
                    case "piedra":
                    case "tijera":
                        resultado = "Jugador 1 Gana!";
                        break;
                }
                break;
            default:
                resultado = "Opcion no valida.";
        }
    }
    System.out.println(resultado);
    sc.close();
}

