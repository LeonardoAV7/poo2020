package polimorfismovolumen;

public class ConoP extends FiguraVol{
    private double radio;
    private double altura;
    private double volCono;

    public ConoP(double radio,double altura, String nomFigura ){
        this.radio = radio;
        this.nomFigura = nomFigura;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolCono() {
        return volCono;
    }

    @Override
    public void calcularVol() {
        volCono = ( Math.PI *(Math.pow(radio,2))*altura )/3;
    }
}
