package diagramaClase;

public class Estudiante {
    // definición de atributos globales
    private String nombre;
    private String correo;
    private int numero_cedula;
    private String carrera;
    private int ciclo;
    private int promedio;

    /**
     * Metodo para obtener el valor de la variable nombre
     * @return nombre
     */
    public String  obtener_nombre(){
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
     * Metodo para obtener el valor de la variable carrera
     * @return carrera
     */
    public String obtener_carrera(){
        return carrera;
    }

    /**
     * Metodo para obtener el valor de la variable ciclo
     * @return ciclo
     */
    public int obtener_ciclo(){
        return ciclo;
    }

    /**
     * Metodo para obtener el valor de la variable promedio
     * @return promedio
     */
    public int  obtener_promedio(){
        return promedio;
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
     * Metodo para actualizar la variable carrera
     * @param carrera
     */
    public void actualizar_carrera(String carrera){
        //con el this hacemos refeerencia a variables globales
        this.carrera = carrera;
    }

    /**
     * Metodo para actualizar la variable ciclo
     * @param ciclo
     */
    public void actualizar_ciclo(int ciclo){
        //con el this hacemos refeerencia a variables globales
        this.ciclo = ciclo;
    }

    /**
     * Metodo para actualizar la variable promedio
     * @param promedio
     */
    public void actualizar_promedio(int promedio){
        //con el this hacemos refeerencia a variables globales
        this.promedio = promedio;
    }

    public void  estudiar(){

    }

    public void  aprobado_reprobado(){
        if(promedio >14){
            System.out.println("aprobado");
        }else{
            System.out.println("reprobado");
        }
    }

    public void  jugar(){

    }

    public void  aprender(){

    }

    public void  usar_istalaciones(){

    }

}
