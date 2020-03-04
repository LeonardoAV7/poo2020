package herenciadeudores;

public class ClienteDeudor {
    protected int numCliente;
    protected String nombre;
    protected String numCuenta;
    protected double capPrestado;
    protected double plazo;

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCapPrestado() {
        return capPrestado;
    }

    public void setCapPrestado(double capPrestado) {
        this.capPrestado = capPrestado;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }
}
