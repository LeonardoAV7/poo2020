package diagramaClase;

public class Animal {
    // definición de atributos globales
    private String tipo;
    private String especie;
    private String region;
    private String sexo;
    private String tipo_reproduccion;

    /**
     * Metodo para obtener el valor de la variable tipo
     * @return tipo
     */
    public String obtener_tipo(){
        return tipo;
    }

    /**
     * Metodo para obtener el valor de la variable especie
     * @return especie
     */
    public String obtener_especie(){
        return especie;
    }

    /**
     * Metodo para obtener el valor de la variable region
     * @return region
     */
    public String obtener_region(){
        return region;
    }

    /**
     * Metodo para obtener el valor de la variable sexo
     * @return sexo
     */
    public String obtener_sexo(){
        return sexo;
    }

    /**
     * Metodo para obtener el valor de la variable tipo_reproduccion
     * @return tipo_reproduccion
     */
    public String obtener_tipo_reproduccion(){
        return tipo_reproduccion;
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
     * Metodo para actualizar la variable especie
     * @param especie
     */
    public void actualizar_especie(String especie){
        //con el this hacemos refeerencia a variables globales
        this.especie = especie;
    }

    /**
     * Metodo para actualizar la variable region
     * @param region
     */
    public void actualizar_region(String region){
        //con el this hacemos refeerencia a variables globales
        this.region = region;
    }

    /**
     * Metodo para actualizar la variable sexo
     * @param sexo
     */
    public void actualizar_sexo(String sexo){
        //con el this hacemos refeerencia a variables globales
        this.sexo = sexo;
    }

    /**
     * Metodo para actualizar la variable tipo_reproduccion
     * @param tipo_reproduccion
     */
    public void actualizar_tipo_reproduccion(String tipo_reproduccion){
        //con el this hacemos refeerencia a variables globales
        this.tipo_reproduccion = tipo_reproduccion;
    }

    public void  repirar(){
        System.out.println("Este metodo realiza la accion de la respiracion del animal");
    }

    public void  alimentarse(){

        System.out.println("Este metodo realiza la accion de la alimentacion del animal");
    }

    public void  reproducirse(){

        System.out.println("Este metodo realiza la accion de la reproduccion del animal");
    }
}
