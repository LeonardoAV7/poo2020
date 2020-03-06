package polimorfismoinversionistas;

public class PagareP extends InversionistaP{
    private double intGeP;
    // Metodo constructor creado con variables heredadas
    public PagareP(String numCu, int numCl, String nom, double capInvert, int plazo){
        this.setNumCuenta(numCu);
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;
    }

    @Override
    public void calcularInteres() {
        if (capInvert >= 1000 && capInvert <= 2400){
            tazaInt = 0.05;
            intGeP = (capInvert * tazaInt) * plazoInv;
        }else if (capInvert >2800 ){
            tazaInt = 0.08;
            intGeP = (capInvert * tazaInt) * plazoInv;

        }
    }

    public double getIntGeP() {
        return intGeP;
    }

    public void setIntGeP(double intGeP) {
        this.intGeP = intGeP;
    }

}
