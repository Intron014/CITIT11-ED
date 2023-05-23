private boolean comprobarOrdenacion(Pila pila, int anterior){
    boolean resultado = true
    if(!pila.vacia)={
        p = 0
        p=pila.desapilar();
        if(p<anterior){
            resultado = false;
        }
	else{
            resultado=this.comprobarOrdenacion(pila, p);
        }
    }
    return resultado;
}

public boolean comprobarOrdenacion(Pila pila){
    return comprobarOrdenacion(pila, -1);
}
