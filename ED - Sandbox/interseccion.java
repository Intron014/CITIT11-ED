public ListaOrdinal iterseccion(ListaOrdinal lista1, ListaOrdinal lista2){
    ListaOrdinal lisfin = new ListaOrdinal();
    Iterador it1 = lista1.getIterador();
    int x=0;
    while(it1.hasNext()){
        x=it1.next();
	if(lista2.contiene(x)&&!lisfin.contiene(x)){
	    lisfin.insertar(x);
	}
    }
    return lisfin;
}
