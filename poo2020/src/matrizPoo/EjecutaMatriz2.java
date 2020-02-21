package matrizPoo;
import java.util.Scanner;
public class EjecutaMatriz2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de las filas de la matriz: ");
        int fil = teclado.nextInt();
        System.out.println("Ingrese el tamaño de las columnas de la matriz: ");
        int col = teclado.nextInt();

        int[][] matrizA = new int[fil][col];

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Ingrese número matriz A, posicion: " + i+"."+j);
                matrizA[i][j] = teclado.nextInt();
            }
        }


        Matriz2 matriz2 = new Matriz2(fil, col, matrizA);
        matriz2.presentar();
    }
}
