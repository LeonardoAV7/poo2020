package diagramaClase;

public class EjecutarUniversidad {
    public static void main(String[] args) {
        //creacion de objetos Docente
        Universidad universidad = new Universidad();
        universidad.actualizar_num_carreras(50);
        universidad.actualizar_num_estudiantes(10000);
        universidad.actualizar_num_docentes(1000);
        universidad.actualizar_infraestructura("15 Edificios");
        universidad.actualizar_tipo("Priivada");

        double t = universidad.obtener_num_carreras();

        System.out.println(t);

    }
}
