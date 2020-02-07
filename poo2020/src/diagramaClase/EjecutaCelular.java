package diagramaClase;

public class EjecutaCelular {
    public static void main(String[] args) {
        //creacion de objetos Docente
        Celular celular = new Celular();
        celular.actualizar_precio(600.00);
        celular.actualizar_marca("Xiaomi");
        celular.actualizar_ram("6 RAM");
        celular.actualizar_procesador("Octa-core Max");
        celular.actualizar_bateria("3500 mA");
        celular.actualizar_almacenamiento("64 Gb");

        double t = celular.obtener_precio();
        String t1 = celular.obtener_marca();
        String t2 = celular.obtener_almacenamiento();
        String t3 = celular.obtener_bateria();
        String t4 = celular.obtener_procesador();
        String t5 = celular.obtener_ram();

        celular.llamar();
        celular.grabar();
        celular.navegar();
        celular.mensajear();

    }
}
