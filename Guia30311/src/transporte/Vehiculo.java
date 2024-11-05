package transporte;

public abstract class Vehiculo {

    private ETipoVehiculo tipoVehiculo;

    public Vehiculo(ETipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public ETipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(ETipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

}
