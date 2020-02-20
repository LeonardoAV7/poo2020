package arreglosPoo;

public class Ejercicio1212 {
    private double[] vector;
    private double media;
    private double[] desviacion = new double[15];

    /**
     * Metodo para actualizar la variable vector2
     * @param vector1
     */
    public void setVector(double[] vector1){
        //con el this hacemos refeerencia a variables globales
        this.vector = vector1;
    }
    /**
     * Metodo para calcular la variable media
     */
    public void calcularMedia(){
        media = 0;
        for(int i = 0; i <=9; i++){
            media = media +  vector[i] ;
        }
        media = media / 15;
    }
    /**
     * Metodo para calcular la variable desviacion
     */
    public void calcularDesviacion(){
        for(int i = 0; i <=14; i++){
            desviacion[i] =  vector[i] - media ;
        }
    }

    /**
     * Metodo para obtener el valor de la variable vector
     * @return vector
     */
    public double[] getVector() {
        return vector;
    }
    /**
     * Metodo para obtener el valor de la variable desviacion
     * @return desviacion
     */
    public double[] getDesviacion() {
        return desviacion;
    }

}
