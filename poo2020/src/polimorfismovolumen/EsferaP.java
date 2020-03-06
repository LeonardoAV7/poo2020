package polimorfismovolumen;

public class EsferaP extends FiguraVol{
    private double radio;
    private double volEsfera;

    public EsferaP(double radio,String nomFigura ){
        this.radio = radio;
        this.nomFigura = nomFigura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolEsfera() {
        return volEsfera;
    }

    @Override
    public void calcularVol() {
        volEsfera = ( 4 * Math.PI *(Math.pow(radio,3)) )/3;
    }
}
