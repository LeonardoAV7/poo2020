package diseniopoo;

public class EstudianteUTPL {
    private double bim1;
    private double bim2;
    private String nombre;
    private String materia;

    public void ficha(double bim1, double bim2, String nombre, String materia){
        double nota3 = bim1 + bim2;
        if(nota3 >=27.5){
            System.out.println("Estudiante: "+ nombre + "\nMateria: " + materia + "\nPromedio: "+ nota3
            + "\nEstado: Aprobado");
        }else{
            System.out.println("Estudiante: "+ nombre + "\nMateria: " + materia + "\nPromedio: "+ nota3
                    + "\nEstado: Reprobado(Supletorio)");
        }
    }

    public EstudianteUTPL(double bim1, double bim2, String nombre, String materia ){
        this.bim2 = bim2;
        this.bim1 = bim1;
        this.nombre = nombre;
        this.materia = materia;
    }

    public double getBim1() {
        return bim1;
    }

    public double getBim2() {
        return bim2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

}
