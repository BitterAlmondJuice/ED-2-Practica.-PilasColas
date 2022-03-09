public class AlgoritmosPila {

    public Asignatura asignaturaNotaMaxima(Pila asignaturas) {

        AlgoritmosPila aux = new AlgoritmosPila();
        Asignatura nombre = new Asignatura("", 0);
        nombre = aux.asignaturaNotaMaxima(asignaturas, nombre);
        return nombre;
    }

    public Asignatura asignaturaNotaMaxima(Pila asignaturas, Asignatura nombre) {

        AlgoritmosPila aux = new AlgoritmosPila();
        if (asignaturas.getNumElementos() >= 1) {
            Asignatura auxiliar = asignaturas.desapilar();
            if (nombre.getCalificacion() < auxiliar.getCalificacion()) {
                nombre = auxiliar;
                nombre.setNombre(auxiliar.getNombre());
                nombre.setCalificacion(auxiliar.getCalificacion());

            }
            nombre = aux.asignaturaNotaMaxima(asignaturas, nombre);
            asignaturas.apilar(auxiliar);
        }
        return nombre;
    }

    public double notaMinima(Pila asignaturas, double resultado) {

        AlgoritmosPila aux = new AlgoritmosPila();
        if (asignaturas.getNumElementos() >= 1) {
            Asignatura auxiliar = asignaturas.desapilar();
            if (auxiliar != null) {
                if (auxiliar.getCalificacion() < resultado) {
                    resultado = auxiliar.getCalificacion();
                }
                resultado = aux.notaMinima(asignaturas, resultado);
                asignaturas.apilar(auxiliar);
            }
        }
        return resultado;
    }

    public double notaMinima(Pila asignaturas) {

        AlgoritmosPila aux = new AlgoritmosPila();
        double resultado = aux.notaMinima(asignaturas, 9999);
        return resultado;
    }


    public void mostrarAprobadas(Pila asignaturas) {

        AlgoritmosPila aux = new AlgoritmosPila();
        if (asignaturas.getNumElementos() >= 1) {
            Asignatura auxiliar = asignaturas.desapilar();

            if (auxiliar.getCalificacion() >= 5) {
                System.out.println(auxiliar.mostrar());
            }
            aux.mostrarAprobadas(asignaturas);
            asignaturas.apilar(auxiliar);

        }
    }

}
