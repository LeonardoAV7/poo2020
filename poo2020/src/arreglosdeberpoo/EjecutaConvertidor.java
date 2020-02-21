package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaConvertidor {
    public static void main(String[] args) {
        // Declaraciones
        String decimal;

        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        // Se declara, crea e inicia el objeto de la clase Convertidor
        Convertidor convertidor = new Convertidor();

        System.out.println("Ingrese el numero binario de 6 cifras: ");
        decimal = entrada.nextLine();

        // Establecer
        convertidor.setBinario(decimal);
        convertidor.calcularDecimal();

        // Imprimir
        System.out.println("------Solucion-------");
        System.out.println(convertidor.getBinario()+" en binario = "+convertidor.getDecimal()+" en decimal");
    }
}
