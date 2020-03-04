package herenciavolumen;

import herenciafigura.Figura;

public class Cubo extends FiguraV {
    private double arista;
    private double volCubo;

    public Cubo(double arista, String nombre){
        this.arista = arista;
        this.nomFigura = nomFigura;

    }
    public void calcularAreaCubo(){
        volCubo = Math.pow(arista,3) ;

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

}
