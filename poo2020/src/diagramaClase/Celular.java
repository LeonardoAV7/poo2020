package diagramaClase;

public class Celular {
    // definición de atributos globales
    private Double precio;
    private String marca;
    private String ram;
    private String procesador;
    private String bateria;
    private String almacenamiento;

    /**
     * Metodo para obtener el valor de la variable precio
     * @return precio
     */
    public double obtener_precio(){
        return precio;
    }

    /**
     * Metodo para obtener el valor de la variable marca
     * @return marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Metodo para obtener el valor de la variable ram
     * @return ram
     */
    public String obtener_ram(){
        return ram;
    }

    /**
     * Metodo para obtener el valor de la variable procesador
     * @return procesador
     */
    public String obtener_procesador(){
        return procesador;
    }

    /**
     * Metodo para obtener el valor de la variable bateria
     * @return bateria
     */
    public String obtener_bateria(){
        return bateria;
    }

    /**
     * Metodo para obtener el valor de la variable almacenamiento
     * @return almacenamiento
     */
    public String obtener_almacenamiento(){
        return almacenamiento;
    }

    /**
     * Metodo para actualizar la variable precio
     * @param precio
     */
    public void actualizar_precio(double precio){
        //con el this hacemos refeerencia a variables globales
        this.precio = precio;
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
     * Metodo para actualizar la variable ram
     * @param ram
     */
    public void actualizar_ram(String ram){
        //con el this hacemos refeerencia a variables globales
        this.ram = ram;
    }

    /**
     * Metodo para actualizar la variable procesador
     * @param procesador
     */
    public void actualizar_procesador(String procesador){
        //con el this hacemos refeerencia a variables globales
        this.procesador = procesador;
    }

    /**
     * Metodo para actualizar la variable bateria
     * @param bateria
     */
    public void actualizar_bateria(String bateria){
        //con el this hacemos refeerencia a variables globales
        this.bateria = bateria;
    }

    /**
     * Metodo para actualizar la variable almacenamiento
     * @param almacenamiento
     */
    public void actualizar_almacenamiento(String almacenamiento){
        //con el this hacemos refeerencia a variables globales
        this.almacenamiento = almacenamiento;
    }

    public void  llamar(){
        System.out.println("Este metodo realiza la accion de llamar");
    }

    public void  grabar(){
        System.out.println("Este metodo realiza la accion de grabar");
    }

    public void  navegar(){
        System.out.println("Este metodo realiza la accion de navegar por Internet");
    }

    public void  mensajear(){
        System.out.println("Este metodo realiza la accion de mensajear");
    }

}
