package transporte;

public class Bicicleta extends Vehiculo implements ITransporte {

    private String numeroSerie;

    public Bicicleta(ETipoVehiculo tipoVehiculo, String numeroSerie) {
        super(tipoVehiculo);
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String arrancar() {
        return "La bicicleta esta en marcha.";
    }

    @Override
    public String detener(){
        return "La bicicleta se detuvo.";
    }

    @Override
    public int obtenerCapacidad(){
        return 1;
    }

    public void ajustarAsiento(int altura){
        System.out.println("El asiento se ajusto a "+altura+ " centimetros");
    }

    @Override
    public String toString() {
        return "\n-------------Bicicleta-------------" +
                "\nnumeroSerie: " + numeroSerie +
                 "\ncapacidad : " + 1;
    }
}
