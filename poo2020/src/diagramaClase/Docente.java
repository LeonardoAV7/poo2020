package diagramaClase;

public class Docente {
    // definición de atributos globales
    private String nombre;
    private String correo;
    private int numero_cedula;
    private String titulo;
    private String area_trabajo;

    /**
     * Metodo para obtener el valor de la variable nombre
     * @return nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Metodo para obtener el valor de la variable correo
     * @return correo
     */
    public String obtener_correo(){
        return correo;
    }

    /**
     * Metodo para obtener el valor de la variable numero_cedula
     * @return numero_cedula
     */
    public int obtener_numero_cedula(){
        return numero_cedula;
    }

    /**
     * Metodo para obtener el valor de la variable titulo
     * @return titulo
     */
    public String obtener_titulo(){
        return titulo;
    }

    /**
     * Metodo para obtener el valor de la variable area_trabajo
     * @return area_trabajo
     */
    public String obtener_area_trabajo(){
        return area_trabajo;
    }

    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        //con el this hacemos refeerencia a variables globales
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la variable correo
     * @param correo
     */
    public void actualizar_correo(String correo){
        //con el this hacemos refeerencia a variables globales
        this.correo = correo;
    }

    /**
     * Metodo para actualizar la variable numero_cedula
     * @param numero_cedula
     */
    public void actualizar_numero_cedula(int numero_cedula){
        //con el this hacemos refeerencia a variables globales
        this.numero_cedula = numero_cedula;
    }

    /**
     * Metodo para actualizar la variable titulo
     * @param titulo
     */
    public void actualizar_titulo(String titulo){
        //con el this hacemos refeerencia a variables globales
        this.titulo = titulo;
    }

    /**
     * Metodo para actualizar la variable area_trabajo
     * @param area_trabajo
     */
    public void actualizar_area_trabajo(String area_trabajo){
        //con el this hacemos refeerencia a variables globales
        this.area_trabajo = area_trabajo;
    }

    public void  enseñar(){

    }
    public void  usar_instalaciones(){

    }
    public void  investigar(){

    }
    public void  calificar(){

    }
    public void  guiar(){

    }

}
