package arreglosPoo;

import java.util.Scanner;

public class EjecutaEjercicio1212 {
    public static void main(String[] args) {
        // Declaraciones
        // Variables
        double vector[] = new double[15];
        double desviacion[] = new double[15];

        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        // Se declara, crea e inicia el objeto de la clase Vectores
        Ejercicio1212 ejercicio1012 = new Ejercicio1212();

        System.out.println("--------     Vector A     --------");
        for (int i = 0; i <= 14; i++) {
            System.out.print("Ingrese el valor del  Vector[" + i + "]: ");
            vector[i] = entrada.nextInt();
        }

        // Establecer
        ejercicio1012.setVector(vector);

        // Calcular
        ejercicio1012.calcularMedia();
        ejercicio1012.calcularDesviacion();


        // Imprimir
        System.out.println("   Vector A         Vector B");
        System.out.println("____________________________");
        for (int i = 0; i <= 14; i++) {
            System.out.println("    " + ejercicio1012.getVector()[i] + "               "
                    + ejercicio1012.getDesviacion()[i]);
        }
    }
}
