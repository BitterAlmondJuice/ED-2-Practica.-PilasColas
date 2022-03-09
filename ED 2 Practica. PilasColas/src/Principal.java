public class Principal {

    public static void main(String[] args) {

        System.out.println("Practica ED Pilas y Colas de: " + "Fernando García Pérez");
        System.out.println("Numero Matricula: " + "BS0076");
        Principal pruebas = new Principal();

        Pila asignaturas = pruebas.prepararPila();
        pruebas.pruebasPila(asignaturas);

        System.out.println("-----------------------------------");

        Cola grupo = pruebas.prepararCola();
        pruebas.pruebasCola(grupo);
    }

    public Pila prepararPila() {

        Pila asignaturas = new Pila();
        Asignatura ffi = new Asignatura("Fundamentos Físicos de la Informática", 3.50);
        Asignatura ed = new Asignatura("Estructuras de Datos", 6.35);
        Asignatura aes = new Asignatura("Aspectos Éticos y Sociales", 7.70);
        Asignatura fs = new Asignatura("Fundamentos de seguridad", 6.75);
        asignaturas.apilar(ffi);
        asignaturas.apilar(ed);
        asignaturas.apilar(aes);
        asignaturas.apilar(fs);
        return asignaturas;
    }

    public void pruebasPila(Pila asignaturas) {


        asignaturas.mostrar(); //esto no funciona bien, estará seguramente relacionado con el metodo "mostrar" de la clase "pila"

        AlgoritmosPila algoritmosPila = new AlgoritmosPila();
        System.out.println("Calificación mínima:");
        System.out.println("    " + algoritmosPila.notaMinima(asignaturas));
        System.out.println("Asignatura con nota máxima:");
        System.out.println("    " + algoritmosPila.asignaturaNotaMaxima(asignaturas).getNombre());
        System.out.println("Asignaturas aprobadas:");
        algoritmosPila.mostrarAprobadas(asignaturas);


    }

    public Cola prepararCola() {

        Cola grupo = new Cola();
        Alumno a1 = new Alumno("Felipe Arias Gonzalez", "aa1253");
        Alumno a2 = new Alumno("Manuel Garcia Sacedón", "ax0074");
        Alumno a3 = new Alumno("Margarita Lopez Medina", "mj7726");
        Alumno a4 = new Alumno("Estela Sanchez Arellano", "bc2658");
        Asignatura ffi = new Asignatura("Fundamentos Físicos de la Informática", 3.50);
        Asignatura ed = new Asignatura("Estructuras de Datos", 6.35);
        Asignatura aes = new Asignatura("Aspectos Éticos y Sociales", 7.70);
        Asignatura fs = new Asignatura("Fundamentos de seguridad", 6.75);
        a1.anadirAsignatura(ed);
        ed = new Asignatura("Estructuras de Datos", 4.35);
        a2.anadirAsignatura(ed);
        ed = new Asignatura("Estructuras de Datos", 7.5);
        a3.anadirAsignatura(ed);
        ed = new Asignatura("Estructuras de Datos", 2.5);
        Asignatura algebra = new Asignatura("Álgebra", 5);
        a4.anadirAsignatura(algebra);
        a4.anadirAsignatura(fs);
        grupo.encolar(a1);
        grupo.encolar(a2);
        grupo.encolar(a3);
        grupo.encolar(a4);
        return grupo;
    }

    public void pruebasCola(Cola grupo) {


        Alumno auxiliar = null;

        AlgoritmosCola algoritmosCola = new AlgoritmosCola();
        algoritmosCola.mostrarGrupo(grupo);
        System.out.println("Calificación media del grupo: " + algoritmosCola.calificaciónMedia(grupo));
        System.out.println("");
        System.out.println("Alumnos aprobados:");
        System.out.println("Contenido del grupo:");

        Cola aprobados = algoritmosCola.alumnosAprobados(grupo);

        for (int i = 1; i < grupo.getNumElementos(); i++) {
            auxiliar = grupo.desencolar();
            auxiliar.mostrarAlumno();
            grupo.encolar(auxiliar);
        }
        grupo.encolar(auxiliar);

        System.out.println("Calificación media de los aprobados: "+ algoritmosCola.calificaciónMedia(aprobados));


    }


}
