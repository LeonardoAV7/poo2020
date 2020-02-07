package intropoo;

public class EjecutaTiempo {

    public static void main(String[] args) {
        //creacion de objetos Tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(13);
        tiempo.actualizar_minuto(20);
        tiempo.actualizar_segundo(50);

        String t = tiempo.obtener_tiempo();

        System.out.println(t);

    }

}
