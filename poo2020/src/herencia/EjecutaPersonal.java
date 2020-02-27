package herencia;
import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {

        String nombre, identificacion, estado_civil, fecha_nac, carrera;
        String nombreD, identificacionD, estado_civilD, fecha_nacD, area;
        String nombreA, identificacionA, estado_civilA, fecha_nacA, dependencia;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Creacion de Objeto Estudiante");
        System.out.println("Ingrese el nombre:");
        nombre= teclado.nextLine();
        System.out.println("Ingrese la identificacion:");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese estado civil:");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento:");
        fecha_nac = teclado.nextLine();
        System.out.println("Ingrese la carrera del estudiante:");
        carrera = teclado.nextLine();

        System.out.println("Creacion de Objeto Docente");
        System.out.println("Ingrese el nombre:");
        nombreD= teclado.nextLine();
        System.out.println("Ingrese la identificacion:");
        identificacionD = teclado.nextLine();
        System.out.println("Ingrese estado civil:");
        estado_civilD = teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento:");
        fecha_nacD = teclado.nextLine();
        System.out.println("Ingrese el area del docente:");
        area = teclado.nextLine();

        System.out.println("Creacion de Objeto Administrativo");
        System.out.println("Ingrese el nombre:");
        nombreA= teclado.nextLine();
        System.out.println("Ingrese la identificacion:");
        identificacionA = teclado.nextLine();
        System.out.println("Ingrese estado civil:");
        estado_civilA = teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento:");
        fecha_nacA = teclado.nextLine();
        System.out.println("Ingrese la dependencia:");
        dependencia = teclado.nextLine();

        //Creacion de objeto de la Clase Estudiante
        Estudiante est = new Estudiante(carrera,nombre,identificacion,estado_civil,fecha_nac);
        //Creacion de objeto de la Clase Docente
        Docente doc = new Docente(area,nombre,identificacion,estado_civil,fecha_nac);
        //Creacion de objeto de la Clase Administrativo
        Administrativo admi = new Administrativo(dependencia,nombre,identificacion,estado_civil,fecha_nac);

        System.out.println("--------------------------------------------------");
        System.out.println("Datos de Objeto Estudiante");
        System.out.println("nombre: "+ est.getNombre());
        System.out.println("identificacion: "+ est.getIdentificacion());
        System.out.println("carrera: "+ est.getCarrera());
        System.out.println("estado civil: "+ est.getEstado_civil());
        System.out.println("fecha de nacimiento: "+ est.getFecha_nacimiento());

        System.out.println("--------------------------------------------------");
        System.out.println("Datos de Objeto Docente");
        System.out.println("nombre: "+ doc.getNombre());
        System.out.println("identificacion: "+ doc.getIdentificacion());
        System.out.println("area: "+ doc.getArea());
        System.out.println("estado civil: "+ doc.getEstado_civil());
        System.out.println("fecha de nacimiento: "+ doc.getFecha_nacimiento());

        System.out.println("--------------------------------------------------");
        System.out.println("Datos de Objeto Administrativo");
        System.out.println("nombre: "+ admi.getNombre());
        System.out.println("identificacion: "+ admi.getIdentificacion());
        System.out.println("dependencia: "+ admi.getDependencia());
        System.out.println("estado civil: "+ admi.getEstado_civil());
        System.out.println("fecha de nacimiento: "+ admi.getFecha_nacimiento());


    }
}
