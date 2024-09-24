package Models;

import Enums.Marcas;
import Enums.TipoProductos;
import Interfaces.IConectividad;

public class Computadora extends Producto implements IConectividad {
    private int ram;

    public Computadora(String nombre, TipoProductos categoria, double precio, Marcas marca, int ram) {
        super(nombre, categoria, precio, marca);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    @Override
    public String conectar() {
        return "Conectando a wifi";
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "ram=" + ram +
                "} " + super.toString();
    }
}
