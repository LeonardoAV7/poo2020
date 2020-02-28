package herenciafigura;

public class Triangulo extends Figura{
    private double baseTria;
    private double alturaTria;
    private double areaTria;



    public double calcularAreaTri(){
        areaTria = (baseTria * alturaTria)/2;
        return areaTria;
    }
    public Triangulo(double baseTria, double alturaRecta, String nombre){
        this.baseTria = baseTria;
        this.alturaTria = alturaTria;
        this.nomFigura = nombre;

    }
    public double getBaseTria() {
        return baseTria;
    }

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public double getAlturaTria() {
        return alturaTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    public double getAreaTria() {
        return areaTria;
    }

    public void setAreaTria(double areaTria) {
        this.areaTria = areaTria;
    }
}
