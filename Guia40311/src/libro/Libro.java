package libro;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int fechaPublicacion;

    public Libro(String titulo, String autor, double precio, int fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro() {
       this.titulo = "";
       this.autor = "";
       this.precio = 0;
       this.fechaPublicacion = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return  "\n--------------------Libro--------------------" +
                "\n>Titulo: " + titulo + "." +
                "\n>Autor: " + autor + "." +
                "\n>Precio: " + precio + "." +
                "\n>Fecha de Publicacion: " + fechaPublicacion + "." +
                "\n---------------------------------------------";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return titulo.equals(libro.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }
}
