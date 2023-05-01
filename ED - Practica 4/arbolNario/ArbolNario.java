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
        ListaNodosArbolNario storage = new ListaNodosArbolNario();
        storage.insertar(raiz);
        IteradorAdelanteListaNodosArbolNario fwd = raiz.getHijos().getIteradorAdelante();
        while (fwd.hasNext()){
            NodoArbolNario nodoso = fwd.next();
            storage.insertar(nodoso);
            if(nodoso.getHijos().getNumElementos()>0){
                IteradorAdelanteListaNodosArbolNario patata = nodoso.getHijos().getIteradorAdelante();
                while(patata.hasNext()){
                    storage.insertar(patata.next());
                }
            }
        }
        IteradorAdelanteListaNodosArbolNario stor = storage.getIteradorAdelante();
        while(stor.hasNext()){
            System.out.print(stor.next().getDato() + " ");
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