package herenciaEmpleado;

public class EmpleadoHora extends Empleado{
    //atributos propios de esta clase
    private int hora;
    private double cuota;
    private double sueldo;

    public EmpleadoHora(String nombre,String cargo, String dependencia, int hora, double cuota){
        this.cargo = cargo;
        this.nombre = nombre;
        this.dependencia = dependencia;
        this.hora = hora;
        this.cuota = cuota;
    }

    public void calcularSueldoHora(){
        sueldo = hora*cuota;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getSueldo() {
        return sueldo;
    }

}
