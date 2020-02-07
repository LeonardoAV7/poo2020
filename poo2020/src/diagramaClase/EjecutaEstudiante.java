package diagramaClase;

import intropoo.Tiempo;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        //creacion de objetos Estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_nombre("Leonardo");
        estudiante.actualizar_correo("aguilarv@gmail.com");
        estudiante.actualizar_numero_cedula(1704469550);
        estudiante.actualizar_carrera("Computación");
        estudiante.actualizar_ciclo(3);
        estudiante.actualizar_promedio(38);

        String t = estudiante.obtener_nombre();

        System.out.println(t);

    }
}
