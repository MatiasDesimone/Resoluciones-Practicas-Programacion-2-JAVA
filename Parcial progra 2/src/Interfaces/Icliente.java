package Interfaces;

import Enums.Marcas;
import Enums.TipoProductos;
import Models.Producto;

import java.util.List;

public interface Icliente {
    void productosPorCategoria(List<Producto> productos, TipoProductos o);
    void productosPorPrecio(List<Producto> productos, double limInf, double limSup);
    void celularesPorMarca(List<Producto> productos, Marcas o);
}
