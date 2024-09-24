package Models;

import Enums.TipoUsuario;
import Interfaces.Iadmin;

import java.util.Collections;
import java.util.List;

public class Administrador extends Usuario implements Iadmin {
    private String user;

    public Administrador(TipoUsuario tipo, String user) {
        super(tipo);
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "user='" + user + '\'' +
                "} " + super.toString();
    }


    @Override
    public void listaPorPrecio(List<Producto> productos) {
        Collections.sort(productos);
    }

    @Override
    public void alta(List<Producto> productos, Producto a) {
        productos.add(a);
    }

    @Override
    public void baja(List<Producto> productos, Producto a) {
        productos.remove(a);
    }
}
