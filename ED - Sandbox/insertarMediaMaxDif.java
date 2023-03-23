public void insertarMediaMaxDif(){
    Nodo actual = inicio;
    int max = 0;
    int dif = 0;

    while(actual!=null && actual.getSiguiente()!=null){
        dif = actual.getSiguiente().getDato() - actual.getDato();
	if(dif > max){
	    max = dif;
	}
    }

    actual = inicio;
    
    while(actual!=null && actual.getSiguiente()!=null){
        if((actual.getSiguiente().getDato() - actual.getDato())==max){
	    Nodo nuevo = new Nodo((actual.getDato()+actual.getSiguiente().getDato())/2, new Alumno("Patata", "Direccion"), actual.getSiguiente());
	    actual.setSiguiente(nuevo);
	    actual=actual.getSiguiente().getSiguiente();
	}
	else{
	    actual=actual.getSiguiente();
	}
    }
}
