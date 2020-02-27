package herencia;

/**
 * Clase que hereda de la clase Persona
 * Contendra todos los atributos y metodos definidos en Persona
 */
public class Estudiante extends Persona{

    public Estudiante(String carrera,String nombre, String identificacion, String estado_civil, String fecha_nacimiento){
        this.carrera = carrera;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.estado_civil=estado_civil;
        this.fecha_nacimiento= fecha_nacimiento;
    }
    //atributos propios de esta clase
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void matricular(){
        System.out.println("Metodo para matricular");
    }
    public void aprender(){
        System.out.println("Metodo para aprender");
    }
}
