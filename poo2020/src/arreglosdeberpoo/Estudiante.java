package arreglosdeberpoo;

public class Estudiante {
    private String[] nombre;
    private int[] edad;
    private String[] universidad;
    private String[] celular;

    /**
     * Metodo para actualizar el arreglo nombre
     * @param nombre
     */
    public void setNombre(String[] nombre){
        //con el this hacemos refeerencia a variables globales
        this.nombre = nombre;
    }
    /**
     * Metodo para actualizar el arreglo edad
     * @param edad
     */
    public void setEdad(int[] edad){
        //con el this hacemos refeerencia a variables globales
        this.edad = edad;
    }
    /**
     * Metodo para actualizar el arreglo universidad
     * @param universidad
     */
    public void setUniversidad(String[] universidad){
        //con el this hacemos refeerencia a variables globales
        this.universidad = universidad;
    }
    /**
     * Metodo para actualizar el arreglo celular
     * @param celular
     */
    public void setCelular(String[] celular){
        //con el this hacemos refeerencia a variables globales
        this.celular = celular;
    }
    /**
     * Metodo para imprimir el resultado
     */
    public void imprimirFicha(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Edad: " + edad[i]);
            System.out.println("Universidad: " + universidad[i]);
            System.out.println("Celular: " + celular[i]);
        }
    }
    /**
     * Metodo para obtener el valor de el arreglo nombre
     * @return nombre
     */
    public String[] getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener el valor de el arreglo edad
     * @return edad
     */
    public int[] getEdad() {
        return edad;
    }
    /**
     * Metodo para obtener el valor de el arreglo universidad
     * @return universidad
     */
    public String[] getUniversidad() {
        return universidad;
    }
    /**
     * Metodo para obtener el valor de el arreglo edad
     * @return edad
     */
    public String[] getCelular() {
        return celular;
    }
}
