public void triplicar(){
    Nodo actual = inicio;

    while(actual!=null){
        for(int i=0;i<2;i++){
	    Nodo nodo = new Nodo(actual.getDato(), actual.getSiguiente());
	    actual.setSiguiente(nodo);
	    actual=nodo;
	}

	actual=actual.getSiguiente();
    }
}
