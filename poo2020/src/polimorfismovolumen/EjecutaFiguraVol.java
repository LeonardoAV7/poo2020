package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaFiguraVol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULO DE  Volumen DE FIGURAS GEOMETRICAS");

        String op = "si";

        while(op.equals("si")) {
            System.out.println("Ingrese la opcion de la figura que desea calcular:\n " +
                    "1.Cubo\n2.Cilindro\n3.Cono\n4.Esfera");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor de una arista del cubo: ");
                    double arista = entrada.nextDouble();
                    // Creacion del objeto
                    CuboP cubo = new CuboP(arista, "Cubo");
                    cubo.calcularVol();
                    System.out.println("El area del Cubo es: " + cubo.getVolCubo());
                    break;
                case 2:
                    System.out.println("Ingrese el radio del Cilindro: ");
                    double radio = entrada.nextDouble();
                    System.out.println("Ingrese la altura del Cilindro: ");
                    double altura = entrada.nextDouble();
                    // Creacion del objeto
                    CilindroP cil = new CilindroP(radio, altura, "Cilindro");
                    cil.calcularVol();
                    System.out.println("El area del Cilindro es:" + cil.getVolCilindro());
                    break;
                case 3:
                    System.out.println("Ingrese el radio del Cono: ");
                    radio = entrada.nextDouble();
                    System.out.println("Ingrese la altura del Cono: ");
                    altura = entrada.nextDouble();
                    // Creacion del objeto
                    ConoP cono = new ConoP(radio, altura, "Cono");
                    cono.calcularVol();
                    System.out.println("El area del Cono es:" + cono.getVolCono());
                    break;
                case 4:
                    System.out.println("Ingrese el radio del Esfera: ");
                    radio = entrada.nextDouble();
                    // Creacion del objeto
                    EsferaP esf = new EsferaP(radio, "Esfera");
                    esf.calcularVol();
                    System.out.println("El area del Esfera es:" + esf.getVolEsfera());
                    break;
                case 5:
                    op = "no";
                    break;
            }
            entrada.nextLine();
            System.out.println("¿Desea calcular el volumen de otra figura? si/no: ");
            op = entrada.nextLine();
        }
    }
}
