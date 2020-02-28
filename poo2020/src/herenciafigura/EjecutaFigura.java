package herenciafigura;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("CALCULO DEM  AREA DE FIGURAS GEOMETRICAS");
        System.out.println("Ingrese el nombre de la figura que desea calcular:\n " +
                "1.Circulo\n2.Cuadrado\n3.Rectangulo\n4.Triangulo");
        String opcion = entrada.nextLine();

        switch(opcion ){
            case "Circulo":
                System.out.println("Ingrese el radio del circulo: ");
                double radio = entrada.nextDouble();
                // Creacion del objeto
                Circulo Cir = new Circulo(radio, opcion);
                Cir.calcularAreaCir();
                System.out.println("El area del Triangulo con un radio de " + radio+ "es:" +Cir.getAreaCir());
                break;
            case "Cuadrado":
                System.out.println("Ingrese el valor un lado del cuadrado: ");
                double lado = entrada.nextDouble();
                // Creacion del objeto
                Cuadrado Cuad = new Cuadrado(lado,opcion);
                Cuad.calcularAreaCuad();
                System.out.println("El area del Cuadrado es: " + Cuad.getAreaCuad());
                break;
            case "Rectangulo":
                System.out.println("Ingrese el valor la base del Rectangulo: ");
                double base = entrada.nextDouble();

                System.out.println("Ingrese el valor de la altura del Rectangulo: ");
                double altura = entrada.nextDouble();
                // Creacion del objeto
                Rectangulo Rect= new Rectangulo(base, altura ,opcion);
                Rect.calcularAreaRect();

                System.out.println("El area del Rectangulo es: " + Rect.getAreaRecta());
                break;
            case "Triangulo":
                System.out.println("Ingrese el valor la base del Rectangulo: ");
                double baseT= entrada.nextDouble();

                System.out.println("Ingrese el valor de la altura del Triangulo: ");
                double alturaT = entrada.nextDouble();
                // Creacion del objeto
                Triangulo Tri = new Triangulo(baseT, alturaT ,opcion);
                Tri.calcularAreaTri();


                System.out.println("El area del Triangulo  es: " + Tri.getAreaTria());
                break;

        }
    }
}
