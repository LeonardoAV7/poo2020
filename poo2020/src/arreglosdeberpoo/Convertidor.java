package arreglosdeberpoo;

public class Convertidor {
    private int[] cadenaEntero = new int[6];
    private String binario;
    private int decimal;

    /**
     * Metodo para actualizar la variable binario
     * @param binario
     */
    public void setBinario(String binario) {
        this.binario = binario;
    }
    /**
     * Metodo para calcular el valor de el arreglo cadenaEntero
     */
    public void calcularDecimal(){
        char[] cadenaSeparada = binario.toCharArray();
        for (int i = 0; i <= 5; i++) {
            cadenaEntero[i]= Character.getNumericValue(cadenaSeparada[i]);
        }
        decimal = 0;
        int j = 0;
        for (int i = 5; i >= 0; i--) {
            decimal = decimal + cadenaEntero[i] * ((int)Math.pow(2,j));
            j++;
        }
    }
    /**
     * Metodo para obtener el valor la variable binario
     * @return binario
     */
    public String getBinario() {
        return binario;
    }
    /**
     * Metodo para obtener el valor de el arreglo cadenaEntero
     * @return cadenaEntero
     */
    public int[] getCadenaEntero() {
        return cadenaEntero;
    }
    /**
     * Metodo para obtener el valor de la variable decimal
     * @return decimal
     */
    public int getDecimal() {
        return decimal;
    }
}
