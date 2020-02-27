package herenciaEmpleado;

public class EmpleadoAsalariado extends Empleado{
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre,String cargo, String dependencia, double salarioMensual){
        this.cargo = cargo;
        this.nombre = nombre;
        this.dependencia = dependencia;
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    public void calcularSalarioMensual(){
        System.out.println("El salario mensual del empleado es " + salarioMensual);
    }
}
