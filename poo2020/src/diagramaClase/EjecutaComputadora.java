package diagramaClase;

public class EjecutaComputadora {
    public static void main(String[] args) {
        //creacion de objetos Computadora
        Computadora computadora = new Computadora();
        computadora.actualizar_marca("Lenovo");
        computadora.actualizar_generacion("9th Gen");
        computadora.actualizar_procesador("Core i7");
        computadora.actualizar_fecha_compra("30/01/2025");
        computadora.actualizar_velocidad_procesador("6 hrz");

        String t = computadora.obtener_marca();
        String t1 = computadora.obtener_generacion();
        String t2 = computadora.obtener_procesador();
        String t3 = computadora.obtener_fecha_compra();
        String t4 = computadora.obtener_velocidad_procesador();

        computadora.mostrar();
        computadora.procesar();
        computadora.almacenar();
        computadora.buscar();


    }
}
