package Models;

import Enums.Marcas;
import Enums.TipoProductos;
import Enums.TipoUsuario;
import Interfaces.Icliente;

import java.util.List;

public class Cliente extends Usuario implements Icliente {
    private String nombre;

    public Cliente(TipoUsuario tipo, String nombre) {
        super(tipo);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                "} " + super.toString();
    }


    @Override
    public void productosPorCategoria(List<Producto> productos, TipoProductos o) {
        for (Producto p:productos){
            if(p.getCategoria().equals(o)){
                System.out.println(p);
            }
        }
    }

    @Override
    public void productosPorPrecio(List<Producto> productos, double limInf, double limSup) {
        for (Producto p:productos){
            if (p.getPrecio() > limInf &&
                    p.getPrecio() < limSup){
                System.out.println(p);
            }
        }
    }

    @Override
    public void celularesPorMarca(List<Producto> productos, Marcas o) {
        for (Producto p:productos){
            if(p instanceof Celular && p.getMarca().equals(o)){
                System.out.println(p);
            }
        }
    }
}
