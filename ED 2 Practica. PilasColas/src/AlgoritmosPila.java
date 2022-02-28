public class AlgoritmosPila {

    public Asignatura asignaturaNotaMáxima(Pila asignaturas) {

        Asignatura resultado = null;
        //Completar
        return resultado;
    }

    public double notaMínima(Pila asignaturas) {

        double resultado = 0;

        //aqui tengo que conseguir iterar sobre la pila y comparar los valores hasta conseguir el menor de toda la pila.
        //el problema por ahora es que no se como coño usar el getSiguiente() en los nodos de la pila, ya que son de clase Asignatura
        //una buena solucion seria ir desapilando la pila en cada iteracion y luego devolverla a su estado normal

        Pila auxiliar = asignaturas;

        double DobleAuxiliar = auxiliar.getCima().getCalificacion();

        //debe ser hecho de forma recursiva (los muertos pisoteados de la recursividad)


        //Completar
        return resultado;
    }


    public void mostrarAprobadas(Pila asignaturas) {
        //Completar
    }

}
