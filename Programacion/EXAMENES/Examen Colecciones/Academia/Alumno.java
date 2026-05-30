public class Alumno {
    private String nombre;
    private String dni;
    private String curso;
    private String fechaMatricula;
    private boolean activo;

    public Alumno(String nombre, String dni, String curso, String fechaMatricula, boolean activo) {
        this.nombre = nombre;
        this.dni = dni;
        this.curso = curso;
        this.fechaMatricula = fechaMatricula;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", curso='" + curso + '\'' +
                ", fechaMatricula='" + fechaMatricula + '\'' +
                ", activo=" + activo +
                '}';
    }
}
