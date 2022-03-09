public class AlgoritmosCola {

    public void mostrarGrupo(Cola grupo) {

        Alumno auxiliar = null;


        System.out.println("El grupo contiene " + grupo.getNumElementos() + " alumnos");
        for (int i = 1; i <= grupo.getNumElementos(); i++) {
            auxiliar = grupo.desencolar();
            grupo.encolar(auxiliar);
            System.out.println(i + ". " + auxiliar.getNombre());

        }
        grupo.encolar(auxiliar);

    }

    public Cola alumnosAprobados(Cola grupo) {

        Alumno auxiliar = null;
        Cola alumnosAprobados = new Cola();

        for (int i = 1; i < grupo.getNumElementos(); i++) {
            auxiliar = grupo.desencolar();
            if (auxiliar.getCalificacionMedia() >= 5) {
                alumnosAprobados.encolar(auxiliar);
            }
            grupo.encolar(auxiliar);
        }
        grupo.encolar(auxiliar);


        return alumnosAprobados;
    }

    public double calificaciónMedia(Cola grupo) {

        double resultado = 0;
        Alumno auxiliar = null;
        double sumaNotas = 0;
        double numAsignaturasTotal = 0;
        int contador = 0;


        while (grupo.getNumElementos() - contador != 0) {
            contador += 1;
            auxiliar = grupo.desencolar();
            numAsignaturasTotal = numAsignaturasTotal + auxiliar.getNumAsignaturas();
            sumaNotas = sumaNotas + (auxiliar.getCalificacionMedia() * auxiliar.getNumAsignaturas());
            grupo.encolar(auxiliar);
        }
        resultado = sumaNotas / numAsignaturasTotal;


        return resultado;
    }

}
