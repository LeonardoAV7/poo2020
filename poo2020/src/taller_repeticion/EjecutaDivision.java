package taller_repeticion;
// Leonardo Aguilar - Shomira Rosales
import java.util.Scanner;

public class EjecutaDivision {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion = "si";


        while(opcion.equals("si")) {
            System.out.println("dividendo: ");
            int numero1 = teclado.nextInt();
            System.out.println("divisor: ");
            int numero2 = teclado.nextInt();

            Division division = new Division();
            division.setNumero1(numero1);
            division.setNumero2(numero2);

            division.calcularDivision();

            System.out.println(division.getDivision());

            teclado.nextLine();
            System.out.println("Desea calcular el sueldo de otro empleado si/no: ");
            opcion = teclado.nextLine();

        }



    }
}
