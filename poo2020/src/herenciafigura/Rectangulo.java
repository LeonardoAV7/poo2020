package herenciafigura;

public class Rectangulo extends Figura{
    private double baseRecta;
    private double alturaRecta;
    private double areaRecta;

    public Rectangulo(double baseRecta, double alturaRecta, String nombre){
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
        this.nomFigura = nombre;

    }

    public double calcularAreaRect(){
        areaRecta = baseRecta * alturaRecta;
        return areaRecta;

    }

    public double getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public double getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    public double getAreaRecta() {
        return areaRecta;
    }

    public void setAreaRecta(double areaRecta) {
        this.areaRecta = areaRecta;
    }
}
