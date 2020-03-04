package herenciainversionistas;

public class Inversionista {
    protected String numCuenta;
    protected int numCliente;
    protected String nom;
    protected double capInvert;
    protected double tazaInt;
    protected int plazoInv;

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCapInvert() {
        return capInvert;
    }

    public void setCapInvert(double capInvert) {
        this.capInvert = capInvert;
    }

    public double getTazaInt() {
        return tazaInt;
    }

    public void setTazaInt(double tazaInt) {
        this.tazaInt = tazaInt;
    }

    public int getPlazoInv() {
        return plazoInv;
    }

    public void setPlazoInv(int plazoInv) {
        this.plazoInv = plazoInv;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
