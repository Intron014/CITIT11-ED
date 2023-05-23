public void moverAlFinal(int dato){
	Nodo actual = inicio;
	Nodo anterior = null;
	while(actual!=null){
		if(actual.getDato()==dato){
			if(actual != fin){
				if(actual==inicio){
                inicio=actual.getSiguiente();
            	}
				else{
				anterior.setSiguiente(actual.getSiguiente());
				}
				actual.setSiguiente(null)
				fin.setSiguiente(actual);
				fin=actual;
			}
		}
		else{
			anterior = actual;
			actual = actual.getSiguiente();
		}
	}
}
