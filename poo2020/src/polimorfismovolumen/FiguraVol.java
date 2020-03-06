package polimorfismovolumen;

public abstract class FiguraVol {
    protected String nomFigura;

    public abstract void calcularVol();

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }
}
