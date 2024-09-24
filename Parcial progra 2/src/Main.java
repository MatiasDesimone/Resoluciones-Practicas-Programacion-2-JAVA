import Enums.Marcas;
import Enums.TipoProductos;
import Enums.TipoUsuario;
import Models.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TiendaElectronica tienda = new TiendaElectronica();
        Administrador admin = new Administrador(TipoUsuario.ADMINISTRADOR, "Mazikeen");

        admin.alta(tienda.getInventario(),new Celular("A 71", TipoProductos.CELULAR, 2000, Marcas.SAMSUNG, 500));
        admin.alta(tienda.getInventario(),new Celular("A 72", TipoProductos.CELULAR, 1000, Marcas.SAMSUNG, 500));
        admin.alta(tienda.getInventario(),new Celular("A 73", TipoProductos.CELULAR, 5000, Marcas.SAMSUNG, 500));
        admin.alta(tienda.getInventario(),new Celular("A 74", TipoProductos.CELULAR, 500, Marcas.SAMSUNG, 500));

        Cliente cliente = new Cliente(TipoUsuario.CLIENTE, "Jorge");
        System.out.println("Mostrando productos x categoria:");
        cliente.productosPorCategoria(tienda.getInventario(), TipoProductos.CELULAR);


    }
}