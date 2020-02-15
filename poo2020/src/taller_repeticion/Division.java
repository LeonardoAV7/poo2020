package taller_repeticion;
// Leonardo Aguilar - Shomira Rosales
public class Division {
    private int numero1;
    private int numero2;
    private int division;

    /**
     * Metodo para actualizar la variable numero1
     * @param numero1
     */
    public void setNumero1(int numero1){
        //con el this hacemos refeerencia a variables globales
        this.numero1 = numero1;
    }

    /**
     * Metodo para actualizar la variable numero2
     * @param numero2
     */
    public void setNumero2(int numero2){
        //con el this hacemos refeerencia a variables globales
        this.numero2 = numero2;
    }

    public void calcularDivision(){
        int b =numero1;
        for(int i = 1; b >=numero2; i++){
            b = b - numero2;
            division = i;

        }
    }


    /**
     * Metodo para obtener el valor de la variable division
     * @return division
     */
    public double getDivision() {
        return division;
    }

}
