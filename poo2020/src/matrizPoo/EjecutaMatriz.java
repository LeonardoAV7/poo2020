package matrizPoo;
import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {

        // Declaraciones
        // Variables
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];


        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCALCULA LA SUMA DE DOS MATRICES\n");

        // Se declara, crea e inicia el objeto de la clase Vectores
        Matriz objMatriz = new Matriz();

        System.out.println("___ INGRESO DE VALORES A LA MATRIZ A   ____");

        for(int i=0; i< 3;i++){
            for(int j= 0; j < 3; j++){
                System.out.print("Ingrese los valores del  Vector para la posicion: [" + i + "][" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }

        System.out.println("____INGRESO DE VALORES A LA MATRIZ B ______");
        for(int i=0; i< 3;i++){
            for(int j= 0; j < 3; j++){
                System.out.print("Ingrese los valores del  Vector para la posicion: [" + i + "][" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }

        // Establecer
        objMatriz.setMatrizA(matrizA);
        objMatriz.setMatrizB(matrizB);

        // Calcular
        objMatriz.sumaMatriz();

        // Imprimir
        System.out.println("--------- Salida ----------");
        System.out.println("Matriz A");
        objMatriz.presentarMatriz(objMatriz.getMatrizA() );
        System.out.println("Matriz B");
        objMatriz.presentarMatriz( objMatriz.getMatrizB() );
        System.out.println("Matriz C");
        objMatriz.presentarMatriz( objMatriz.getMatrizC() );



    }
}
