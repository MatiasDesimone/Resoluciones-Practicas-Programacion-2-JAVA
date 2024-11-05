package transporte;

public class Tranvia extends Vehiculo implements ITransporte{

    private String ruta;
    private int capacidad;

    public Tranvia(ETipoVehiculo tipoVehiculo, String ruta, int capacidad) {
        super(tipoVehiculo);
        this.ruta = ruta;
        this.capacidad = capacidad;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String arrancar(){
        return "El tranvia esta en marcha.";
    }

    @Override
    public String detener(){
        return "El tranvia se detuvo.";
    }

    @Override
    public int obtenerCapacidad(){
        return this.capacidad;
    }

    public void cambiarVia(int nuevaVia){
        System.out.println("El tren cambio a la via "+ nuevaVia);
    }

    @Override
    public String toString() {
        return "\n-------------Tranvia-------------" +
                "\nruta: " + ruta +
                "\ncapacidad: " + capacidad;
    }
}
