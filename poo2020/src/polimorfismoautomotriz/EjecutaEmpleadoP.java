package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleadoP {
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
            System.out.println("Ingrese el departamento del empleado(Administrativo, Mecanico o Vendedor): ");
            String departamento = entrada.nextLine();
            System.out.println("Ingrese el puesto del empleado: ");
            String puesto = entrada.nextLine();

            switch(departamento){
                case "Administrativo":
                    System.out.println("Ingrese el valor del sueldo mensual: ");
                    double sueldoM = entrada.nextDouble();
                    // Creacion del objeto
                    AdministrativoP admi = new AdministrativoP();
                    admi.setNombre(nombre);
                    admi.setDepartamento(departamento);
                    admi.setPuesto(puesto);
                    admi.setSueldoM(sueldoM);
                    admi.setRfc(rfc);
                    admi.calcularSueldoQuincenal();
                    reporteA = String.format("%s%s", reporteA,admi.getReporte());
                    break;
                case "Mecanico":
                    MecanicoP mec = new MecanicoP();
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    int numTrabajos = entrada.nextInt();
                    mec.setNombre(nombre);
                    mec.setDepartamento(departamento);
                    mec.setPuesto(puesto);
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
                    VendedorP ven = new VendedorP();
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    int numAutos = entrada.nextInt();
                    ven.setNombre(nombre);
                    ven.setDepartamento(departamento);
                    ven.setPuesto(puesto);
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
                "RFC              NOMBRE                  DEPTO                   PUESTO              SUELDO QUINCENAÑ\n"+
                "_______________________________________________________________________________________________________\n"
                + reporteA + reporteM + reporteV +
                "_______________________________________________________________________________________________________\n");
        System.out.println("Total: "+rfc+" Empleados");
    }
}
