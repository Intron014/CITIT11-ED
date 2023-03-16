public void eliminarRepetidos(int dato){
    Nodo actual = inicio;
    Nodo anterior = null;
    while(actual!=null&&actual.getDato()!=dato){
        anterior=actual;
	actual=actual.getSiguiente();
    }
    if(actual!=null){
        anterior=actual;
	actual=actual.getSiguiente();
    }
    while(actual!=null){
        if(actual.getDato()==dato){
	    anterior.setSiguiente(actual.setSiguiente);
	}
	else{
	    anterior = actual;
	}

	actual = actual.getSiguiente();
    }
}
