import empleados.Empleado;
import empleados.EmpleadoContratista;
import empleados.EmpleadoPorHoras;
import empleados.EmpleadoTiempoCompleto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Empleado empleado1 = null;
        Empleado empleado2 = null;
        Empleado empleado3 = null;

        boolean salir = false;

        while(!salir){
            Main.menu();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:

                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido del empleado: ");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el salario por dia: ");
                    double salarioPorDia = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese los dias trabajados: ");
                    int diasTrabajados = scanner.nextInt();
                    scanner.nextLine();
                    empleado1 = new EmpleadoTiempoCompleto(nombre, apellido,salarioPorDia,diasTrabajados);
                    System.out.println("Empleado a tiempo completo agregado.");

                    break;

                case 2:

                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombrePorHora = scanner.next();
                    System.out.print("Ingrese el apellido del empleado: ");
                    String apellidoPorHora = scanner.next();
                    System.out.print("Ingrese el precio por hora: ");
                    double precioPorHora = scanner.nextDouble();
                    System.out.print("Ingrese las horas trabajadas: ");
                    int horasTrabajadas = scanner.nextInt();
                    empleado2 = new EmpleadoPorHoras(nombrePorHora,apellidoPorHora,precioPorHora,horasTrabajadas);
                    System.out.println("Empleado por horas agregado.");

                    break;

                case 3:

                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreContratista = scanner.next();
                    System.out.print("Ingrese el apellido del empleado: ");
                    String apellidoContratista = scanner.next();
                    System.out.print("Ingrese la tarifa por proyecto: ");
                    double tarifaPorProyecto = scanner.nextDouble();
                    System.out.print("Ingrese las horas trabajadas: ");
                    int horasProyecto = scanner.nextInt();
                    empleado3 = new EmpleadoContratista(nombreContratista, apellidoContratista, horasProyecto, tarifaPorProyecto);
                    System.out.println("Empleado contratista agregado.");

                    break;

                case 4:

                    System.out.println("\n--- Pagos de Empleados ---");

                    if (empleado1 != null) {
                        System.out.println(empleado1.getNombre() + " - Pago: $" + empleado1.calcularPago());
                    }

                    if (empleado2 != null) {
                        System.out.println(empleado2.getNombre() + " - Pago: $" + empleado2.calcularPago());
                    }

                    if (empleado3 != null) {
                        System.out.println(empleado3.getNombre() + " - Pago: $" + empleado3.calcularPago());
                    }

                    System.out.println("------------------------");

                    break;

                case 5:
                    System.out.println("Saliendo del sistema.");
                    salir = true;
                    break;

                default:
                    System.out.println("Seleccione una opcion valida.");
                    break;
            }
        }
    }


    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1. Agregar empleado tiempo completo.");
        System.out.println("2. Agregar empleado por hora.");
        System.out.println("3. Agregar empleado contratista.");
        System.out.println("4. Mostrar pogos de empleados.");
        System.out.println("5. Salir.");
        System.out.println("Seleccione una opcion: ");
    }

}

