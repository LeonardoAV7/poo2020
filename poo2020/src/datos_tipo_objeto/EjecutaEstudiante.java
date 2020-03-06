package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        //declaracion de variables
        int cont;
        int opcion;
        Estudiante [] estudiantes = new Estudiante[3];
        Estudiante estudiante;
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < estudiantes.length;i++){

            Estudiante est = new Estudiante();
            System.out.println("Ingrese el nombre: ");
            est.setNombre(teclado.nextLine());
            System.out.println("Ingrese el numero de cedula: ");
            est.setCedula(teclado.nextLine());
            System.out.println("Ingrese la edad: ");
            est.setEdad(teclado.nextInt());
            teclado.nextLine();
            System.out.println("Ingrese la carrera: ");
            est.setCarrera(teclado.nextLine());
            System.out.println("Ingrese el correo electronico: ");
            est.setCorreo(teclado.nextLine());
            estudiantes[i] = est;

        }
        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("Cedula\tNombre");
        int edad_acum = 0;
        for(int i = 0; i < estudiantes.length; i++){
            edad_acum = edad_acum + estudiantes[i].getEdad();
            System.out.println(estudiantes[i].getNombre()+"\t"+estudiantes[i].getCedula());
        }
        System.out.println("EDAD PROMEDIO DE LOS ESTUDIANTES: " + edad_acum/estudiantes.length);

        System.out.println("FIN DEL PROGRAMA");
    }
}
