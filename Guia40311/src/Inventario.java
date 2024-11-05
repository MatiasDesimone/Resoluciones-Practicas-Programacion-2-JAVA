import libro.Libro;
import libro.Libros;

public class Inventario {
    public static void main(String[] args) {

        Libros stock = new Libros();

        Libro libro1 = new Libro("Cien años de soledad","Gabriel Garcia Marquez", 15000, 2020);
        Libro libro2 = new Libro("Harry Potter","Jk. Rowling", 17000, 2005);
        Libro libro3 = new Libro("1984","George Orwell", 21000, 1984);

        System.out.println(stock.agregarLibro(libro1));
        System.out.println(stock.agregarLibro(libro2));
        System.out.println(stock.agregarLibro(libro3));
        System.out.println("\n");

        System.out.println(stock.eliminarLibro(libro1));
        System.out.println("\n");

        stock.mostrarTodos();
        System.out.println("\n");

        Libro libroBuscado = new Libro();
        libroBuscado = stock.buscarPorTitulo("Harry Potter");
        System.out.println("Libro buscado: ");
        System.out.println(libroBuscado.toString());
        System.out.println("\n");

        stock.actualizarPrecioDelLibro("1984", 30000);
        System.out.println("Precio actualizado.");
        stock.mostrarTodos();
        System.out.println("\n");

        double total = stock.contarTotal();
        System.out.println("La cantidad total: "+ total);
        System.out.println("\n");

        Libro masCaro = new Libro();
        masCaro = stock.obtenerMasCaro();
        System.out.println("El libro mas caro es: "+ masCaro);
        System.out.println("\n");

        Libro masBarato = new Libro();
        masBarato = stock.obtenerMasBarato();
        System.out.println("El libro mas barato es: "+ masBarato);
        System.out.println("\n");
    }
}