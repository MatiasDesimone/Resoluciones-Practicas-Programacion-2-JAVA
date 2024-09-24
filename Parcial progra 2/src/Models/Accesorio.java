package Models;

import Enums.Marcas;
import Enums.TipoAccs;
import Enums.TipoProductos;

public class Accesorio extends Producto {
    private TipoAccs tipo;

    public Accesorio(String nombre, TipoProductos categoria, double precio, Marcas marca, TipoAccs tipo) {
        super(nombre, categoria, precio, marca);
        this.tipo = tipo;
    }

    public TipoAccs getTipo() {
        return tipo;
    }

    public void setTipo(TipoAccs tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Accesorio{" +
                "tipo=" + tipo +
                "} " + super.toString();
    }
}
