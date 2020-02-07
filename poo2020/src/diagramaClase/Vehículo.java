package diagramaClase;

public class Vehículo {
    // definición de atributos globales
    private String marca;
    private String tipo;
    private String origen;
    private int precio;
    private int capacidad;

    /**
     * Metodo para obtener el valor de la variable marca
     * @return marca
     */
    public String obtener_marca(){
        return marca;
    }
    /**
     * Metodo para obtener el valor de la variable tipo
     * @return tipo
     */
    public String obtener_tipo(){
        return tipo;
    }
    /**
     * Metodo para obtener el valor de la variable origen
     * @return origen
     */
    public String obtener_origen(){
        return origen;
    }
    /**
     * Metodo para obtener el valor de la variable precio
     * @return precio
     */
    public int obtener_precio(){
        return precio;
    }
    /**
     * Metodo para obtener el valor de la variable capacidad
     * @return capacidad
     */
    public int obtener_capacidad(){
        return capacidad;
    }

    /**
     * Metodo para actualizar la variable marca
     * @param marca
     */
    public void actualizar_marca(String marca){
        //con el this hacemos refeerencia a variables globales
        this.marca = marca;
    }
    /**
     * Metodo para actualizar la variable tipo
     * @param tipo
     */
    public void actualizar_tipo(String tipo){
        //con el this hacemos refeerencia a variables globales
        this.tipo = tipo;
    }
    /**
     * Metodo para actualizar la variable precio
     * @param precio
     */
    public void actualizar_precio(int precio){
        //con el this hacemos refeerencia a variables globales
        this.precio = precio;
    }
    /**
     * Metodo para actualizar la variable origen
     * @param origen
     */
    public void actualizar_origen(String origen){
        //con el this hacemos refeerencia a variables globales
        this.origen = origen;
    }
    /**
     * Metodo para actualizar la variable capacidad
     * @param capacidad
     */
    public void actualizar_capacidad(int capacidad){
        //con el this hacemos refeerencia a variables globales
        this.capacidad = capacidad;
    }

    public void  transportar(){

    }
    public void  luz(){

    }
    public void  direccion(){

    }
    public void  refrigerar(){

    }

}
