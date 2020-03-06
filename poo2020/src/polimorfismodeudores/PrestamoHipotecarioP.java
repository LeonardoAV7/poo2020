package polimorfismodeudores;

public class PrestamoHipotecarioP extends ClienteDeudorP{

    public PrestamoHipotecarioP(int numCliente, String nombre, String numCuenta,
                                double capPrestado, int plazo){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.capPrestado = capPrestado;
        this.plazo = plazo;
    }

    @Override
    public void interesPagar() {
        tazainteres = capPrestado * 0.478;
        interesPagar = capPrestado + (tazainteres * plazo);
        reporte = String.format("%d                 %s                %s                 %.2f\n"
                ,numCliente,nombre,numCuenta,interesPagar);
    }
}
