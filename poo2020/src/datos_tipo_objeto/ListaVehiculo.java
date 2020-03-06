package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        while(bandera){
            System.out.println("Digite 1 para almacenar nuevos: ");
            System.out.println("Digite 2 para presentar: ");
            System.out.println("Digite 3 para salir: ");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:

                    System.out.println("Ingrese placa: ");
                    String placa = teclado.nextLine();
                    System.out.println("Ingrese marca: ");
                    String marca = teclado.nextLine();
                    System.out.println("Ingrese modelo: ");
                    String modelo = teclado.nextLine();
                    System.out.println("Ingrese año: ");
                    int año = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese color: ");
                    String color = teclado.nextLine();
                    System.out.println("Ingrese cilindraje: ");
                    double cilindraje = teclado.nextDouble();
                    teclado.nextLine();
                    Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, año, color, cilindraje);
                    vehiculos.add(vehiculo);
                    break;
                case 2:
                    //recorremos la lista con foreach
                    //System.out.println("Placa\tMarca\tCilindraje");
                    System.out.println("FICHAS DE VEHICULOS REGISTRADOS");
                    for(Vehiculo v: vehiculos){
                        System.out.println("----------------------------------");
                        System.out.println("PLaca: " + v.getPlaca());
                        System.out.println("Marca: " + v.getMarca());
                        System.out.println("Modelo: " + v.getModelo());
                        System.out.println("Año: " + v.getAño());
                        System.out.println("Color: " + v.getColor());
                        System.out.println("Cilindraje: " + v.getCilindraje());
                        System.out.println("----------------------------------");
                        //System.out.println(v.getPlaca()+ "\t"+v.getMarca()+"\t"+v.getCilindraje());
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }
}
