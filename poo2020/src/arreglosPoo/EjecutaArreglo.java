package arreglosPoo;

import java.util.Scanner;

public class EjecutaArreglo {
    public static void main(String[] args) {
        // Declaraciones
        // Variables
        int vector1[] = new int[10];
        int vector2[] = new int[10];

        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCALCULA EL PRODUCTO DE DOS VECTORES\n");

        // Se declara, crea e inicia el objeto de la clase Vectores
        Arreglo arreglo = new Arreglo();

        System.out.println("--------     Vector A     --------");
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese los valores del  Vector1[" + i + "]: ");
            vector1[i] = entrada.nextInt();
        }

        System.out.println("--------     Vector B     --------");
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese el valor del Vector2[" + i + "]: ");
            vector2[i] = entrada.nextInt();
        }

        // Establecer
        arreglo.setVector1(vector1);
        arreglo.setVector2(vector2);

        // Calcular
        arreglo.calcularSuma_producto();


        // Imprimir
        System.out.println("--------- Salida ----------");
        System.out.println("   Vector A       Vector B");
        for (int i = 0; i <= 9; i++) {
            System.out.println("       " + arreglo.getVector1()[i] + "               " + arreglo.getVector2()[i]);
        }
        System.out.println("Suma = " + arreglo.getSuma_producto());
    }
}
