package diseniopoo;

import intropoo.Persona;

import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de la cerveza: ");
        String nombre = teclado.nextLine();
        System.out.println("Tipo de la cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese el costo: ");
        double costo = teclado.nextDouble();
        System.out.println("Ingrese el numero de unidades vendidas: ");
        int unidades = teclado.nextInt();


        //creacion de objeto, con iniciacion de variable
        Cerveza cerveza = new Cerveza(costo, unidades, nombre, tipo);
        cerveza.presentar(nombre, tipo, costo, unidades);

    }
}
