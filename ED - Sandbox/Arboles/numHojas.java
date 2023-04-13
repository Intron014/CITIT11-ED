public int numHojas(){
    return this.numHojasRec(raiz);
}

private int numHojasRec(NodoArbol nodo){
    int resultado;
    if(nodo == null){
        resultado = 0;
    }
    else if(nodo.getDerecho() == null && nodo.getIzquierdo() == null){
        resultado = 1;
    }
    else{
        resultado = this.numHojasRec(nodo.getIzquierdo()) + this.numHojasRec(nodo.getDerecho());
    }
    return resultado;
}
