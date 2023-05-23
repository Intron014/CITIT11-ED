public boolean subArbolesSumanIgual(int c1, int c2){
	boolean result = false;
	//Buscamos el nodo
	NodoArbol c1 = searchNodo(raiz, c1);
	NodoArbol c2 = searchNodo(raiz, c2);

	//Sumamos hijos
	int sum1 = sumaClaves(c1);
	int sum2 = sumaClaves(c2);

	//Comprobamos la suma
	if(sum1==sum2){
		result = true;
	}

	return result;
}

private NodoArbol searchNodo(NodoArbol nodo, int clave){
	NodoArbol resultado = null;
	if(nodo!=null){
		if(nodo.getClave == clave){
			resultado =  nodo;
		}
		else if(nodo.getClave < clave){
			resultado = searchNodo(nodo.getDerecho(), clave);
		}
		else if(nodo.getClave > clave){
			resultado = searchNodo(nodo.getIzquierdo(), clave);
		}
	}
	return resultado;
}

