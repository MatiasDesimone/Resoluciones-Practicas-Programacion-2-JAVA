

public class Main {
    public static void main(String[] args) {

        Colegio colegio = new Colegio();

        try {
            Alumno alumno1 = new Alumno("jose", "tano");
            Alumno alumno2 = new Alumno("pepe", "Arg");
            Alumno alumno3 = new Alumno("Juan", "chileno");

            colegio.agregarAlumno(alumno1);
            colegio.agregarAlumno(alumno2);
            colegio.agregarAlumno(alumno3);

            colegio.verNacionalidad("Arg");
            colegio.cuantos();
            colegio.verTodos();
            colegio.borrar(alumno2);
            colegio.verTodos();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}