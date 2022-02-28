public class AlgoritmosPila {

    public Asignatura asignaturaNotaMáxima(Pila asignaturas) {

        Asignatura resultado = null;
        //Completar
        return resultado;
    }

    public double notaMínima(Pila asignaturas) {


        double resultado;

        //aqui tengo que conseguir iterar sobre la pila y comparar los valores hasta conseguir el menor de toda la pila.
        //el problema por ahora es que no se como coño usar el getSiguiente() en los nodos de la pila, ya que son de clase Asignatura
        //una buena solucion seria ir desapilando la pila en cada iteracion y luego devolverla a su estado normal


        double dobleAuxiliar1 = asignaturas.getCima().getCalificacion();
        double dobleAuxiliar2;
        asignaturas.quitarCima();
        if (asignaturas.getCima() == null) {
            dobleAuxiliar2 = dobleAuxiliar1;
            resultado = dobleAuxiliar1;
            return resultado;
        }
        else {
            dobleAuxiliar2 = asignaturas.getCima().getCalificacion();
        }


        /*debe ser hecho de forma recursiva (los muertos pisoteados de la recursividad)
        he pensado en incluir un nodo mas con valor 11, ya que la maxima nota es 10, para que se compare con la que seria la primera asignatura,
        quedando asi la nota de la primera asignatura guardada en la variable auxiliar y permitiendo asi la llamada recursiva */

        if (dobleAuxiliar1 < dobleAuxiliar2) {
            resultado = dobleAuxiliar1;
        }
        else {
            resultado = dobleAuxiliar2;
        }

        if (asignaturas.vacia() == true) {
            return resultado;
        }
        else {
            notaMínima(asignaturas);
        }

        /*tengo un problemilla, me da NullPointerException, probablemente porque en algun momento de la ejecucion la pila estara ya vacia e intentara */
        return resultado;
        //Completar

    }


    public void mostrarAprobadas(Pila asignaturas) {
        //Completar
    }

}
