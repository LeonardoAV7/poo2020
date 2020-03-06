package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("SISTEMA DE INGRESO DE Estudiantes");
        while(bandera){
            System.out.println("Digite 1 para almacenar nuevos: ");
            System.out.println("Digite 2 para presentar: ");
            System.out.println("Digite 3 para salir: ");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:

                    System.out.println("Ingrese nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese cedula: ");
                    String cedula = teclado.nextLine();
                    System.out.println("Ingrese carrera: ");
                    String carrera = teclado.nextLine();
                    System.out.println("Ingrese edad: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese correo: ");
                    String correo = teclado.nextLine();
                    Estudiante est = new Estudiante(nombre, cedula, edad, carrera, correo);
                    estudiantes.add(est);
                    break;
                case 2:
                    //recorremos la lista con foreach
                    System.out.println("FICHAS DE Estudiantes REGISTRADOS");
                    for(Estudiante e: estudiantes){
                        System.out.println("----------------------------------");
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Cedula: " + e.getCedula());
                        System.out.println("Edad: " + e.getEdad());
                        System.out.println("Carrera: " + e.getCarrera());
                        System.out.println("Correo: " + e.getCorreo());
                        System.out.println("----------------------------------");
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }
}
