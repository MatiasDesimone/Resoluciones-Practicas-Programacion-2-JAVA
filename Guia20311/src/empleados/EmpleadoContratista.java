package empleados;

public class EmpleadoContratista extends Empleado{

    private int horasTrabajadas;
    private double tarifaPorProyecto;

    public EmpleadoContratista(String nombre, String apellido, int horasTrabajadas, double tarifaPorProyecto) {
        super(nombre, apellido, horasTrabajadas*tarifaPorProyecto);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorProyecto() {
        return tarifaPorProyecto;
    }

    public void setTarifaPorProyecto(double tarifaPorProyecto) {
        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    @Override
    public double calcularPago(){
        return this.horasTrabajadas*this.tarifaPorProyecto;
    }

}
