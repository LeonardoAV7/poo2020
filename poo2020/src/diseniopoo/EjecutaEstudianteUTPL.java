package diseniopoo;

import java.util.Scanner;

public class EjecutaEstudianteUTPL {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del estudiante: ");
        String nombre = teclado.nextLine();
        System.out.println("Asignatura: ");
        String materia = teclado.nextLine();
        System.out.println("Nota de primer bimestre ");
        double bim1 = teclado.nextDouble();
        System.out.println("Nota del segundo bimestre: ");
        double bim2 = teclado.nextDouble();

        EstudianteUTPL estudianteUTPL = new EstudianteUTPL(bim1, bim2, nombre, materia);
        estudianteUTPL.ficha(bim1, bim2, nombre, materia);

    }
}
