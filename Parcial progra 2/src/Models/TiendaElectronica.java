package Models;

import Enums.Marcas;
import Enums.TipoProductos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TiendaElectronica {
    private List<Producto>inventario;

    public TiendaElectronica(){
        this.inventario = new ArrayList<>();
    }

    public TiendaElectronica(int size){
        this.inventario = new ArrayList<>(size);
    }

    public List<Producto> getInventario() {
        return inventario;
    }

    @Override
    public String toString() {
        return "TiendaElectronica{" +
                "inventario=" + inventario +
                '}';
    }
}
