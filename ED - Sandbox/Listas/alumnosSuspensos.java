public ListaCalificada alumnosSuspensos(){
    Nodo actual = inicio;
    ListaCalificada result = new ListaCalificada();
    Nodo ultimo=null;
    while(actual!=null){
	Alumno alumno = actual.getDato();
        if(alumno.getCalificacion()<5){
	    Nodo nodoso = new Nodo(actual.getDato(), alumno, null);
	    ultimo.setSiguiente(nodo);

	    if(alumnosSuspensos.vacia()){
	        alumnosSuspensos.inicio = nodo;
	    }else{
	        ultimo.setSiguiente(nodo);
	    }
	    ultimo = nodo;
	    result.numElementos++;
	}
	actual=actual.getSiguiente();
    }
    return result
}
