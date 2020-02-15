package disenio_repeticion;

public class Empleado {
    private double cuota;
    private int horas;
    private String nombre;
    private double sueldo;

    /**
     * Metodo calcular el sueldo
     */
    public void calcularSueldo(){
        if(horas <= 40){
            sueldo = horas*cuota;
        }else{
            sueldo = (40*cuota)+ (horas-40)*cuota*2;
        }
    }
    /**
     * Metodo Constructor
     * @param nombre, horas
     */
    public Empleado(String nombre, int horas ){
        this.nombre = nombre;
        this.horas = horas;
    }
    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre){
        //con el this hacemos refeerencia a variables globales
        this.nombre = nombre;
    }
    /**
     * Metodo para actualizar la variable cuota
     * @param cuota
     */
    public void setCuota(double cuota){
        //con el this hacemos refeerencia a variables globales
        this.cuota = cuota;
    }
    /**
     * Metodo para actualizar la variable horas
     * @param horas
     */
    public void setHoras(int horas){
        //con el this hacemos refeerencia a variables globales
        this.horas = horas;
    }
    /**
     * Metodo para obtener el valor de la variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener el valor de la variable sueldo
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }
}
