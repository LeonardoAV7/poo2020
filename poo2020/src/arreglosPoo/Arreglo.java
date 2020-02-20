package arreglosPoo;

public class Arreglo {
    private int[] vector1;
    private int[] vector2;
    private int suma_producto;

    /**
     * Metodo para actualizar la variable vector2
     * @param vector1
     */
    public void setVector1(int[] vector1){
        //con el this hacemos refeerencia a variables globales
        this.vector1 = vector1;
    }
    /**
     * Metodo para actualizar la variable vector2
     * @param vector2
     */
    public void setVector2(int[] vector2){
        //con el this hacemos refeerencia a variables globales
        this.vector2 = vector2;
    }
    /**
     * Metodo para actualizar la calcular suma_producto
     */
    public void calcularSuma_producto(){
        suma_producto = 0;
        for(int i = 0; i <=9; i++){
            suma_producto = suma_producto + (vector1[i] * vector2[i]);
        }
    }


    /**
     * Metodo para obtener el valor de la variable suma_producto
     * @return suma_producto
     */
    public int getSuma_producto() {
        return suma_producto;
    }
    /**
     * Metodo para obtener el valor de la variable vector1
     * @return vector1
     */
    public int[] getVector1() {
        return vector1;
    }
    /**
     * Metodo para obtener el valor de la variable vector2
     * @return vector2
     */
    public int[] getVector2() {
        return vector2;
    }
}
