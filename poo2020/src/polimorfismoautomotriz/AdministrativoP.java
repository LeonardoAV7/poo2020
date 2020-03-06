package polimorfismoautomotriz;

public class AdministrativoP extends EmpleadoP{
    private double sueldoM;

    @Override
    public void calcularSueldoQuincenal(){

        sueldoQuincenal = sueldoM / 2;
        setReporte(String.format("%d                 %s                %s                 %s                 %.2f\n"
                ,rfc,nombre,departamento,puesto, sueldoQuincenal));
    }

    public double getSueldoM() {
        return sueldoM;
    }

    public void setSueldoM(double sueldoM) {
        this.sueldoM = sueldoM;
    }
}
