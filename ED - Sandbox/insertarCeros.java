public void insertarCeros(){
    int suma=0;
    Nodo actual=inicio;
    while(actual!=null){
        suma+=actual.getDato();
	actual=actual.getSiguiente();
    }
    actual=inicio;
    while(actual!=null){
        if(actual.getDato()!=suma){
	    actual=actual.getSiguiente();
	}
	else{
	    Nodo nuevo = new Nodo (0, actual.getSiguiente());
	    actual.setSiguiente(nuevo);
	    actual=nuevo.getSiguiente();
	}
    }
}
