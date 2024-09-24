package Interfaces;

import Models.Producto;

import java.util.List;

public interface Iadmin {
    void listaPorPrecio(List<Producto> productos);
    void alta(List<Producto> productos, Producto a);
    void baja(List<Producto> productos, Producto a);
}
