private Pila quitarPosicionesPares(Pila pila, int pos){
	if(!pila.vacia()){
		int item = pila.desapilar();
		pos ++
		Pila resultado = this.quitarPosicionesPares(pila, pos);
		if(pos%2==0){
		    resultado.apilar(item);
		}
		else{
			pila.apilar(item);
		}
	}
	else{
		return resultado;
	}
}

public Pila quitarPosicionesPares(Pila pila){
	return quitarPosicionesPares(pila, 0);
}
