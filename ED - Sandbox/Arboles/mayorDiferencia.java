public int mayorDiferencia(){
	int diff = 0;
	if(raiz!=null){
		NodoArbol menor = raiz;
		NodoArbol mayor = raiz;
		while(menor.getIzquierdo()!=null){
			menor = menor.getIzquierdo();
		}

		while(mayor.getDerecho()!=null){
			mayor = mayor.getDerecho();
		}
		diff = mayor.getClave() - menor.getClave();
	}
	return diff;
}

