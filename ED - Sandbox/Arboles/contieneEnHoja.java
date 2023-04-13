public boolean contieneEnHoja(int dato){
    return this.contieneEnHojaRec(raiz, dato);
}

private boolean contieneEnHojaRec(NodoArbol nodo, int dato){
    boolean resultado;
    if(nodo == null){
        resultado = false;
    }
    else if(nodo.getDato() == dato && nodo.getDerecho() == null && nodo.getIzquierdo() == null){
        resultado == true; //Encontrado
    }
    else{
        resultado = this.contieneEnHojaRec(nodo.getIzquierdo(), dato)||this.contieneEnHojaRec(nodo.getDerecho(), dato);
    }
    return resultado;
}
