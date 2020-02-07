package diseniopoo;

public class Cerveza {
    private double precio;
    private int unidades_vendidas;
    private String nombre;
    private String tipo;

    public Cerveza(double precio, int unidades_vendidas,String nombre, String tipo ){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public double calcular_ventas(double precio, int unidades_vendidas){
        double total = precio * unidades_vendidas;
        return total;
    }
    //metodo que realiza la presentacion de los datos
    public void presentar(String nombre, String tipo, double precio, int unidades_vendidas){
        System.out.println("Cerveza: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio: " + precio);
        System.out.println("Unidades vendidas: " + unidades_vendidas);
        System.out.println("\nTotal de ventas: $"+ calcular_ventas(precio, unidades_vendidas) );
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
