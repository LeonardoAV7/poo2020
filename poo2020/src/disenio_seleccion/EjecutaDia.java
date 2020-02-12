package disenio_seleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = teclado.nextInt();


        Dia dia = new Dia();

        dia.setNombre(num);
        dia.calcularNombre();

        System.out.println("Nombre Dia: "+ dia.getNombre());

    }
}
