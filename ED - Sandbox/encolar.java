public void encolar(int prioridad, String paciente){
    Nodo actual = inicio
    Nodo anterior = null;

    while(actual!=null&&actual.getPrioridad()<= prioridad){
        anterior=actual;
	actual=actual.getSiguiente();
    }
    Nodo nuevo = new Nodo(prioridad, paciente, actual);
    if(actual==inicio){
        inicio=nuevo;
    }else{
        anterior.setSiguiente(nuevo);
    }

}
