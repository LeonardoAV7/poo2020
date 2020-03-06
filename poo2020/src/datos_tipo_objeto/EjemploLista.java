package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        //Creacion  de una lista en java
        //para almacenar valores de tipo String
        List<String> univ = new ArrayList<String>();
        univ.add("utpl");
        System.out.println("tamaño de la lista: " + univ.size());
        univ.add("ESPOL");
        System.out.println("tamaño de la lista: " + univ.size());
        univ.add("UNL");
        System.out.println("tamaño de la lista: " + univ.size());
        //eliminacion del elemento en la posicion 1
        univ.remove(1);
        System.out.println("tamaño de la lista luego de eliminar elemento: " + univ.size());
        //recorremos la lista para presentar valores
        System.out.println("VALORES DE LA LISTA");
        //reemplazamos valores de una posicion indicada en nuestra lista
        univ.set(1,"UIDE");
        for(int i = 0; i < univ.size(); i++){
            System.out.println(univ.get(i));
        }
        //foreach para recorrer lista de universidades
        for(String i : univ){
            System.out.println(i);
        }
    }
}
