package diagramaClase;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        //creacion de objetos Docente
        Vehículo vehiculo = new Vehículo();
        vehiculo.actualizar_marca("Audi");
        vehiculo.actualizar_precio(10000);
        vehiculo.actualizar_capacidad(5);
        vehiculo.actualizar_tipo("Couple");
        vehiculo.actualizar_origen("Alemania");

        String t = vehiculo.obtener_marca();

        System.out.println(t);

    }
}
