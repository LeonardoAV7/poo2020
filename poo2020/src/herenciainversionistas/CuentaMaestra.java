package herenciainversionistas;

public class CuentaMaestra extends  Inversionista{
    private double  intGeMa;

    public CuentaMaestra(String  numCu, int numCl, String nom, double capInvert, int plazo){
        this.setNumCuenta(numCu);
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;

    }

    public void calcularIntCm() {
        if (capInvert >= 10000 && capInvert <= 10500) {
            tazaInt = 0.15;
            intGeMa = (capInvert * tazaInt) * plazoInv;

        }else if(capInvert >=10600 && capInvert <= 20000){
            tazaInt = 0.20;
            intGeMa = (capInvert * tazaInt) * plazoInv;
        }else{
            if(capInvert > 30000){
                tazaInt = 0.25;
                intGeMa = (capInvert * tazaInt) * plazoInv;

            }

        }
    }

    public double getIntGeMa() {
        return intGeMa;
    }

    public void setIntGeMa(double intGeMa) {
        this.intGeMa = intGeMa;
    }
}
