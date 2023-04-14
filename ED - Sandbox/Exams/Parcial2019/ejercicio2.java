public void eliminarRepetidos(int dato){
	Nodo actual = inicio;
	Nodo anterior = null;
	boolean found;
	while(actual!=null){
		if(actual.getDato()==dato){
			if(found==false){
				found=true;
			}
			else{
				anterior.setSiguiente(actual.getSiguiente());
				actual = actual.getSiguiente();
			}
		}
		else{
			anterior = actual;
			actual=actual.getSiguiente();
		}
	}
}
