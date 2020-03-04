package herenciadeudores;

public class PrestamoHipotecario extends ClienteDeudor{
    private double interesPagar;
    private double tazainteres;
    private String reporte;

    public PrestamoHipotecario(int numCliente, String nombre, String numCuenta,double capPrestado, int plazo){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.capPrestado = capPrestado;
        this.plazo = plazo;
    }

    public void calcularInteresPagar(){
        tazainteres = capPrestado * 0.478;
        interesPagar = capPrestado + (tazainteres * plazo);
        reporte = String.format("%d                 %s                %s                 %.2f\n"
                ,numCliente,nombre,numCuenta,interesPagar);
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

    public String getReporte() {
        return reporte;
    }

}
