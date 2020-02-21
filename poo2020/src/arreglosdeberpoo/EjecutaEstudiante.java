package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Declaraciones
        // Variables
        String nombre[] = new String[5];
        int edad[] = new int[5];
        String universidad[] = new String[5];
        String celular[] = new String[5];

        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        // Se declara, crea e inicia el objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante();

        System.out.println("--------     Vector A     --------");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el nombre del  estudiante " + i + ": ");
            nombre[i] = entrada.nextLine();
            System.out.print("Ingrese la edad del  estudiante " + i + ": ");
            edad[i] = entrada.nextInt();
            System.out.print("Ingrese la universidad del  estudiante " + i + ": ");
            universidad[i] = entrada.nextLine();
            System.out.print("Ingrese la edad del  estudiante " + i + ": ");
            celular[i] = entrada.nextLine();
        }


        // Establecer
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        estudiante.setUniversidad(universidad);
        estudiante.setCelular(celular);

        // Imprimir

        estudiante.imprimirFicha();
    }
}
