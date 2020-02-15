package taller_repeticion;
// Leonardo Aguilar - Shomira Rosales
public class Factorial {
    private int numero;
    private int factorial;

    /**
     * Metodo para actualizar la variable numero
     * @param numero
     */
    public void setNumero(int numero){
        //con el this hacemos refeerencia a variables globales
        this.numero = numero;
    }

    public void calcularFactorial(){
        int a = 1;
        for(int i = 1; i <=numero; i++){
            a = a * i;
            factorial =  a;
        }
    }


    /**
     * Metodo para obtener el valor de la variable factorial
     * @return factorial
     */
    public double getFactorial() {
        return factorial;
    }
}
