package libro;

import java.util.ArrayList;


public class Libros {

   private ArrayList<Libro> libros;

   public Libros(){
       this.libros = new ArrayList<>();
   }

   public String agregarLibro(Libro nuevo){
       String mensaje;
       if(nuevo != null){
           libros.add(nuevo);
           mensaje = "Libro cargado con exito.";
       }else{
           mensaje = "Error.";
       }
       return mensaje;
   }

   public String eliminarLibro(Libro libro){
       String mensaje;
       if(libro != null){
           libros.remove(libro);
           mensaje = "Libro eliminado con exito.";
       }else {
           mensaje = "Libro no encontrado.";
       }
       return mensaje;
   }

   public void mostrarTodos(){
       for (Libro aux: libros){
           System.out.println(aux.toString());
       }
   }

   public int obtenerPos(String titulo){
       Libro aux = new Libro();
       aux.setTitulo(titulo);
       int pos = libros.indexOf(aux);
       return pos;
   }

   public Libro buscarPorTitulo(String titulo){
       int pos = obtenerPos(titulo);
       return libros.get(pos);
   }

   public void actualizarPrecioDelLibro(String titulo, double precio){
       int pos = obtenerPos(titulo);
       Libro aux = new Libro();
       aux = libros.get(pos);
       aux.setPrecio(precio);
       libros.set(pos,aux);
   }

   public double precioTotal(){
       double total = 0;
       for(Libro aux : libros){
           total += aux.getPrecio();
       }
       return total;
   }

   public int contarTotal(){
       return libros.size();
   }

   public Libro obtenerMasCaro(){
        Libro masCaro = new Libro();
        masCaro = libros.get(0);
        for (Libro aux : libros){
            if(aux.getPrecio()>masCaro.getPrecio()){
                masCaro = aux;
            }
        }
        return masCaro;
   }

   public Libro obtenerMasBarato(){
       Libro masBarato = new Libro();
       masBarato = libros.get(0);
       for(Libro aux : libros){
           if(aux.getPrecio()<masBarato.getPrecio()){
               masBarato = aux;
           }
       }
       return masBarato;
   }


}
