package herencia;
/**
 * Clase que hereda de la clase Persona
 * Contendra todos los atributos y metodos definidos en Persona
 */
public class Docente extends Persona{
    //atributos propios de esta clase
    private String area;

    public Docente(String area,String nombre, String identificacion, String estado_civil, String fecha_nacimiento){
        this.area = area;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.estado_civil=estado_civil;
        this.fecha_nacimiento= fecha_nacimiento;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void enseñar(){
        System.out.println("Metodo para enseñar");
    }
    public void calificar(){
        System.out.println("Metodo para calificar");
    }

}
