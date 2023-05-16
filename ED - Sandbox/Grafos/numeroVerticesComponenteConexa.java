public int numeroVerticesComponenteConexa(GrafoMA g, int v){
	boolean[] visitados = new boolean[g.getNumVertices()];
	for(int i=0;i<g.getNumVertices();i++){
		visitados[i]=false;
	}
	recorridoEnProfundidad(v, visitados);
	int result=0;
	for(int j=0;j<g.getNumVertices;j++){
		if(visitados[j]){
			result++;
		}
	}
	return result;
}
