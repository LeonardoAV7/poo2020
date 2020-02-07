package diagramaClase;

public class Computadora {
    // definición de atributos globales
    private String marca;
    private String generacion;
    private String procesador;
    private String fecha_compra;
    private String velocidad_procesador;

    /**
     * Metodo para obtener el valor de la variable marca
     * @return marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Metodo para obtener el valor de la variable generacion
     * @return generacion
     */
    public String obtener_generacion(){
        return generacion;
    }

    /**
     * Metodo para obtener el valor de la variable procesador
     * @return procesador
     */
    public String obtener_procesador(){
        return procesador;
    }

    /**
     * Metodo para obtener el valor de la variable fecha_compra
     * @return fecha_compra
     */
    public String obtener_fecha_compra(){
        return fecha_compra;
    }

    /**
     * Metodo para obtener el valor de la variable velocidad_procesador
     * @return velocidad_procesador
     */
    public String obtener_velocidad_procesador(){
        return velocidad_procesador;
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
     * Metodo para actualizar la variable generacion
     * @param generacion
     */
    public void actualizar_generacion(String generacion){
        //con el this hacemos refeerencia a variables globales
        this.generacion = generacion;
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
     * Metodo para actualizar la variable fecha_compra
     * @param fecha_compra
     */
    public void actualizar_fecha_compra(String fecha_compra){
        //con el this hacemos refeerencia a variables globales
        this.fecha_compra = fecha_compra;
    }

    /**
     * Metodo para actualizar la variable velocidad_procesador
     * @param velocidad_procesador
     */
    public void actualizar_velocidad_procesador(String velocidad_procesador){
        //con el this hacemos refeerencia a variables globales
        this.velocidad_procesador = velocidad_procesador;
    }

    public void  mostrar(){
        System.out.println("Este metodo realiza la accion de mostrar");
    }
    public void  procesar(){
        System.out.println("Este metodo realiza la accion de procesar");
    }
    public void  almacenar(){
        System.out.println("Este metodo realiza la accion de almacenar");
    }
    public void  buscar(){
        System.out.println("Este metodo realiza la accion de buscar");
    }
}
