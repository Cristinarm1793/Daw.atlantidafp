void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Usuario");
    String user = sc.nextLine();
    System.out.println("Contraseña");
    String pass = sc.nextLine();

    if (user.equals("admin") && pass.equals("1234")) {
        System.out.println("Administrador");
    } else if (user.equals("user") && pass.equals("abcd")) {
        System.out.println("Usuario");
    } else if (user.equals("guest") && pass.equals("xyz")) {
        System.out.println("Invitado");
    } else {
        System.out.println("Acceso denegado");
    }

    sc.close();
}
