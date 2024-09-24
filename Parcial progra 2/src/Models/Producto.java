package Models;

import Enums.Marcas;
import Enums.TipoProductos;

import java.util.UUID;

public abstract class Producto implements Comparable <Producto>{
    private UUID id;
    private String nombre;
    private TipoProductos categoria;
    private double precio;
    private Marcas marca;

    public Producto(String nombre, TipoProductos categoria, double precio, Marcas marca) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.marca = marca;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProductos getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoProductos categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Marcas getMarca() {
        return marca;
    }

    public void setMarca(Marcas marca) {
        this.marca = marca;
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.getPrecio(),o.getPrecio());
    }


    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", precio=" + precio +
                ", marca=" + marca +
                '}';
    }
}
