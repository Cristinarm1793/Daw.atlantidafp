public abstract class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;


    public Animal() {
        this.nombre = "";
        this.especie = "";
        this.edad = 0;
    }

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public abstract void hacerSonido();
    public abstract void alimentarse();

    public void mostrarDetalles(){
        System.out.println("Nombre: "+nombre+ "\nEspecie: "+especie+"\nEdad: "+edad);
    }

    public void esMayor(Animal a2){
        if (this.edad > a2.edad) {
            System.out.println("es mayor");
        } else if (this.edad < a2.edad) {
            System.out.println(this.nombre+" es menor");
        } else {
            System.out.println(this.nombre + "tiene la misma edad");

        }
    }
}
