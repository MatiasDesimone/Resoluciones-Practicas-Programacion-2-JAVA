import empleado.Empleado;


public class Main {
    public static void main(String[] args) {

        // punto 1

        Empleado empleado1 = new Empleado("23456345", "Carlos", "Gutierrez", 25000);
        Empleado empleado2 = new Empleado("34234123", "Ana", "Sánchez", 27500);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println("Salario anual: " + empleado1.salarioAnual());
        System.out.println("Salario anual: " + empleado2.salarioAnual());

        System.out.println("\nAumento a Carlitos.");
        empleado1.aumentoPorcentual(15);
        System.out.printf("Nuevo sueldo mensual de Carlitos: %.2f", empleado1.getSalario());


    }
}