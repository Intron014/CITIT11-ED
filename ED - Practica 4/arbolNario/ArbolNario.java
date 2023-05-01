package arbolNario;

public class ArbolNario {

    private NodoArbolNario raiz;

    public ArbolNario(int dato) {
        raiz = new NodoArbolNario(dato);
    }

    public void insertar(ArbolNario arbol) {
        raiz.getHijos().insertar(arbol.raiz);
    }

    // ------------------------------------------------------------------------
    // TODO 2.2: Mostrar el arbol recorriendo en profundidad de forma RECURSIVA
    public void mostrarProfundidadRecursivo() {
        System.out.print("Profundidad Recursivo: ");
        mostrarProfundidadRecursivoRec(raiz);
        System.out.println();
    }

    private void mostrarProfundidadRecursivoRec(NodoArbolNario nodo){
        System.out.print(nodo.getDato() + " " );
        IteradorAdelanteListaNodosArbolNario fwd = nodo.getHijos().getIteradorAdelante();
        while(fwd.hasNext()){
            NodoArbolNario nodoso;
            nodoso = fwd.next();
            this.mostrarProfundidadRecursivoRec(nodoso);
        }
    }

    // ------------------------------------------------------------------------
    // TODO 2.3: Mostrar el arbol recorriendo en profundidad de forma ITERATIVA
    public void mostrarProfundidadIterativo() {
        System.out.print("Profundidad Iterativo: ");
        PilaNodosArbolNario storage = new PilaNodosArbolNario();
        NodoArbolNario nodoso;
        IteradorAtrasListaNodosArbolNario fwd = this.raiz.getHijos().getIteradorAtras();
        while (fwd.hasPrevious()){
            nodoso = fwd.previous();
            if(nodoso.getHijos().getNumElementos()>0){
                IteradorAtrasListaNodosArbolNario patata = nodoso.getHijos().getIteradorAtras();
                while(patata.hasPrevious()){
                    storage.apilar(patata.previous());
                }
            }
            storage.apilar(nodoso);
        }
        storage.apilar(raiz);
        while(!storage.vacia()){
            System.out.print(storage.desapilar().getDato() + " ");
        }
        System.out.println();
    }

    // ------------------------------------------------------------------------
    // TODO 2.4: Mostrar el arbol recorriendo en amplitud de forma ITERATIVA
    public void mostrarAmplitud() {
        System.out.print("Amplitud: ");

        System.out.println();
    }
}