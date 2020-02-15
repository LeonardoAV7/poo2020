package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;

        System.out.println("cuota por hora: ");
        double cuota = teclado.nextDouble();
        teclado.nextLine();

        do{
            System.out.println("Nombre del empleado: ");
            String nombre = teclado.nextLine();
            System.out.println("horas trabajadas: ");
            int horas = teclado.nextInt();

            Empleado empleado = new Empleado(nombre, horas);
            empleado.setCuota(cuota);
            empleado.calcularSueldo();

            System.out.println("Nombre: "+ empleado.getNombre()+ "\nSueldo: "+ empleado.getSueldo());

            teclado.nextLine();
            System.out.println("Desea calcular el sueldo de otro empleado si/no: ");
            opcion = teclado.nextLine();


        }
        while(opcion.equals("si"));





    }
}
