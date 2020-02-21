package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaraciones
        String num;

        System.out.println("Ingrese el numero de cedula:");
        num = teclado.nextLine();

        // Se declara, crea e inicia el objeto de la clase Cedula
        Cedula cedula = new Cedula();

        // Establecer
        cedula.setCedula(num);
        
        // Imprimir
        System.out.printf("El numero de cedula: %s %s.\nCon verificador: %s", cedula.getCedula(),
                cedula.verificarCedula(), cedula.getVerificador());


    }
}
