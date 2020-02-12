package disenio_seleccion;

public class Dia {
    private int num;
    private String nombre;

    /**
     * Metodo para obtener el nombre del dia
     */
    public void calcularNombre() {
         switch(num) {
            case 1 : nombre = "Domingo" ;
            break;
            case 2 : nombre = "Lunes";
            break;
            case 3 : nombre = "Martes";
            break;
            case 4 : nombre = "Miercoles";
            break;
            case 5 : nombre = "Jueves";
            break;
            case 6 : nombre = "Viernes";
            break;
            case 7 : nombre = "Sabado";
            break;
            default: nombre = "Opcion Incorrecta";
            break;
        }
    }


    /**
     * Metodo para actualizar la variable nombre
     * @param num
     */
    public void setNombre(int num){
        //con el this hacemos refeerencia a variables globales
        this.num = num;
    }
    /**
     * Metodo para obtener el valor de la variable sueldo
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

}
