package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULO DE REPORTE DE EMPLEADOS");
        int rfc=1;
        String reporteA="";
        String reporteM="";
        String reporteV="";
        String op = "si";

        while (op.equals("si")) {
            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el departamento del empleado: ");
            String departamento = entrada.nextLine();
            System.out.println("Ingrese el puesto del empleado: ");
            String puesto = entrada.nextLine();

            switch(departamento){
                case "Administrativo":
                    System.out.println("Ingrese el valor del sueldo mensual: ");
                    double sueldoM = entrada.nextDouble();
                    // Creacion del objeto
                    Administrativo admi = new Administrativo();
                    admi.setSueldoM(sueldoM);
                    admi.setRfc(rfc);
                    admi.calcularSueldoQuincenal();
                    reporteA = String.format("%s%s", reporteA,admi.getReporte());
                    break;
                case "Mecanico":
                    Mecanico mec = new Mecanico();
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    int numTrabajos = entrada.nextInt();
                    mec.setNumTrabajos(numTrabajos);
                    mec.setRfc(rfc);
                    for(int i=0; i<numTrabajos;i++){
                        System.out.println("Ingrese el precio del trabajo: "+ i);
                        double precioTrabajo = entrada.nextDouble();
                        mec.setPrecioTrabajo(precioTrabajo);
                        mec.calcularSueldoQuincenal();
                    }
                    reporteM = String.format("%s%s", reporteM,mec.getReporte());
                    break;
                case "Vendedor":
                    Vendedor ven = new Vendedor();
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    int numAutos = entrada.nextInt();
                    ven.setNumAutos(numAutos);
                    ven.setRfc(rfc);
                    for(int i=0; i<numAutos;i++){
                        System.out.println("Ingrese el precio del trabajo: "+ i);
                        double precioAuto = entrada.nextDouble();
                        ven.setPrecioAuto(precioAuto);
                        ven.calcularSueldoQuincenal();
                    }
                    reporteV = String.format("%s%s", reporteV,ven.getReporte());
                    break;

            }

            rfc= rfc+1;

            entrada.nextLine();
            System.out.println("¿Desea calcular el reporte de otro empleado? si/no: ");
            op = entrada.nextLine();
        }
        System.out.println("\t   ---------------Reporte de Deudores---------------\n"+
                "RFC        NOMBRE        DEPTO        PUESTO        SUELDO QUINCENAÑ\n"+
                "____________________________________________________________________\n"
                + reporteA + reporteM + reporteV +
                "____________________________________________________________________\n");
        System.out.println("Total: "+rfc+" Empleados");
    }

}
