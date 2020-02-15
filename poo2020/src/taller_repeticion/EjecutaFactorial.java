package taller_repeticion;
// Leonardo Aguilar - Shomira Rosales

import java.util.Scanner;

public class EjecutaFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion = "si";


        while(opcion.equals("si")) {
            System.out.println("numero: ");
            int numero = teclado.nextInt();

            Factorial factorial = new Factorial();
            factorial.setNumero(numero);

            factorial.calcularFactorial();

            System.out.println(factorial.getFactorial());

            teclado.nextLine();
            System.out.println("Desea calcular el sueldo de otro empleado si/no: ");
            opcion = teclado.nextLine();

        }



    }

}
