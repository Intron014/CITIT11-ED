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
        else{
            resultado = false;
        }
    }
    else if(nodo.getDerecho==null && nodo.getIzquierdo!=null){
        if(nodo.getDato() == nodo.getIzquierdo().getDato){
            resultado = this.esUnivaluadoRec(nodo.getIzquierdo);
        }
        else{
            resultado = false;
        }
    }
    else if(nodo.getDerecho!=null && nodo.getIzquierdo!=null){
        if(nodo.getDato()==nodo.getIzquierdo().getDato&&nodo.getDato()==nodo.getDerecho().getDato){
            resultado = this.esUnivaluadoRec(nodo.getDerecho)&&this.esUnivaluadoRec(nodo.getIzquierdo);
        }
        else{
            resultado = false;
        }
    }
    return resultado;
}
