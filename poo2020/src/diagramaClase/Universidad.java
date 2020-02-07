package diagramaClase;

public class Universidad {
    // definición de atributos globales
    private int num_carreras;
    private int num_estudiantes;
    private int num_docentes;
    private String infraestructura;
    private String tipo;

    /**
     * Metodo para obtener el valor de la variable num_carreras
     * @return num_carreras
     */
    public int obtener_num_carreras(){
        return num_carreras;
    }

    /**
     * Metodo para obtener el valor de la variable num_estudiantes
     * @return num_estudiantes
     */
    public int obtener_num_estudiantes(){
        return num_estudiantes;
    }

    /**
     * Metodo para obtener el valor de la variable num_docentes
     * @return num_docentes
     */
    public int obtener_num_docentes(){
        return num_docentes;
    }

    /**
     * Metodo para obtener el valor de la variable infraestructura
     * @return infraestructura
     */
    public String obtener_infraestructura(){
        return infraestructura;
    }

    /**
     * Metodo para obtener el valor de la variable tipo
     * @return tipo
     */
    public String obtener_tipo(){
        return tipo;
    }

    /**
     * Metodo para actualizar la variable num_carreras
     * @param num_carreras
     */
    public void actualizar_num_carreras(int num_carreras){
        //con el this hacemos refeerencia a variables globales
        this.num_carreras = num_carreras;
    }

    /**
     * Metodo para actualizar la variable num_estudiantes
     * @param num_estudiantes
     */
    public void actualizar_num_estudiantes(int num_estudiantes){
        //con el this hacemos refeerencia a variables globales
        this.num_estudiantes = num_estudiantes;
    }

    /**
     * Metodo para actualizar la variable num_docentes
     * @param num_docentes
     */
    public void actualizar_num_docentes(int num_docentes){
        //con el this hacemos refeerencia a variables globales
        this.num_docentes = num_docentes;
    }

    /**
     * Metodo para actualizar la variable infraestructura
     * @param infraestructura
     */
    public void actualizar_infraestructura(String infraestructura){
        //con el this hacemos refeerencia a variables globales
        this.infraestructura = infraestructura;
    }

    /**
     * Metodo para actualizar la variable tipo
     * @param tipo
     */
    public void actualizar_tipo(String tipo){
        //con el this hacemos refeerencia a variables globales
        this.tipo = tipo;
    }

    public void  orientar(){
        System.out.println("Este metodo sirve para orientar");
    }

    public void  investigar(){

    }

    public void  formar(){

    }

    public void  cobrar(){

    }

    public void  certificar(){

    }
}
