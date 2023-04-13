public boolean igual(Arbol arbol){
    return this.igualRec(arbol.raiz, this.raiz);
}

private boolean igualRec(NodoArbol r1, NodoArbol r2 ){
    boolean resultado;
    if(r1 == null &&  r2 == null){
        resultado = true;
    }
    else if (r1.getDato() == r2.getDato()){
        resultado = true;
    }
    else{
        resultado = this.igualRec(r1.getIzquierdo(), r2.getIzquierdo()) && this.iguaRec(r1.getDerecho(), r2.getDerecho());
    }
    else{
        resultado = false;
    }

    return resultado;
}
