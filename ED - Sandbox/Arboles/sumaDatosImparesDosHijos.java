public int sumaDatosImparesDosHijos(){
   return this.sumaDatosImparesDosHijosRec(raiz);
}

private int sumaDatosImparesDosHijosRec(NodoArbol nodo){
    int resultado=0;
    if (nodo == null){
        resultado = 0;
    }
    else if(nodo.getDato() % 2 !=0 && nodo.getIzquierdo() != null && nodo.getDerecho() != null){
        resultado+=nodo.getDato(); 
    }
    else{
        resultado = sumaDatosImparesDosHijosRec(nodo.getIzquierdo()) + sumaDatosImparesDosHijosRec(nodo.getDerecho());
    }
    return resultado;
}
