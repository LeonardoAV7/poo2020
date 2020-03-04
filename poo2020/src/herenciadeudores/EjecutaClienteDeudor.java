package herenciadeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaración de variables
        String nombre, numCuenta, op, reporteP = "", reporteH = "", reporteA = "";
        double capital;
        int total = 0;
        int numCliente1 = 0, numCliente2 = 0, numCliente3 = 0, plazo,n;
        //Ciclo repetitivo para mostrar el menú las veces que el usuario desee
        do {
            total ++;
            System.out.println("_________________________________________");
            System.out.println("Banco del Ecuador");
            System.out.print("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el numero de cuenta: ");
            numCuenta = entrada.nextLine();
            System.out.print("Ingrese el capital: ");
            capital = entrada.nextDouble();
            System.out.print("Ingrese el plazo: ");
            plazo = entrada.nextInt();
            do{
                // Menu para pedir lo que el usuario desea
                System.out.println("Elija el tipo de prestamo  ");
                System.out.println(" 1) Ingreso por prestamo personal");
                System.out.println(" 2) Ingreso por prestamo hipotecario");
                System.out.println(" 3) Ingreso por prestamo automovil");
                n = entrada.nextInt();
            }while(n > 3 || n < 1);
            switch (n) {
                case 1:
                    // Prestamo personal
                    numCliente1++;
                    PrestamoPersonal personal = new PrestamoPersonal(numCliente1, nombre, numCuenta, capital, plazo);
                    personal.calcularInteresPagar();
                    reporteP = String.format("%s%s", reporteP,personal.getReporte());
                    break;
                case 2:
                    // Prestamo hipotecario
                    numCliente2++;
                    PrestamoHipotecario hipotecario = new PrestamoHipotecario(numCliente2, nombre, numCuenta, capital, plazo);
                    hipotecario.calcularInteresPagar();
                    reporteH = String.format("%s%s", reporteH,hipotecario.getReporte());
                    break;
                case 3:
                    // Prestamo Automovil
                    numCliente3++;
                    PrestamoAuto automovil = new PrestamoAuto(numCliente3, nombre, numCuenta, capital, plazo);
                    automovil.calcularInteresPagar();
                    reporteA = String.format("%s%s", reporteA,automovil.getReporte());
                    break;
            }
            entrada.nextLine();
            System.out.println("¿Desea calcular el reporte de otro deudor? si/no:");
            op = entrada.nextLine();
        }while (op.toLowerCase().equals("si"));

        System.out.println("\t   ---------------Reporte de Deudores---------------\n"+
                "No. Cliente        Nombre        No. Cuenta        Interés por pagar\n"+
                "____________________________________________________________________\n"
                + reporteP + reporteH + reporteA +
                "____________________________________________________________________\n");
        System.out.println("Total: "+total+" Clientes");
    }
}
