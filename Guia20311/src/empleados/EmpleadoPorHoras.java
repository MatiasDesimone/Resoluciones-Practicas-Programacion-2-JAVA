package empleados;

public class EmpleadoPorHoras extends Empleado{

    private double sueldoPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, String apellido, double sueldoPorHora, int horasTrabajadas) {
        super(nombre, apellido, sueldoPorHora*horasTrabajadas);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago(){
        return this.sueldoPorHora*this.horasTrabajadas;
    }
}
