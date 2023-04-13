public int sumaDatosNivel(int nivel){
    return sumaDatosNivelRec(raiz, nivel);
}

private int sumaDatosNivelRec(NodoArbol nodo, int nivel){
    int resultado;
    if(nodo == null){
        resultado = 0;
    }
    else if(nivel==1){
        resultado = nodo.getDato();
    }
    else{
        resultado = this.sumaDatosNivelRec(nodo.getIzquierdo(), nivel-1)+this.sumaDatosNivelRec(nodo.getDerecho(), nivel-1);
    }
    return resultado;
}
