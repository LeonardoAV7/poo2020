package arreglosdeberpoo;

public class Cedula {
    private String cedula;
    private int verificador;
    private int [] coef = {2,1,2,1,2,1,2,1,2};
    private int prdoucto;
    private int suma = 0;

    /**
     * Metodo para actualizar la variable binario
     * @param cedula
     */
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    /**
     * Metodo parse para convertir un String a un arreglo de enteros
     * @return arreglo
     */
    public int[] parse(){
        int[] arreglo = new int[cedula.length()];
        for(int i=0; i<cedula.length(); i++){
            arreglo[i] = Character.getNumericValue(cedula.charAt(i));
        }
        return arreglo;
    }

    /**
     * Metodo para obtener suma
     * @return suma
     */
    public int obtenerSuma(){
        for (int i = 0; i < 9; i++) {
            prdoucto = parse()[i] * coef[i];
            if (prdoucto >= 10){
                prdoucto = prdoucto - 9;
            }
            suma = suma + prdoucto;
        }
        return suma;
    }
    /**
     * Metodo para verificar si la cedula esta correcta
     * @return cadena
     */
    public String  verificarCedula(){
        String cadena = "";
        verificador = 0;
        verificador = 10 - (obtenerSuma()%10);
        if (verificador == 10){
            verificador = 0;
        }
        if (verificador == parse()[9]){
            cadena = "es correcto";
        }else{
            cadena = "es incorrecto";
        }
        return cadena;
    }
    /**
     * Metodo para obtener el valor la variable cedula
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }
    /**
     * Metodo para obtener el valor la variable verificador
     * @return verificador
     */
    public int getVerificador() {
        return verificador;
    }
}
