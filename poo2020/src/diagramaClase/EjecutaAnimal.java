package diagramaClase;

public class EjecutaAnimal {
    public static void main(String[] args) {
        //creacion de objetos Docente
        Animal animal = new Animal();
        animal.actualizar_tipo("carnivoro");
        animal.actualizar_region("Africana");
        animal.actualizar_sexo("Masculino");
        animal.actualizar_especie("constrictor");
        animal.actualizar_tipo_reproduccion("oviparos");

        String t = animal.obtener_tipo();
        String t1 = animal.obtener_region();
        String t2 = animal.obtener_sexo();
        String t3 = animal.obtener_especie();
        String t4 = animal.obtener_tipo_reproduccion();

        animal.repirar();
        animal.alimentarse();
        animal.reproducirse();

    }
}
