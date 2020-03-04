package herenciaautomotriz;

public class Mecanico extends Empleado{
    private double precioTrabajo;
    private int numTrabajos;

    public void calcularSueldoQuincenal(){
        double acum = 0;
        for(int i=0; i<numTrabajos; i++){
            acum = acum + precioTrabajo;
        }
        sueldoQuincenal =  acum * 0.04;
        setReporte(String.format("%d                 %s                %s                 %s                 %.2f\n"
                ,rfc,nombre,departamento,puesto, sueldoQuincenal));
    }

    public double getPrecioTrabajo() {
        return precioTrabajo;
    }

    public void setPrecioTrabajo(double precioTrabajo) {
        this.precioTrabajo = precioTrabajo;
    }

    public int getNumTrabajos() {
        return numTrabajos;
    }

    public void setNumTrabajos(int numTrabajos) {
        this.numTrabajos = numTrabajos;
    }
}
