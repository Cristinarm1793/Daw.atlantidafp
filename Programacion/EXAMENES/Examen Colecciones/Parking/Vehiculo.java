public class Vehiculo {
    private String matricula;
    private String propietario;
    private String horaEntrada;
    private int plaza;
    private boolean pagado;

    public Vehiculo(String matricula, String propietario, String horaEntrada, int plaza, boolean pagado) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.horaEntrada = horaEntrada;
        this.plaza = plaza;
        this.pagado = pagado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", propietario='" + propietario + '\'' +
                ", horaEntrada='" + horaEntrada + '\'' +
                ", plaza=" + plaza +
                ", pagado=" + pagado +
                '}';
    }
}
