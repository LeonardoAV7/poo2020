package arreglosPoo;

import java.util.Scanner;

public class Ejecuta6112 {
    public static void main(String[] args) {
        // Declaraciones
        // Variables
        int vector1[] = new int[10];
        int vector2[] = new int[10];
        int vector3[] = new int[10];

        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        // Se declara, crea e inicia el objeto de la clase Vectores
        Ejercicio6112 ejercicio6112 = new Ejercicio6112();

        System.out.println("--------     Vector A     --------");
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese el valor del  Vector1[" + i + "]: ");
            vector1[i] = entrada.nextInt();
        }

        System.out.println("--------     Vector B     --------");
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese el valor del Vector2[" + i + "]: ");
            vector2[i] = entrada.nextInt();
        }

        // Establecer
        ejercicio6112.setVector1(vector1);
        ejercicio6112.setVector2(vector2);

        // Calcular
        ejercicio6112.calcularVector3();


        // Imprimir
        System.out.println("   Vector A   +    Vector B   =   Vector C");
        System.out.println("___________________________________________");
        for (int i = 0; i <= 9; i++) {
            System.out.println("       " + ejercicio6112.getVector1()[i] + "               "
                    + ejercicio6112.getVector2()[i] + "               " + ejercicio6112.getVector3()[i]);
        }
    }
}
