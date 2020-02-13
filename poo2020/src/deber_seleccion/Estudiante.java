package deber_seleccion;

public class Estudiante {
    private double calif1;
    private double calif2;
    private double calif3;
    private double calif4;
    private String nombre;
    private double promedio;
    private String comentario;

    public void calcularPromedio(){
        promedio = (calif1 + calif2 + calif3 + calif4) / 4;
    }

    public void calcularComentario(){
        if (promedio >= 60){
            comentario ="Aprobado";
        }else{
            comentario = "Reprobado";
        }
    }
    /**
     * Metodo para obtener el valor de la variable calif1
     * @return calif1
     */
    public double getCalif1() {
        return calif1;
    }
    /**
     * Metodo para actualizar la variable calif1
     * @param calif1
     */
    public void setCalif1(double calif1) {
        this.calif1 = calif1;
    }
    /**
     * Metodo para obtener el valor de la variable calif2
     * @return calif2
     */
    public double getCalif2() {
        return calif2;
    }
    /**
     * Metodo para actualizar la variable calif2
     * @param calif2
     */
    public void setCalif2(double calif2) {
        this.calif2 = calif2;
    }
    /**
     * Metodo para obtener el valor de la variable getCalif3
     * @return getCalif3
     */
    public double getCalif3() {
        return calif3;
    }
    /**
     * Metodo para actualizar la variable calif3
     * @param calif3
     */
    public void setCalif3(double calif3) {
        this.calif3 = calif3;
    }
    /**
     * Metodo para obtener el valor de la variable calif4
     * @return calif4
     */
    public double getCalif4() {
        return calif4;
    }
    /**
     * Metodo para actualizar la variable calif4
     * @param calif4
     */
    public void setCalif4(double calif4) {
        this.calif4 = calif4;
    }
    /**
     * Metodo para obtener el valor de la variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para obtener el valor de la variable promedio
     * @return promedio
     */
    public double getPromedio() {
        return promedio;
    }
    /**
     * Metodo para actualizar la variable promedio
     * @param promedio
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    /**
     * Metodo para obtener el valor de la variable comentario
     * @return comentario
     */
    public String getComentario() {
        return comentario;
    }
    /**
     * Metodo para actualizar la variable comentario
     * @param comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
