public class Socio {
    private String nombre;
    private String dni;
    private int edad;
    private String fechaInscripcion;
    private boolean activo;

    public Socio(String nombre, String dni, int edad, String fechaInscripcion, boolean activo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.fechaInscripcion = fechaInscripcion;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", fechaInscripcion='" + fechaInscripcion + '\'' +
                ", activo=" + activo +
                '}';
    }
}
