public void listInverter(){
    Nodo actual = inicio;
    inicio=null;

    while(actual !=null){
        actual.setSiguiente(inicio);
	inicio=actual;
	actual=actual.getSiguiente();
    }
}
