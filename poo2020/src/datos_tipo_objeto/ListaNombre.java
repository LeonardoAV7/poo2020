package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombre {
    public static void main(String[] args) {
        //declaracion de variables
        List<String> nomb = new ArrayList<String>();
        int opcion;
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        while(bandera){
            System.out.println("MENU DE OPCIONES :\n1.Agregar nuevo nombre" +
                    "\n2.Presentar lista de nombres\n3.Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nuevo nombre: ");
                    nomb.add(teclado.nextLine());
                    break;
                case 2:
                    for(int i = 0; i < nomb.size(); i++){
                        System.out.println(nomb.get(i));
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
            }

        }
    }
}
