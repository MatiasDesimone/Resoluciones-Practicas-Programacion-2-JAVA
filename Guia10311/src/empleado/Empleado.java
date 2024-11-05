package empleado;

public class Empleado {
    String dni;
    String nombre;
    String apellido;
    double salario;

    public Empleado(String dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado --------------" + "\ndni= " + dni + "\nnombre= " + nombre + "\napellido= " + apellido + "\nsalario= " + salario + "\n--------------------------\n";
    }

    public double salarioAnual(){
        return this.salario*12;
    }

    public void aumentoPorcentual(float porcentaje){
        this.salario = this.salario*((porcentaje/100)+1);
    }

}
