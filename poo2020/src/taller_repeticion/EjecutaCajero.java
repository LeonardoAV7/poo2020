package taller_repeticion;
// Leonardo Aguilar - Shomira Rosales
import java.util.Scanner;

public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldoInicial;
        String  opcion2;
        int opcion;
        System.out.println("\tCAJERO AUTOMATICO");
        System.out.println("Ingrese  su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el  valor inicial de su cuenta:");
        saldoInicial = entrada.nextDouble();
        entrada.nextLine();

        Cajero cajero1 = new Cajero(nombre,saldoInicial);
        // Metodo do while que se ejecutara una vez y luego evalua la opcion de seguir o no del usuario
        do{
            System.out.println("Ingrese el numero de opcion que desea:\n1.Retiro.\n2.Deposito\n3.Consulta de Saldo");
            opcion = entrada.nextInt();
            cajero1.getSaldoInicial();
            switch (opcion) {
                case 1:
                    System.out.println("ingresar valor a retirar");
                    double cant_retiro = entrada.nextDouble();
                    cajero1.calcularRetiro(cant_retiro);
                    entrada.nextLine();
                    System.out.println("Cantidad de dinero actual: " + cajero1.getSaldoInicial());
                    break;

                case 2:
                    System.out.println("Ingresar valor a depositar");
                    double cant_deposito = entrada.nextDouble();

                    entrada.nextLine();

                    cajero1.calcularDeposito(cant_deposito);
                    System.out.println("Cantidad depositada de dinero: " + cajero1.getSaldoInicial());
                    break;

                case 3:
                    System.out.println("Saldo de la  cuenta:" + cajero1.getSaldoInicial());
                    break;
                default:
                    System.out.println("no ha ingresado ninguna opcion, eliga una porfavor ");

            }

            System.out.println("Desea realizar algun otro proceso? si/no: ");
            opcion2 = entrada.nextLine();
            opcion2 = opcion2.toUpperCase();

        }
        while( opcion2.equals("SI") );


    }
}
