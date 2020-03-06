package polimorfismodeudores;

public class PrestamoAutoP extends ClienteDeudorP{

    public PrestamoAutoP(int numCliente, String nombre, String numCuenta,double capPrestado,
                         int plazo){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.capPrestado = capPrestado;
        this.plazo = plazo;
        this.tazainteres = tazainteres;
    }

    @Override
    public void interesPagar() {
        tazainteres = capPrestado * 0.1268;
        interesPagar = capPrestado + (tazainteres * plazo);
        reporte = String.format("%d                 %s                %s                 %.2f\n"
                ,numCliente,nombre,numCuenta,interesPagar);
    }
}
