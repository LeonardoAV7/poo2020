package polimorfismovolumen;

public class CuboP extends FiguraVol{
    private double arista;
    private double volCubo;

    public CuboP(double arista, String nombre){
        this.arista = arista;
        this.nomFigura = nomFigura;

    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getVolCubo() {
        return volCubo;
    }

    @Override
    public void calcularVol() {
        volCubo = Math.pow(arista,3) ;
    }
}
