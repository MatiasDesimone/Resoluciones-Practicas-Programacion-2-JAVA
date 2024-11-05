package empleados;

public class EmpleadoTiempoCompleto extends Empleado{

    private int diasTrabajados;


    public EmpleadoTiempoCompleto(String nombre, String apellido, double salario, int diasTrabajados) {
        super(nombre, apellido, salario);
        this.diasTrabajados = diasTrabajados;;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }


    @Override
    public double calcularPago(){
        return this.diasTrabajados*this.getSalario();
    }
}
