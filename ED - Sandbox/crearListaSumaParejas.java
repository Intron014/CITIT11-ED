public ListaOrdinal crearListaSumaParejas(){
    ListaOrdinal sumas = new ListaOrdinal();

    Nodo nodoso = inicio;
    Nodo nododos = null;

    while(nodoso!=null&&nodoso.getSiguiente()!=null){
        int suma = 0;
	suma+=nodoso.getDato();
	nodoso=nodoso.getSiguiente();
	suma+=nodoso.getDato();
	Nodo nuevo = new Nodo(suma, null);
	if(inicio.sumas==null){
	    sumas.inicio=nuevo;
	}
	nododos=sumas.inicio;
	else{
	    nododos.setSiguiente(nuevo);
	    nododos=nododos.getSiguiente();
	}

    }
}
