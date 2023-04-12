public void duplicarInvertir(){
    Nodo actual = inicio;

    while(actual!=null){
        Nodo duplication = new Nodo (actual.getDato(), inicio);
	inicio=duplication;
	actual=actual.getSiguiente();
    }
}
