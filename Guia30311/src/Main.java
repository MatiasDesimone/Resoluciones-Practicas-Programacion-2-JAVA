import transporte.*;

public class Main {
    public static void main(String[] args) {


        Autobus vehiculo1 = new Autobus(ETipoVehiculo.AUTOBUS,522,30);
        Tranvia vehiculo2 = new Tranvia(ETipoVehiculo.TRANVIA,"Centro",40);
        Bicicleta vehiculo3 = new Bicicleta(ETipoVehiculo.BICICLETA,"1a2b3c4d");

        System.out.println("Arrancar:");
        System.out.println(vehiculo1.arrancar());
        System.out.println(vehiculo2.arrancar());
        System.out.println(vehiculo3.arrancar());

        System.out.println("\nDetenerse:");
        System.out.println(vehiculo1.detener());
        System.out.println(vehiculo2.detener());
        System.out.println(vehiculo3.detener());

        System.out.println("\nCapacidad:");
        System.out.println("La capacidad del vehiculo es: "+ vehiculo1.obtenerCapacidad());
        System.out.println("La capacidad del vehiculo es: "+ vehiculo2.obtenerCapacidad());
        System.out.println("La capacidad del vehiculo es: "+ vehiculo3.obtenerCapacidad());

        System.out.println(vehiculo1);
        System.out.println(vehiculo2);
        System.out.println(vehiculo3);
    }
}