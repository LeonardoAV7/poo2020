package arreglosPoo;

public class Ejercicio6112 {
    private int[] vector1;
    private int[] vector2;
    private int[] vector3 = new int[10];

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
     * Metodo para calaular la variable vector3
     */
    public void calcularVector3(){
        for(int i = 0; i <=9; i++){
            vector3[i] =  vector1[i] + vector2[i];
        }
    }

    /**
     * Metodo para obtener el valor de la variable vector3
     * @return vector3
     */
    public int[] getVector3() {
        return vector3;
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
