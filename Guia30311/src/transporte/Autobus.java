package transporte;

public class Autobus extends Vehiculo implements ITransporte{

    private int numeroLinea;
    private int capacidad;

    public Autobus(ETipoVehiculo tipoVehiculo, int numeroLinea, int capacidad) {
        super(tipoVehiculo);
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String arrancar(){
        return "El bus esta en marcha.";
    }

    @Override
    public String detener(){
        return "El bus se detuvo.";
    }

    @Override
    public int obtenerCapacidad(){
        return this.capacidad;
    }

    public void anunciarParada(String parada){
        System.out.println("La proxima parada es: " + parada);
    }

    @Override
    public String toString() {
        return "\n-------------Autobus-------------" +
                "\nnumero Linea:" + numeroLinea +
                "\ncapacidad: " + capacidad;
    }

}
