package Models;

import Enums.Marcas;
import Enums.TipoProductos;
import Interfaces.IConectividad;

public class Celular extends Producto implements IConectividad {
    private int almacenamiento;

    public Celular(String nombre, TipoProductos categoria, double precio, Marcas marca, int almacenamiento) {
        super(nombre, categoria, precio, marca);
        this.almacenamiento = almacenamiento;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String conectar() {
        return "Conectando a Bluethoot.";
    }

    @Override
    public String toString() {
        return "Celular{" +
                "almacenamiento=" + almacenamiento +
                "} " + super.toString();
    }
}
