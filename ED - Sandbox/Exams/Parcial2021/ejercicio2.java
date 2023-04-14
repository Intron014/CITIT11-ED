public int numClavesContenidas(int[] claves){
	int contenido=0;
	int i=0;
	Nodo actual = inicio;
	while(actual!=null && i<claves.length){
		if(claves[i]<actual.getClave()){
			i++
		}
		if(claves[i]==actual.getClave()){
			contenido++;
			i++;
			actual = actual.getSiguiente();
		}
		if(claves[i]>actual.getClave()){
			actual = actual.getSiguiente();
		}
	}
	return contenido;
}
