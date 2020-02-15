package taller_repeticion;
// Leonardo Aguilar - Shomira Rosales
import java.util.Scanner;

public class EjecutaMultiplicacion {
    public static void main(String[] args) {
        // entrada de datos
        Scanner entrada = new Scanner(System.in);
        // metodo contructor de la clase
        String opcion;
        System.out.println("\tCalculo de una multiplicacion mediante sumas repetitivas");

        do{
            System.out.println("Ingrese el valor del numero 1: ");
            int num1 = entrada.nextInt();

            System.out.println("Ingrese el  valor del numero 2:");
            int num2 = entrada.nextInt();
            Multiplicacion mult = new Multiplicacion(num1, num2);
            mult.calcular_multiplicacion();
            System.out.println("El resultado de la multiplicacion " + num1 + "*" +num2 + " = " + mult.getResultado());

            entrada.nextLine();
            System.out.println("Desea realizar alguna otra multiplicacion? si/no: ");
            opcion = entrada.nextLine();
            opcion = opcion.toUpperCase();

        }
        while( opcion.equals("SI") );


    }
}
