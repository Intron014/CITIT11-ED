public int numeroComponentesConexas(GrafoMA g1){
	int resul=0;
	boolean[] visitados = new boolean[g1.getNumVertices()];
	for(int i=0;i<g1.getNumVertices();i++){
		visitados[i]=false;
	}
	for(int i=0;i<g1.getNumVertices();i++){
		if(!visitados[i]){
			g1.recorridoEnProfundidad(i, visitados);
			resul++;
		}
	}
	return resul;
}
