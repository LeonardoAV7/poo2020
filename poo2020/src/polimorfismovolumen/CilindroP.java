package polimorfismovolumen;

public class CilindroP extends FiguraVol{
    private double radio;
    private double altura;
    private double volCilindro;

    public CilindroP(double radio,double altura, String nomFigura ){
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

    public double getVolCilindro() {
        return volCilindro;
    }

    @Override
    public void calcularVol() {
        volCilindro = Math.PI *(Math.pow(radio,2))*altura;
    }
}
