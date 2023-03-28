public boolean contiene(int valor){
    Nodo actual = inicio;
    Nodo anterior = null;
    while(actual!=null&&actual.getDato()!=valor){
        anterior=actual;
	actual=actual.getSiguiente();
    }
    if(actual!=null&&anterior!=null){
        anterior.setSiguiente(actual.getSiguiente());
	actual.setSiguiente(inicio);
	inicio=actual;
    }
    else{
        return actual != null
    }
}
