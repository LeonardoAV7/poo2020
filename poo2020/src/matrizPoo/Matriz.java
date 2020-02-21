package matrizPoo;

public class Matriz {
    private int[][] matrizA = new int[3][3] ;
    private int[][] matrizB = new int[3][3] ;
    private int[][] matrizC = new int[3][3] ;
    /**
     * Metodo para sumar dos matrices en una tercera matriz
     */
    public void sumaMatriz(){
        for(int i=0; i< matrizA.length;i++){
            for(int j= 0; j< matrizB.length; j++){
                matrizC [i][j]=  matrizA[i][j] + matrizB[i][j];
            }
        }
    }
    /**
     * Metodo para imprimir una matriz
     */
    public void presentarMatriz (int[][] matriz){
        for(int i=0; i< matriz.length;i++){
            for(int j= 0; j< matriz.length; j++){
                System.out.print(matriz[i][j]);;
            }
            System.out.println();
        }
    }
    /**
     * Metodo para obtener el valor de matrizA
     * @return matrizA
     */
    public int[][] getMatrizA() {
        return matrizA;
    }
    /**
     * Metodo para actualizar la matriz matrizA
     * @param matrizA
     */
    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }
    /**
     * Metodo para obtener el valor de matrizB
     * @return matrizB
     */
    public int[][] getMatrizB() {
        return matrizB;
    }
    /**
     * Metodo para actualizar la matriz matrizB
     * @param matrizB
     */
    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }
    /**
     * Metodo para obtener el valor de matrizC
     * @return matrizC
     */
    public int[][] getMatrizC() {
        return matrizC;
    }

}
