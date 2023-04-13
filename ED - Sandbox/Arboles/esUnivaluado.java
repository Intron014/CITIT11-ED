public boolean esUnivaluado(){
    return esUnivaluadoRec(raiz);
}

private boolean esUnivaluadoRec(NodoArbol nodo){
    boolean resultado;
    if(nodo == null){
        resultado = true;
    }
    else if(nodo.getDerecho()!=null&&nodo.getIzquierdo==null){
        if(nodo.getDato() == nodo.getDerecho().getDato){
	    resultado = this.esUnivaluadoRec(nodo.getDerecho());
	}
    }
    else if(nodo.getDerecho==null && nodo.getIzquierdo!=null){
        if()
    }
    else if(nodo.getDerecho!=null && nodo.getIzquierdo!=null){
        if()
    }
    else if(nodo.getDerecho==null && nodo.getIzquiedo==null){
    	if()
    }
}
