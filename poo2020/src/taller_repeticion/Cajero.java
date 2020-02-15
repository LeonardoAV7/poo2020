package taller_repeticion;
// Leonardo Aguilar - Shomira Rosales
public class Cajero {
    private String nombre;
    private double saldoInicial;
    private double depositos;
    private double retiros;
    private int consultas;
    public Cajero(String nombre, double saldoInicial){
        this.nombre = nombre;
        this.saldoInicial= saldoInicial;

    }

    /**
     * Metodo para calculo de deposito de dinero y actualizar salInicial
     * @param a
     */
    public void calcularDeposito(double a){
        if (a > 0){
            saldoInicial = saldoInicial + a;
        }
    }

    /**
     * Metodo para calculo de retiro de dinero y actualizar salInicial
     * @param b
     */
    public void calcularRetiro(double b){
        if (b <= saldoInicial){
            saldoInicial = saldoInicial - b;
        }
    }

    /**
     * Metodo que obtiene el valor de la variable Nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el valor ce la variable saldoInicial
     * @return
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * Metodo que  actualiza el valor de la variable saldoInicial
     * @param saldoInicial
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}
