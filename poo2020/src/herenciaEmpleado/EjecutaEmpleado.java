package herenciaEmpleado;

import herencia.Estudiante;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        String nombre, cargo, dependencia;
        int hora, opcion;
        double cuota, salarioMensual;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese: \n1. Si es Sueldo por hora \n2. Si es sueldo por empleado asalariado");
        opcion = teclado.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingrese el nombre:");
                nombre= teclado.nextLine();
                System.out.println("Ingrese el cargo:");
                cargo = teclado.nextLine();
                System.out.println("Ingrese la dependencia:");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el numero de horas trabajadas:");
                hora = teclado.nextInt();
                System.out.println("Ingrese el valor de la cuota por hora:");
                cuota = teclado.nextDouble();
                //Creacion de objeto de la Clase EmpleadoHora
                EmpleadoHora empHora = new EmpleadoHora(nombre,cargo,dependencia,hora, cuota);
                System.out.println("--------------------------------------------------");
                System.out.println("Datos de Objeto Estudiante");
                System.out.println("nombre: "+ empHora.getNombre());
                System.out.println("cargo: "+ empHora.getCargo());
                System.out.println("dependencia: "+ empHora.getDependencia());
                System.out.println("sueldo: "+ empHora.getSueldo());
                break;
            case 2:
                System.out.println("Ingrese el nombre:");
                nombre= teclado.nextLine();
                System.out.println("Ingrese el cargo:");
                cargo = teclado.nextLine();
                System.out.println("Ingrese la dependencia:");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el salario mensual del empleado:");
                salarioMensual = teclado.nextDouble();
                //Creacion de objeto de la Clase EmpleadoAsalariado
                EmpleadoAsalariado empSalario = new EmpleadoAsalariado(nombre,cargo,dependencia,salarioMensual);
                System.out.println("--------------------------------------------------");
                System.out.println("Datos de Objeto Estudiante");
                System.out.println("nombre: "+ empSalario.getNombre());
                System.out.println("cargo: "+ empSalario.getCargo());
                System.out.println("dependencia: "+ empSalario.getDependencia());
                System.out.println("sueldo: "+ empSalario.getSalarioMensual());
                break;
        }
    }
}
