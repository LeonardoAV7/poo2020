package intropoo;

public class Tiempo {
    // definición de atributos globales
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Metodo para obtener el valor de la variable hora
     * @return hora
     */
    public int  obtener_hora(){
        return hora;
    }

    /**
     * Metodo para obtener el valor de la variable minuto
     * @return minuto
     */
    public int obtener_minuto(){
        return minuto;
    }

    /**
     * Metodo para obtener el valor de la variable segundo
     * @return segundo
     */
    public int obtener_segundo(){
        return segundo;
    }

    /**
     * Metodo para obtener el tiempo en formato hh:mm:ss
     * @return tiempo
     */
    public String obtener_tiempo(){
        String tiempo = hora + ":" + minuto + ":" + segundo;
        return tiempo;
    }

    /**
     * Metodo para actualizar la variable hora
     * @param hora
     */
    public void actualizar_hora(int hora){
        //con el this hacemos refeerencia a variables globales
        this.hora = hora;
    }


    /**
     * Metodo para actualizar la variable minuto
     * @param minuto
     */
    public void actualizar_minuto(int minuto){
        //con el this hacemos refeerencia a variables globales
        this.minuto = minuto;
    }

    /**
     * Metodo para actualizar la variable segundo
     * @param segundo
     */
    public void actualizar_segundo(int segundo){
        //con el this hacemos refeerencia a variables globales
        this.segundo = segundo;
    }

}
