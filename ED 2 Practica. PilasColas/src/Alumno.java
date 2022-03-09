public class Alumno {

    private String Nombre, Matricula;

    private double calificacionMedia;

    private int numAsignaturas;

    Pila asignaturas;

    public Alumno(String nombre, String matricula) {

        Nombre = nombre;
        Matricula = matricula;
        this.calificacionMedia = 0;
        asignaturas = new Pila();
    }

    public String getNombre() {

        return Nombre;
    }

    public void setNombre(String nombre) {

        Nombre = nombre;
    }

    public double getCalificacionMedia() {

        return calificacionMedia;
    }

    public void anadirAsignatura(Asignatura asignatura) {


        asignaturas.apilar(asignatura);

        numAsignaturas = asignaturas.getNumElementos();

        calificacionMedia = (this.calificacionMedia * (this.numAsignaturas - 1) + asignatura.getCalificacion()) / this.numAsignaturas;


    }

    public int getNumAsignaturas() {

        return numAsignaturas;
    }

    public void mostrarAlumno() {

        System.out.println(Nombre + ". " + "Matr: " + Matricula + " " + "(" + calificacionMedia + ")");

        if (asignaturas.vacia()) {
            System.out.println("No está matriculado en ninguna asignatura");
        }
        else {
            asignaturas.mostrar();
        }


    }


}
