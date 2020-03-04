package herenciavolumen;

public class Esfera extends FiguraV{
    private double radio;
    private double volEsfera;

    public Esfera(double radio,String nomFigura ){
        this.radio = radio;
        this.nomFigura = nomFigura;
    }

    public void calcularAreaEsfera(){
        volEsfera = ( 4 * Math.PI *(Math.pow(radio,3)) )/3;
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

}
