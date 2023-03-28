public arrayEnListados(int[] elementos){
    inicio=null;
    Nodo ultimo = null;

    for(int i=0;i<elementos.length;i++){
        Nodo nuevo = new Nodo (elementos[i], null);
	if(último==null){
	    inicio=nuevo;
	}
	else{
	    ultimo.setSiguiente(ultimo);
	}
	ultimo=nuevo;
    }
}
