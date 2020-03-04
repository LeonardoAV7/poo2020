package herenciavolumen;

public class Cilindro extends FiguraV {
    private double radio;
    private double altura;
    private double volCilindro;

    public Cilindro(double radio,double altura, String nomFigura ){
        this.radio = radio;
        this.nomFigura = nomFigura;
        this.altura = altura;
    }

    public void calcularVolCilindro(){
        volCilindro = Math.PI *(Math.pow(radio,2))*altura;
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

}
