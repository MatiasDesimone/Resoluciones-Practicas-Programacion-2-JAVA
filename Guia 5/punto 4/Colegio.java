import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colegio {

    List<Alumno>alumnos;


    public Colegio(){
        this.alumnos = new ArrayList<>();
    }

    public Colegio(int size){
        this.alumnos = new ArrayList<>(size);
    }


    public void agregarAlumno(Alumno al){
        if(al == null){
            throw new IllegalArgumentException("Error. El alumno no puede ser nulo.");
        }
        if(al.getNombre() == null || al.getNombre().isEmpty() || al.getNacionalidad() == null || al.getNacionalidad().isEmpty()){
            throw new IllegalArgumentException("Error. El alumno debe tener un nombre y una nacionalidad.");
        }
        if (alumnos.contains(al)){
            throw new IllegalArgumentException("Error. El alumno ya existe en la lista.");
        }
        alumnos.add(al);
        System.out.println("El alumno se añadio correctamente. ");
    }

    public void verNacionalidad(String nacionalidad){
        if(nacionalidad==null || nacionalidad.isEmpty()){
            throw new IllegalArgumentException("Error. La nacionalidad está vacía.");
        }
        int contador = 0;
        for (Alumno aux : alumnos){
            if(nacionalidad == aux.getNacionalidad()){
                contador++;
            }
        }
        System.out.println("Alumnos con la misma nacionalidad: "+ contador +".");
    }

    public void cuantos(){
        Set<String> nacionalidadesUnicas = new HashSet<>();
        for (Alumno aux: alumnos){
            nacionalidadesUnicas.add(aux.getNacionalidad());
        }
        System.out.println("Numero de nacionalidades: "+ nacionalidadesUnicas.size());
    }

    public void borrar(Alumno al){
        if(al == null){
            throw new IllegalArgumentException("Error. El alumno no puede ser nulo.");
        }
        if(!alumnos.contains(al)){
            throw new IllegalArgumentException("Error. El alumno a borrar, no existe.");
        }
        alumnos.remove(al);
        System.out.println("Alumno eliminado.");
    }

    public void verTodos(){
        // se hace con hashmap q no lo va a tomar.
        for (Alumno aux:alumnos){
            System.out.println(aux.toString());
        }
    }


}
