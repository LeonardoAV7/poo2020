package polimorfismoautomotriz;

public class VendedorP extends EmpleadoP{
    private double precioAuto;
    private int numAutos;

    @Override
    public void calcularSueldoQuincenal(){
        double acum = 0;
        for(int i=0; i<numAutos; i++){
            acum = acum + precioAuto;
        }
        sueldoQuincenal =  400 + (acum * 0.02);
        setReporte(String.format("%d                 %s                %s                 %s                 %.2f\n"
                ,rfc,nombre,departamento,puesto, sueldoQuincenal));
    }

    public double getPrecioAuto() {
        return precioAuto;
    }

    public void setPrecioAuto(double precioAuto) {
        this.precioAuto = precioAuto;
    }

    public int getNumAutos() {
        return numAutos;
    }

    public void setNumAutos(int numAutos) {
        this.numAutos = numAutos;
    }
}
