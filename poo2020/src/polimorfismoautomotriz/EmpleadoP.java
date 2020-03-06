package polimorfismoautomotriz;

public abstract class EmpleadoP {
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldoQuincenal;
    protected int rfc;
    protected String reporte;

    public abstract void calcularSueldoQuincenal();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public void setSueldoQuincenal(double sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }

    public int getRfc() {
        return rfc;
    }

    public void setRfc(int rfc) {
        this.rfc = rfc;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }
}
