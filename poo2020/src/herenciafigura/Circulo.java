package herenciafigura;

public class Circulo extends Figura{
    private double radio;
    private double areaCir;

    public Circulo(double radio, String nomFig ){
        this.radio = radio;
        this.nomFigura = nomFig;

    }
    public double calcularAreaCir(){
        areaCir = 2.14*(Math.pow(radio,2));
        return areaCir;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaCir() {
        return areaCir;
    }

    public void setAreaCir(double areaCir) {
        this.areaCir = areaCir;
    }
}
