package herenciadeudores;

public class PrestamoPersonal extends ClienteDeudor{
    private double interesPagar;
    private double tazainteres;
    private String reporte;

    public PrestamoPersonal(int numCliente, String nombre, String numCuenta,double capPrestado, int plazo){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.capPrestado = capPrestado;
        this.plazo = plazo;
    }

    public void calcularInteresPagar(){
        tazainteres = capPrestado * 0.1730;
        interesPagar = capPrestado + (tazainteres * plazo);
        reporte = String.format("%d                 %s                %s                 %.2f\n"
                ,numCliente,nombre,numCuenta,interesPagar);
    }
    public String getReporte(){
        return reporte;
    }

    public double getInteresPagar() {
        return interesPagar;
    }


    public double getTazainteres() {
        return tazainteres;
    }

    public void setTazainteres(double tazainteres) {
        this.tazainteres = tazainteres;
    }
}
