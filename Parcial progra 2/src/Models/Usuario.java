package Models;

import Enums.TipoUsuario;

public abstract class Usuario {
    private TipoUsuario tipo;

    public Usuario(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "tipo=" + tipo +
                '}';
    }

}
