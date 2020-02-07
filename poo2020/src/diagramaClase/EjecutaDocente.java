package diagramaClase;

public class EjecutaDocente {
    public static void main(String[] args) {
        //creacion de objetos Docente
        Docente docente = new Docente();
        docente.actualizar_nombre("Lenovo");
        docente.actualizar_correo("9th Gen");
        docente.actualizar_numero_cedula(1704469550);
        docente.actualizar_titulo("30/01/2025");
        docente.actualizar_area_trabajo("6 hrz");

        String t = docente.obtener_nombre();
        String t1 = docente.obtener_correo();
        String t2 = docente.obtener_area_trabajo();
        String t3 = docente.obtener_titulo();
        int t4 = docente.obtener_numero_cedula();

    }
}
