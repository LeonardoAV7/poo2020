package herenciainversionistas;

public class CuentaAhorro extends  Inversionista{
    // Atributo propio de la clase
    private double intGeA;

    public CuentaAhorro(String  numCu, int numCl, String nom, double capInvert, int plazo){
        this.setNumCuenta(numCu);
        // Variables heredadas
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;


    }

    public void calcularIntA() {
        if (capInvert >= 700 && capInvert <= 1000){
            tazaInt = 0.04;
            intGeA = (capInvert * tazaInt) * plazoInv;

        }else if (capInvert >=2000 && capInvert <= 4000){
            tazaInt = 0.10;
            intGeA = (capInvert * tazaInt) * plazoInv;
        }else if(capInvert > 4500) {
            tazaInt = 0.15;
            intGeA = (capInvert * tazaInt) * plazoInv;
        }
    }

    public double getIntGeA() {
        return intGeA;
    }

    public void setIntGeA(double intGeA) {
        this.intGeA = intGeA;
    }
}
