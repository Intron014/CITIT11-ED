public void duplicarParesQuitarImpares(){
    Nodo actual = inicio;
    Nodo anterior = null;
    while (actual!=null){
	if(actual.getData() %2 == 0){
	    Nodo duplicar = new Nodo(actual.getDato(),actual.getSiguiente());
	    actual.setSiguiente(duplicar);
	    actual = nuevo.getSiguiente();
	    anterior = duplicar;
	}
	else{
	    if(actual != inicio){
	        anterior.setSiguiente(actual.getSiguiente);
	    }
	    else{
	        inicio=actual.getSiguiente;
	    }
	    actual=actual.getSiguiente;
	}
}
