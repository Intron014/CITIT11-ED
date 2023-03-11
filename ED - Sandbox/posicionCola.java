public class posicionCola {
    public int posicionCola(Cola cola, int dato) {
        int resultado = -1;
        int nE = cola.getNumElementos();
        for (int i = 0; i < nE; i++) {
            int elemento = cola.desencolar();
            cola.encolar(elemento);
            if (elemento == dato && resultado == -1) {
                resultado = i;
            }
        }
        return resultado;
    }
}